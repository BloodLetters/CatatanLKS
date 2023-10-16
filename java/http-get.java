package com.test.api_test_apk;

import android.os.StrictMode;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Objects;

public class rest {

    public static JSONObject get() {
        JSONObject obj = null;

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        try {
            URL url = new URL("http://192.168.43.66/api/datas.php");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder builder = new StringBuilder();
                String line;
                while((line = reader.readLine()) != null) {
                    builder.append(line);
                    Log.i("Data-Value", line);
                }

                obj = new JSONObject(builder.toString());

                conn.disconnect();
            } else {
                conn.disconnect();
            }

        } catch (Exception ex) {
            Log.e("Error", Objects.requireNonNull(ex.getMessage()));
        }

        return obj;
    }
}
