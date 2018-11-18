package com.example.yangzu.practice1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        final EditText edtW=(EditText)findViewById(R.id.edtW);
        final EditText edtH=(EditText)findViewById(R.id.edtH);
        final EditText edtA=(EditText)findViewById(R.id.edtA);
        final TextView total=(TextView)findViewById(R.id.total);
        final EditText edtG=(EditText)findViewById(R.id.editGoal);


        final Bundle bundleinput=this.getIntent().getExtras();

         Button btn=(Button)findViewById(R.id.btnCount);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String sex=bundleinput.getString("sex");
                String sexText="";
                if(sex.equals("M")){



                    int a=Integer.parseInt(edtW.getText().toString());
                    int b=Integer.parseInt(edtH.getText().toString());
                    int c=Integer.parseInt(edtA.getText().toString());
                    double goal=Double.parseDouble(edtG.getText().toString());
                    double d=10*a+6.25*b+5*c+5;

                    Intent intent =new Intent(InputActivity.this,CountActivity.class);
                    Bundle bundle=new Bundle();

                    bundle.putDouble("Goal",goal);

                    bundle.putDouble("x",d);
                    intent.putExtras(bundle);
                    startActivity(intent);

                    total.setText(String.valueOf(d));



                }
                if(sex.equals("F")){

                    int a=Integer.parseInt(edtW.getText().toString());
                    int b=Integer.parseInt(edtH.getText().toString());
                    int c=Integer.parseInt(edtA.getText().toString());
                    double goal=Double.parseDouble(edtG.getText().toString());
                    double d=10*a+6.25*b+5*c-161;

                    Intent intent =new Intent(InputActivity.this,CountActivity.class);
                    Bundle bundle=new Bundle();

                    bundle.putDouble("Goal",goal);

                    bundle.putDouble("x",d);
                    intent.putExtras(bundle);
                    startActivity(intent);

                    total.setText(String.valueOf(d));


                }






                }




        });

        String sex=bundleinput.getString("sex");
        String sexText="";
        if(sex.equals("M")){



            sexText="我是男生";
        }
        else {
            sexText="我是女生";
        }
        TextView tv=(TextView)findViewById(R.id.MF);
        tv.setText("您是"+sexText);

    }
}
