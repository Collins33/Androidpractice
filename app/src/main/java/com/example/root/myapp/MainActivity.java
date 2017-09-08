package com.example.root.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //THIS WILL BE THE KEY WHEN ADDING EXTRA TO AN INTENT
    private static final String TOTAL_COUNT = "total_count";


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
    public void randomMe(View view){


    //create intent to start new activity
    Intent randomIntent=new Intent(this,secondactivity.class);
        //get view that shows the count
        TextView showCountTextView=(TextView) findViewById(R.id.textView);
        //get value of text value,it is a string
        String countString= showCountTextView.getText().toString();
        //convert view into int
        int count=Integer.parseInt(countString);
        //add the view into the intent
        randomIntent.putExtra(TOTAL_COUNT,count);
        //start the activity
        startActivity(randomIntent);}

}
