package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;

public class User {

    public String name;
    /* aka twitter handle */
    public String screenName;
    public String pfpUrl;

    public static User fromJson(JSONObject jsonObject) throws JSONException {
        User user = new User();
        user.name = jsonObject.getString("name");
        user.screenName = jsonObject.getString("screen_name");
        user.pfpUrl = jsonObject.getString("profile_image_url_https");
        return user;
    }
}