module com.udacity.catpoint.security {
    requires com.udacity.catpoint.image;
    requires java.desktop;  // for Swing components
    requires com.miglayout.swing;
    requires com.google.common;  // for Guava
    requires com.google.gson;    // for Gson
    requires java.prefs;        // for Java Preferences API

    exports com.udacity.catpoint.security.application;
    exports com.udacity.catpoint.security.data;
    exports com.udacity.catpoint.security.service;
}