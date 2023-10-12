package com.test.api_test_apk;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        ListView listView = findViewById(R.id.listview);
        ArrayList<String> arrayList = new ArrayList<>();
        JSONObject data = rest.get();
        try {
            for (int i = 0; i < data.getJSONArray("data").length(); i++) {
                arrayList.add(data.getJSONArray("data").getJSONObject(i).getString("nim"));
                Log.i("Data", data.getJSONArray("data").getJSONObject(i).getString("nim"));
            }
        } catch (Exception e) {
            Log.e("Error", Objects.requireNonNull(e.getMessage()));
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_expandable_list_item_1, arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Log.i("Data", String.valueOf(position));
            Log.i("", "");
        });
    }
}
