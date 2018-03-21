package com.example.aliar.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmul,bdiv,bdot,bequal,bclear;
    TextView ans;
    double var1,var2;
    boolean add,sub,mul,div,clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        b1=(Button)findViewById(R.id.btn1);
        b2=(Button)findViewById(R.id.btn2);
        b3=(Button)findViewById(R.id.btn3);
        b4=(Button)findViewById(R.id.btn4);
        b5=(Button)findViewById(R.id.btn5);
        b6=(Button)findViewById(R.id.btn6);
        b7=(Button)findViewById(R.id.btn7);
        b8=(Button)findViewById(R.id.btn8);
        b9=(Button)findViewById(R.id.btn9);
        b0=(Button)findViewById(R.id.btn0);
        badd=(Button)findViewById(R.id.btnadd);
        bsub=(Button)findViewById(R.id.btnsub);
        bmul=(Button)findViewById(R.id.btnmul);
        bdiv=(Button)findViewById(R.id.btndiv);
        bdot=(Button)findViewById(R.id.btndot);
        bequal=(Button)findViewById(R.id.btnequal);
        bclear=(Button)findViewById(R.id.btnclear);

        ans=(TextView)findViewById(R.id.Answer);

        b0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                ans.setText(ans.getText()+"0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"1");
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"2");
            }

        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"3");
            }

        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"4");
            }

        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"5");
            }

        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"6");
            }

        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"7");
            }

        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"8");
            }

        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"9");
            }

        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+".");
            }

        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               var1=Double.parseDouble(ans.getText()+"");
               add=true;
               ans.setText("+");
            }

        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=Double.parseDouble(ans.getText()+"");
                sub=true;
                ans.setText("-");
            }

        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=Double.parseDouble(ans.getText()+"");
                mul=true;
                ans.setText("*");
            }

        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=Double.parseDouble(ans.getText()+"");
                div=true;
                ans.setText("/");
            }

        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var2=Double.parseDouble(ans.getText()+"");
                if(add==true){
                    ans.setText(var1+var2+"");
                    add=false;

                }
                if(sub==true){
                    ans.setText(var1-var2+"");
                    sub=false;

                }
                if(mul==true){
                    ans.setText(var1*var2+"");
                    mul=false;

                }
                if(div==true){
                    ans.setText(var1/var2+"");
                    div=false;

                }
            }

        });
        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear=true;
                ans.setText(null);

            }
        });


    }
}
