package pl.beavercoding.lifecycleeventcollector.ui.screens

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import pl.beavercoding.lifecyclecollector.LifecycleCollectorWithOwner

@Composable
internal fun FirstScreen(onClick: () -> Unit) {
    LifecycleCollectorWithOwner(onEvent = ::collectLifecycleWithOwner, onDispose = ::disposeEffect)

    Button(onClick = onClick) {
        Text(
            text = "First screen",
        )
    }
}

private fun collectLifecycleWithOwner(owner: LifecycleOwner, event: Lifecycle.Event) {
    when (event) {
        Lifecycle.Event.ON_CREATE -> println("ON_CREATE in $owner")
        Lifecycle.Event.ON_PAUSE -> println("ON_PAUSE in $owner")
        Lifecycle.Event.ON_RESUME -> println("ON_RESUME in $owner")
        Lifecycle.Event.ON_START -> println("ON_START in $owner")
        Lifecycle.Event.ON_STOP -> println("ON_STOP in $owner")
        Lifecycle.Event.ON_DESTROY -> println("ON_DESTROY in $owner")
        Lifecycle.Event.ON_ANY -> println("ON_ANY in $owner")
    }
}

private fun disposeEffect() {
    println("disposed")
}
