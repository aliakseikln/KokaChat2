![image](https://user-images.githubusercontent.com/48939805/185547314-9c29beca-1baa-4500-8930-3d5ae03c123d.png)


A simple free chat application here you can find new friends and chat with them with stickers!

When I decided what to write for a pet project application I was inspired by messaging & social media apps.

Written in Kotlin implements the Jetpack libraries, Firebase services.



## What I learned while developing the application:
* Firebase: 
  - Authentication (Phone) - Authorization in the application by phone number
  - Cloud Firestore - Application users data
  - Realtime Database - Storage of all messages
  - Cloud Storage - Storage of all images 
* Swipe to Refresh
  - Easily update the data with a down swipe
* Emoji KeyBoard 
  - Adds a cool set of emoji to the app   
* Lottie-animation
  - Animation in the application
* country-code-picker
  - Provides an easy way to search and select country or country phone code for the telephone number.

## Screenshots preview
 <table>
  <tr>
    <th>Splash Screen</th>
    <th>Contact Screen</th>
    <th>Account Detail Screen</th>
    <th>Contact Screen</th>
  </tr>
  <tr>
    <td align="center" valign="middle"><img src="https://user-images.githubusercontent.com/48939805/185348955-520571f8-0487-4191-a95a-1df9eefbbb44.png" width="60%" height="60%"></td>
    <td align="center" valign="middle"><img src="https://user-images.githubusercontent.com/48939805/185348996-c59833c4-d39d-4f51-97cc-2afa5fabcf0c.png" width="60%" height="60%"></td>
    <td align="center" valign="middle"><img src="https://user-images.githubusercontent.com/48939805/185349042-3100680a-2db2-4428-87ad-b4f5a8b28458.png" width="60%" height="60%"></td>
    <td align="center" valign="middle"><img src="https://user-images.githubusercontent.com/48939805/185349070-1001bd65-f639-4068-831d-0b83e886de46.png" width="60%" height="60%"></td>
  </tr>
</table>

## Libraries and technologies used.
- Minimum SDK level 27 
- [Coroutines](https://kotlinlang.org/docs/coroutines-overview.html) - Do some code in the background.
- [Coil](https://coil-kt.github.io/coil/) - An image loading library for Android backed by Kotlin Coroutines.
- [Navigation](https://developer.android.com/guide/navigation/navigation-getting-started) - Handle everything needed for in-app navigation.
- [ViewBinding](https://developer.android.com/topic/libraries/view-binding) - Allows you to more easily write code that interacts with views. 
- [Firebase](https://firebase.google.com/) - It provide backend services for the app. It has realtime database, auth, storage, and more.
  - [Authentication](https://firebase.google.com/docs) - Allows an app to securely save user data in the cloud.
  - [Cloud Firestore](https://firebase.google.com/docs/firestore) - Flexible, scalable NoSQL cloud database to store and sync data.
  - [Cloud Storage](https://firebase.google.com/docs/storage) - Store and serve user-generated content. 
- [FlexboxLayout](https://github.com/google/flexbox-layout) - A library project which brings the similar capabilities of CSS Flexible Box Layout Module to Android.
- [Circle Image](https://github.com/hdodenhof/CircleImageView) - A fast circular ImageView perfect for profile images.
- [Country code picker](https://github.com/hbb20/CountryCodePickerProject) - An android library for Country Selector or Country Spinner or Country Phone Code selector.
- [Swipe to Refresh](https://developer.android.com/jetpack/androidx/releases/swiperefreshlayout) - With the help of SwipeToRefreshLayout you can update your UI just swiping from up to down.
- [Emoji KeyBoard](https://github.com/vanniktech/Emoji) - A Kotlin Multiplatform library to add Emoji support to your Android App / JVM Backend.
- [Material-Components](https://material.io/components) - Material design components for building ripple animation, and CardView.
- [Lottie animation](https://github.com/airbnb/lottie-android) - A mobile library for Android and iOS that parses Adobe After Effects animations exported as json with Bodymovin and renders them natively on mobile.
