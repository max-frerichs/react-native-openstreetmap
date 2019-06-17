import React, { Component } from 'react';
import { View, StyleSheet } from 'react-native';
import MapView from './app/modules/MapView'

export default class App extends Component {
  render() {
    return (
      <View style={styles.container}>
        <MapView
          zoomLevel={10.0}
        />
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
    width: "100%",
    height: "100%",
  }
});
