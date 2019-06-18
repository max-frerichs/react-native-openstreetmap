# react-native-openstreetmap

## About
This is a custom MapView component implementation for React Native based on the osmdroid library for android. It aims to be a suitable
package for easy-to-use open source maps in your React Native application. 


## Requirements
* Android Studio 3.1
* NodeJS installed
* npm or yarn installed
* react-native-cli installed
* A physical Android device, API level 27 or above


## How to use
* Run git clone "https://github.com/maxfrerichs/react-native-openstreetmap" in your terminal
* Go to folder and run npm install to install dependencies from package.json. You can also use Yarn. In case of that, I recommend deleting the
  the package.json file. But: be careful with deleting files
* Run react-native start for the package server
*
* Open the folder in your favourite code editor for contributing :P 


## Known issues
* User agent not set correctly. This prevents the map from being rendered. A fix is already in progress
* Zoom and other things don't work properly

Be advised, this project is in early development. I don't recommend using it in an actual production enviroment. According to MIT license 

## Future shit

In future, this project aims to be a full implementation of OpenStreetMap for React Native. If you want to contribute, you're welcome

Some of the planned features are:
* Configurable map type (you can set this property in the MapView component of your React Native application)
* Gesture controls
* Configurable markers
* Offline usage

and other cool stuff ;)
