package com.example.yangzu.practice1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CountActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);



        TextView txc =(TextView) findViewById(R.id.cal);
        final Bundle bundlecount=this.getIntent().getExtras();
        double value =bundlecount.getDouble("x");

        TextView txtGoal=(TextView) findViewById(R.id.textGoal);
        double goal=bundlecount.getDouble("Goal");
        txtGoal.setText(String.valueOf(goal)+"公斤");




        txc.setText(String.valueOf(value));

        Button btn=(Button)findViewById(R.id.btnbf);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CountActivity.this,AddActivity.class);
                Bundle bundle=new Bundle();
                startActivityForResult(intent,0);

            }
        });
        Button btnH=(Button)findViewById(R.id.home);
        btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CountActivity.this,CountActivity.class);
                startActivity(intent);
            }
        });









    }
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        if(resultCode==0){

            final TextView txtbf=(TextView)findViewById(R.id.txtbf) ;
            TextView txc =(TextView) findViewById(R.id.cal);


            final Bundle bundlecount=this.getIntent().getExtras();
            double value =bundlecount.getDouble("x");





            Bundle bundle=data.getExtras();
            int bfvalue=bundle.getInt("bf");
            txtbf.setText(String.valueOf(bfvalue));
            double x=(value-bfvalue);
            txc.setText(String.valueOf(x));


        }

    }


}
