package com.attri.gaurav.timeliner;

/**
 * Created by gaurav on 24/4/18.
 */

class User {

    String number;
    String name;

    User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    User(String number, String name) {
        this.number = number;
        this.name = name;
    }
}
