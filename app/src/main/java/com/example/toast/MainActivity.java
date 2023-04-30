package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   Button by_default , gravity , nestedgravity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        by_default = findViewById(R.id.bydefault);
         gravity = findViewById(R.id.gravitysimple);
         nestedgravity = findViewById(R.id.nestedgravity);

         by_default.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Toast.makeText(MainActivity.this, "By Default Toast", Toast.LENGTH_SHORT).show();
             }
         });

        gravity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(MainActivity.this , "Gravity Simple Toast " , Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER , 0  ,0 );
                toast.show();
            }
        });

        nestedgravity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(MainActivity.this , "Nested Toast " , Toast.LENGTH_LONG);
                toast.setGravity(Gravity.BOTTOM | Gravity.RIGHT, 0  ,0 );
                toast.show();
            }
        });


    }
}