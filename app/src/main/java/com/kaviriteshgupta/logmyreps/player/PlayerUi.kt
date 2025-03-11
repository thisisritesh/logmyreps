package com.kaviriteshgupta.logmyreps.player

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.kaviriteshgupta.logmyreps.data.Workout
import com.kaviriteshgupta.logmyreps.ui.theme.bgColor


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun SimpleViewPager(workoutSize: Int, workouts: List<Workout>) {
    val pagerState = rememberPagerState(pageCount = { workoutSize })

    HorizontalPager(state = pagerState) { page ->
        Box(
            modifier = Modifier
                .fillMaxSize(1f)
                .background(bgColor),
            contentAlignment = Alignment.Center
        ) {
            
        }
    }
}


@Composable
fun PreparationScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize(1f)) {
        
    }
}
