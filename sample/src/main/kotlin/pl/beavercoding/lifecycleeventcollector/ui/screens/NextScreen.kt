package pl.beavercoding.lifecycleeventcollector.ui.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.Lifecycle
import pl.beavercoding.lifecyclecollector.LifecycleCollector

@Composable
internal fun NextScreen() {
    LifecycleCollector { event ->
        collectLifecycle(event)
    }

    Text(
        text = "Next screen",
    )
}

private fun collectLifecycle(event: Lifecycle.Event) {
    when (event) {
        Lifecycle.Event.ON_CREATE -> println("ON_CREATE")
        Lifecycle.Event.ON_PAUSE -> println("ON_PAUSE")
        Lifecycle.Event.ON_RESUME -> println("ON_RESUME")
        Lifecycle.Event.ON_START -> println("ON_START")
        Lifecycle.Event.ON_STOP -> println("ON_STOP")
        Lifecycle.Event.ON_DESTROY -> println("ON_DESTROY")
        Lifecycle.Event.ON_ANY -> println("ON_ANY")
    }
}
