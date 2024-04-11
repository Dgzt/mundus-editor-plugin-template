# Plugin template for [Mundus Editor](https://github.com/JamesTKhan/Mundus)

This template works with [editor system PR](https://github.com/JamesTKhan/Mundus/pull/268).

## Needs to be changed

1) Package and class names from `com.github.your_name.your_plugign` for what you want.
2) Manifest information in `plugin/build.gradle.kts` file
```
manifest {
  attributes["Plugin-Class"]= "com.github.your_name.your_plugin.YourPlugin"
  attributes["Plugin-Id"] = "your-plugin"
  attributes["Plugin-Provider"] = "Your Name"
  attributes["Plugin-Version"] = "0.0.1"
}
```
4) `archiveFileName.set("your-plugin.jar")` line in `plugin/build.gradle.kts` file to use different file name
5) `rootProject.name` variable in `settitngs.gradle.kts` file
