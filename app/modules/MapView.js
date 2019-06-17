import { requireNativeComponent, PropTypes } from 'react-native';
import { Number } from 'core-js';


// iface sets the properties for the React Native component
var iface = {
    name: 'MapView',
    propTypes: {
        zoomLevel: Number
    }
};

module.exports = requireNativeComponent('MapView', iface);