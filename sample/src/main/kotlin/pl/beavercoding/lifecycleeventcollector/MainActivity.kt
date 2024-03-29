package pl.beavercoding.lifecycleeventcollector

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import pl.beavercoding.lifecycleeventcollector.ui.screens.FirstScreen
import pl.beavercoding.lifecycleeventcollector.ui.screens.NextScreen
import pl.beavercoding.lifecycleeventcollector.ui.theme.LifecycleEventCollectorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LifecycleEventCollectorTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    var shouldMoveToNext by remember { mutableStateOf(false) }
                    if (shouldMoveToNext) {
                        NextScreen()
                    } else {
                        FirstScreen { shouldMoveToNext = true }
                    }
                }
            }
        }
    }
}
