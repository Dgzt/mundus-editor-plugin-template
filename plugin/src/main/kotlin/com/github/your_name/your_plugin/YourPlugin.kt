package com.github.your_name.your_plugin

import com.mbrlabs.mundus.pluginapi.MenuExtension
import com.mbrlabs.mundus.pluginapi.ui.RootWidget
import org.pf4j.Extension
import org.pf4j.Plugin

class YourPlugin : Plugin() {

    @Extension
    class YourMenuExtension : MenuExtension {

        companion object {
            const val PAD = 5f
        }

        override fun getMenuName(): String = "Your plugin"

        override fun setupDialogRootWidget(root: RootWidget) {
            root.addLabel("Your plugin").setPad(PAD, PAD, PAD, PAD)
        }

    }

}
