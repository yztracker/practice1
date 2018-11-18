package com.example.yangzu.practice1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btbB =(Button)findViewById(R.id.boy);


        btbB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String sex="";
                sex="M";


                Intent intent = new Intent(MainActivity.this, InputActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("sex",sex);

                intent.putExtras(bundle);
                startActivity(intent);

            }

        });
        final  Button btnG=(Button)findViewById(R.id.girl);
        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sex="";
                sex="F";


                Intent intent = new Intent(MainActivity.this, InputActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("sex",sex);

                intent.putExtras(bundle);
                startActivity(intent);


            }
        });
        }


}


