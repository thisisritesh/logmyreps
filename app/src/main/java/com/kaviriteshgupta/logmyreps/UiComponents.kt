package com.kaviriteshgupta.logmyreps

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Circle
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kaviriteshgupta.logmyreps.ui.theme.bgColor
import com.kaviriteshgupta.logmyreps.ui.theme.cardBgColor
import com.kaviriteshgupta.logmyreps.ui.theme.disabledComponentColor
import com.kaviriteshgupta.logmyreps.ui.theme.primaryColor
import com.kaviriteshgupta.logmyreps.ui.theme.primaryTextColor
import com.kaviriteshgupta.logmyreps.ui.theme.secondaryTextColor


//@Preview
//@Composable
//private fun SeePreview() {
//    ScreenHeading()
//}


@Composable
fun ScreenHeading(modifier: Modifier = Modifier, name: String = "") {
    Row(horizontalArrangement = Arrangement.Center) {
        Text(
            text = "Hello, ",
            style = MaterialTheme.typography.headlineLarge,
            color = primaryTextColor
        )
        Text(text = name, style = MaterialTheme.typography.headlineLarge, color = primaryColor)
        Text(text = "!", style = MaterialTheme.typography.headlineLarge, color = primaryTextColor)
    }
}

@Composable
fun Subheading(modifier: Modifier = Modifier, txt: String = "") {
    Row(horizontalArrangement = Arrangement.Center) {
        Text(text = txt, style = MaterialTheme.typography.headlineMedium, color = primaryTextColor)
    }
}


@Composable
fun Quote(modifier: Modifier = Modifier, quote: String = "") {
    Text(text = quote, style = MaterialTheme.typography.bodyMedium, color = primaryTextColor)
}


@Composable
fun InsightCard(modifier: Modifier = Modifier, iconRes: Int, value: String, label: String) {
    Box(contentAlignment = Alignment.TopStart) {
        Card(
            shape = RoundedCornerShape(4.dp),
            colors = CardDefaults.cardColors(containerColor = cardBgColor),
            modifier = modifier
                .height(120.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Spacer(modifier = Modifier.size(16.dp))
                Text(
                    text = label,
                    style = MaterialTheme.typography.displayMedium,
                    color = primaryTextColor
                )
                Text(
                    text = value,
                    style = MaterialTheme.typography.bodyMedium,
                    color = primaryTextColor
                )
            }
        }
        Image(
            painter = painterResource(iconRes),
            contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .offset(y = (-30).dp, x = 16.dp)
        )
    }
}


@Composable
fun PastDayCard(modifier: Modifier = Modifier, date: String, month: String) {
    Card(
        shape = RoundedCornerShape(4.dp),
        colors = CardDefaults.cardColors(containerColor = cardBgColor),
        modifier = modifier
            .fillMaxWidth(1f)
            .height(92.dp)
    ) {
        Row {

            Box(
                modifier = Modifier
                    .background(primaryColor)
                    .fillMaxWidth(.2f)
                    .fillMaxHeight(1f), contentAlignment = Alignment.Center
            ) {
                Column {
                    Text(
                        text = date.uppercase(),
                        style = MaterialTheme.typography.displayMedium,
                        color = bgColor
                    )
                    Text(
                        text = month.uppercase(),
                        style = MaterialTheme.typography.displaySmall,
                        color = bgColor
                    )
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth(.7f)
                    .padding(16.dp, 0.dp, 0.dp, 0.dp)
            ) {

                Spacer(modifier = Modifier.size(8.dp))

                Text(
                    text = "Previous Workout",
                    style = MaterialTheme.typography.titleSmall,
                    color = secondaryTextColor
                )

                Spacer(modifier = Modifier.size(16.dp))

                Text(
                    text = "LEGS & CORE",
                    style = MaterialTheme.typography.titleLarge,
                    color = primaryTextColor
                )

                Spacer(modifier = Modifier.size(4.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "7 exercises",
                        style = MaterialTheme.typography.titleMedium,
                        color = primaryTextColor
                    )

                    Spacer(modifier = Modifier.size(8.dp))

                    Icon(
                        imageVector = Icons.Filled.Circle,
                        contentDescription = null,
                        modifier = Modifier.size(4.dp)
                    )

                    Spacer(modifier = Modifier.size(8.dp))

                    Text(
                        text = "7 minutes",
                        style = MaterialTheme.typography.titleMedium,
                        color = primaryTextColor
                    )

                }

                Spacer(modifier = Modifier.size(8.dp))


            }

            Box(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .fillMaxHeight(1f), contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Filled.CheckCircle,
                    contentDescription = null,
                    tint = primaryColor,
                    modifier = Modifier.size(24.dp)
                )
            }

        }
    }
}


@Composable
fun CurrentDayCard(modifier: Modifier = Modifier, date: String, month: String, onClick: () -> Unit) {
    Card(
        shape = RoundedCornerShape(4.dp),
        colors = CardDefaults.cardColors(containerColor = cardBgColor),
        border = BorderStroke(3.dp, primaryColor),
        modifier = modifier
            .height(148.dp)
            .fillMaxWidth(1f)
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth(1f)
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    text = "CHEST & TRICEPS",
                    style = MaterialTheme.typography.titleLarge,
                    color = primaryTextColor
                )

                Spacer(modifier = Modifier.size(4.dp))

                Text(
                    text = "Mon, May 24",
                    style = MaterialTheme.typography.titleMedium,
                    color = primaryTextColor
                )

                Spacer(modifier = Modifier.size(36.dp))

                Text(
                    text = "7 Exercises",
                    style = MaterialTheme.typography.titleMedium,
                    color = primaryTextColor
                )

                Spacer(modifier = Modifier.size(4.dp))

                Text(
                    text = "3 times completed",
                    style = MaterialTheme.typography.titleMedium,
                    color = primaryTextColor
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxHeight(1f)
                    .fillMaxWidth(1f), contentAlignment = Alignment.BottomEnd
            ) {
                Button(
                    onClick = {
                        onClick
                    },
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp),
                    colors = ButtonColors(
                        primaryColor,
                        bgColor,
                        disabledComponentColor,
                        secondaryTextColor
                    ),
                    shape = RoundedCornerShape(4.dp)
                ) {
                    Text(text = "Start", style = MaterialTheme.typography.displaySmall)
                }
            }
        }
    }
}



@Composable
fun UpcomingDayCard(modifier: Modifier = Modifier, date: String, month: String) {
    Card(
        shape = RoundedCornerShape(4.dp),
        colors = CardDefaults.cardColors(containerColor = cardBgColor),
        modifier = modifier
            .fillMaxWidth(1f)
            .height(80.dp)
    ) {
        Row {

            Box(
                modifier = Modifier
                    .background(secondaryTextColor)
                    .fillMaxWidth(.2f)
                    .fillMaxHeight(1f), contentAlignment = Alignment.Center
            ) {
                Column {
                    Text(
                        text = date.uppercase(),
                        style = MaterialTheme.typography.displayMedium,
                        color = cardBgColor
                    )
                    Text(
                        text = month.uppercase(),
                        style = MaterialTheme.typography.displaySmall,
                        color = cardBgColor
                    )
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth(.7f)
                    .padding(16.dp, 0.dp, 0.dp, 0.dp)
            ) {

                Spacer(modifier = Modifier.size(16.dp))

                Text(
                    text = "LEGS & CORE",
                    style = MaterialTheme.typography.titleLarge,
                    color = secondaryTextColor
                )

                Spacer(modifier = Modifier.size(4.dp))

                Text(
                    text = "7 exercises",
                    style = MaterialTheme.typography.titleMedium,
                    color = secondaryTextColor
                )

                Spacer(modifier = Modifier.size(16.dp))


            }

            Box(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .fillMaxHeight(1f), contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Filled.Lock,
                    contentDescription = null,
                    tint = secondaryTextColor,
                    modifier = Modifier.size(24.dp)
                )
            }

        }
    }
}

