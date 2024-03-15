package com.example.java_application;

import androidx.appcompat.app.AppCompatActivity;

import android.text.TextUtils;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button ;
    private TextView textView ;

    private EditText editText ;
    @Override

protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);


    button =findViewById(R.id.button);
    textView=findViewById(R.id.textView);
    editText=findViewById(R.id.editText);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                Toast.makeText(MainActivity.this, "Hi click listener worked", Toast.LENGTH_SHORT).show();
//                String s = editText.getText().toString();
//
//                if(TextUtils.isEmpty(s))
//                {
//                    Toast.makeText(MainActivity.this, "Please enter a value", Toast.LENGTH_SHORT).show();
//                    textView.setText("");
//                }
//                else
//                    {
//                    double kg = Float.parseFloat(s);//Integer.parseInt(s) ;
//                    double pound=2.205*kg ;
//                    String p;
//                        p = String.format("%.2f", pound);
//                        textView.setText("The corresponding value in pound is "+p+" pounds");
//                }
//            }
//        });
    }

    public void cal(View view){
        String s = editText.getText().toString();

        if(TextUtils.isEmpty(s))
        {
                    Toast.makeText(MainActivity.this, "Please enter a value", Toast.LENGTH_SHORT).show();
                    textView.setText("");
       }
                else
                    {
                    double kg = Float.parseFloat(s);//Integer.parseInt(s) ;
                    double pound=2.205*kg ;
                   String p;
                        p = String.format("%.2f", pound);
                        textView.setText("The corresponding value in pound is "+p+" pounds");
               }
    }
}
