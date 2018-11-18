package com.example.yangzu.practice1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

       final EditText edi=(EditText)findViewById(R.id.editbf);

        Button btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent();
                Bundle bundle=new Bundle();
                int a=Integer.parseInt(edi.getText().toString());
                bundle.putInt("bf",a);
                intent.putExtras(bundle);
                setResult(0,intent);
                finish();

            }
        });
    }
}
