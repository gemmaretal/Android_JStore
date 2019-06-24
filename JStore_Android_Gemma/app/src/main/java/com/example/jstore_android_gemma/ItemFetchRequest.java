package com.example.jstore_android_gemma;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

public class ItemFetchRequest extends StringRequest {
    private static final String BASE_URL = "http://192.168.0.104:8080/items/";
    public ItemFetchRequest(int id, Response.Listener<String> listener) {
        super(Method.GET, BASE_URL+id, listener, null);
    }
}
