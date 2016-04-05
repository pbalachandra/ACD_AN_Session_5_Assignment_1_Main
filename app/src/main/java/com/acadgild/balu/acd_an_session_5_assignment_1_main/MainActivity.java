package com.acadgild.balu.acd_an_session_5_assignment_1_main;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et_search;
    Button btn_search;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_search = (EditText) findViewById(R.id.editText_search);
        btn_search = (Button) findViewById(R.id.button_search);
    }

    public void openGoogle(View v)
    {
        String search_string = String.format(getResources().getString(R.string.search_link),et_search.getText().toString());
        Intent webSearch = new Intent(Intent.ACTION_VIEW, Uri.parse(search_string));
        startActivity(webSearch);

    }
}
