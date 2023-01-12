contains Fragment classes and Activity classes also has Main Activity

Finally, addition class RetrofitApp that is used for advanced modifying workers or other things.

documentation:
The role of the UI layer (or presentation layer) is to display the application data on the screen.
Whenever the data changes, either due to user interaction (such as pressing a button)
or external input (such as a network response), the UI should update to reflect the changes.
The UI layer is made up of **two** things:
* UI elements that render the data on the screen. You build these elements using Views or [Jetpack Compose](https://developer.android.com/jetpack/compose) functions.
* State holders (such as ViewModel classes) that hold data, expose it to the UI, and handle logic.
