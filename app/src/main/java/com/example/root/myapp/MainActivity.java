package com.example.root.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void toastMe(View view){
        // Toast myToast = Toast.makeText(this, message, duration);
        Toast myToast = Toast.makeText(this, "Hello Toast!",
                Toast.LENGTH_SHORT);
        myToast.show();
    }
    public void countMe(View view){
        //get the view
        TextView myNumber=(TextView) findViewById(R.id.textView);
        //get value of the view
        String theNumber=myNumber.getText().toString();
        //convert it into number and increase it
       Integer finalNumber=Integer.parseInt(theNumber);
        finalNumber++;
        //make the view we called to display the number
        myNumber.setText(finalNumber.toString());
    }
}
