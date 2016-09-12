package com.vendawebsites.outsidelocator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText;

        final Button button;

        editText = (EditText) findViewById(R.id.editText1);
        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        if (editText.getText().toString().equals("1234") ) {

                            Intent intent1 = new Intent(MainActivity.this, ShowLocationActivity.class);
                            startActivity(intent1);
                        } else {

                            Log.e("ola", "Index=0");
                        }
                    }
                });


    }

}