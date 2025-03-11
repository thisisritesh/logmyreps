package com.kaviriteshgupta.logmyreps

import android.content.Intent
import android.content.res.Resources.Theme
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kaviriteshgupta.logmyreps.player.WorkoutPlayerActivity
import com.kaviriteshgupta.logmyreps.ui.theme.LogMyRepsTheme
import com.kaviriteshgupta.logmyreps.ui.theme.bgColor
import com.kaviriteshgupta.logmyreps.ui.theme.primaryTextColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LogMyRepsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Log.d("SDCFBHJ", "onCreate: " + innerPadding)
                    MainScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }

        startActivity(Intent(this, WorkoutPlayerActivity::class.java))

    }
}


@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column(
        modifier
            .background(color = bgColor)
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 0.dp, 0.dp, 8.dp)
        ) {
            ScreenHeading(
                name = "Rohit",
                modifier = Modifier.align(alignment = Alignment.CenterStart)
            )
            Icon(
                imageVector = Icons.Filled.Menu,
                contentDescription = "",
                modifier = Modifier.align(alignment = Alignment.CenterEnd),
                tint = primaryTextColor
            )
        }
        Quote(
            quote = "And mand ka tola...",
        )

        Spacer(modifier = Modifier.size(60.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            InsightCard(
                iconRes = R.drawable.fire_svgrepo_com,
                label = "180",
                value = "Days Streak",
                modifier = Modifier.fillMaxWidth(.5f)
            )

            InsightCard(
                iconRes = R.drawable.weight_svgrepo_com,
                label = "58 kgs",
                value = "Body Weight",
                modifier = Modifier.fillMaxWidth(1f)
            )

        }

        Spacer(modifier = Modifier.size(40.dp))

        Subheading(txt = "Your Workout Plan")

        Spacer(modifier = Modifier.size(20.dp))

        PastDayCard(date = "23", month = "Mar")

        Spacer(modifier = Modifier.size(20.dp))

        CurrentDayCard(date = "343", month = "343") {
//            val intent = Intent(WorkoutPlayerActivity::class.java)
        }

        Spacer(modifier = Modifier.size(20.dp))

        UpcomingDayCard(date = "25", month = "Mar")


    }
}
