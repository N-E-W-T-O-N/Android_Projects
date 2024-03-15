package com.example.basic_artimetics;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button butt , add ;//, minus , multi , divide;
    private EditText a,b ;
    private TextView text;

    boolean plu,min,mul,div ;
    /*
    plu = false ;
    min = false ;
    mul = false ;
    div = false ;
    */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Enter THe Two Values ..", Toast.LENGTH_SHORT).show();
        butt=findViewById(R.id.button) ;
        a=findViewById(R.id.n1);
        b=findViewById(R.id.n2);
        text = findViewById(R.id.textView);
        add= findViewById(R.id.plus);
/*
        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(plu==false)
                    plu=true ;
                else plu = false ;
            }

            public boolean onTouch(View v , MotionEvent e) {
                switch(e.getAction())
                {
                    case MotionEvent.ACTION_DOWN:
                        add.animate().scaleX(1.1f).scaleX(1.1f).setDuration(200).start();
                        add.setPressed(true);
                        break;

                    case MotionEvent.ACTION_UP:
                        add.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200).start();
                        add.setPressed(false);
                        // Perform the operation here
                        break;
                }
                return true ;
            }

        });
*/
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float num1 = Float.parseFloat(a.getText().toString());
                    float num2 = Float.parseFloat(b.getText().toString());
                    
                    float product = num1 * num2;
                    text.setText("The product is " + product);
                } catch (NumberFormatException e) {
                    if(!(text.getText().toString()==""))
                        text.setText("");
                    Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }


}
