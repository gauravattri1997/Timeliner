package com.attri.gaurav.timeliner;

/**
 * Created by gaurav on 24/4/18.
 */

public class postData {

    public String number,name,caption,downloadUrl;

    public postData() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public postData(String number,String name, String caption, String downloadUrl) {
        this.number = number;
        this.name = name;
        this.caption = caption;
        this.downloadUrl = downloadUrl;
    }
}