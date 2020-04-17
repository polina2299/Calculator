package com.example.user.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    TextView res;
    double n1=0;
    double n2=1;
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.editText3);
        num2=findViewById(R.id.editText5);
        res=findViewById(R.id.textView2);
        toast=Toast.makeText(getApplicationContext(),"Error! Try again!",Toast.LENGTH_SHORT);
    }

    public void onClickAdd(View view) {
        try{
        n1=Double.parseDouble(num1.getText().toString());
         n2=Double.parseDouble(num2.getText().toString());
        res.setText(Double.toString(n1+n2));}
        catch (Exception e){
            toast.show();
        }

    }

    public void onClickSub(View view) {
        try{
        n1=Double.parseDouble(num1.getText().toString());
        n2=Double.parseDouble(num2.getText().toString());
        res.setText(Double.toString(n1-n2));}
        catch (Exception e){
            toast.show();
        }
    }

    public void onClickMult(View view) {
        try{
         n1=Double.parseDouble(num1.getText().toString());
         n2=Double.parseDouble(num2.getText().toString());
        res.setText(Double.toString(n1*n2));}
        catch (Exception e){
            toast.show();
        }
    }

    public void onClickDiv(View view) {
        try{
         n1=Double.parseDouble(num1.getText().toString());
         n2=Double.parseDouble(num2.getText().toString());
        res.setText(Double.toString(n1/n2));}
        catch (Exception e){
            toast.show();
        }
    }
}
