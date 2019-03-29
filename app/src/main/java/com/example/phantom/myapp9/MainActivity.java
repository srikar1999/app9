package com.example.phantom.myapp9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText e1 =(EditText)findViewById(R.id.e1);
        final EditText e2 =(EditText)findViewById(R.id.e2);
        final TextView t  =(TextView)findViewById(R.id.textView);
        Button add  =(Button)findViewById(R.id.button3);
        Button sub  =(Button)findViewById(R.id.button2);
        Button div = (Button)findViewById(R.id.button4);
        Button mul = (Button)findViewById(R.id.button);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 =Double.parseDouble(e1.getText().toString());
                double n2 =Double.parseDouble(e2.getText().toString());
                t.setText(n1+n2+"");
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 =Double.parseDouble(e1.getText().toString());
                double n2 =Double.parseDouble(e2.getText().toString());
                t.setText(n1-n2+"");
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 =Double.parseDouble(e1.getText().toString());
                double n2 =Double.parseDouble(e2.getText().toString());
                t.setText(n1*n2+"");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 =Double.parseDouble(e1.getText().toString());
                double n2 =Double.parseDouble(e2.getText().toString());
                t.setText(n1/n2+"");
            }
        });
    }
}
