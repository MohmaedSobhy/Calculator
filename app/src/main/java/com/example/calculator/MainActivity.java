package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.mariuszgromada.math.mxparser.Expression;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText=findViewById(R.id.textView);
    }

    public void eqaul(View view)
    {

         String result=editText.getText().toString();
        Expression exp=new Expression(result);

        String res=String.valueOf(exp.calculate());

        editText.setText(res);


    }

    public void remove(View view) {
        String statment=editText.getText().toString();
        if(!statment.equals(""))
           editText.setText(statment.substring(0,statment.length()-1));
    }
    public void add(View view)
    {
        editText.setText(editText.getText().toString()+"+");
    }
    public void subtract(View view){
        editText.setText(editText.getText().toString()+"-");
    }
    public void divide(View view)
    {
        editText.setText(editText.getText().toString()+"/");
    }
    public void multiply(View view){
        editText.setText(editText.getText().toString()+"*");
    }
    public void Rightbraket(View view){
        editText.setText(editText.getText().toString()+"(");
    }
    public void Leftbraket(View view){
        editText.setText(editText.getText().toString()+")");
    }
    public  void clear(View view){
        editText.setText("");
    }
    public void zero(View view)
    {
        editText.setText(editText.getText().toString()+"0");
    }
    public void one(View view){
        editText.setText(editText.getText().toString()+"1");
    }
    public void two(View view){
        editText.setText(editText.getText().toString()+"2");
    }
    public void three(View view){
        editText.setText(editText.getText().toString()+"3");
    }
    public void four(View view){
        editText.setText(editText.getText().toString()+"4");
    }
    public void five(View view)
    {
        editText.setText(editText.getText().toString()+"5");
    }
    public void six(View view)
    {
        editText.setText(editText.getText().toString()+"6");
    }
    public void seven(View view)
    {
        editText.setText(editText.getText().toString()+"7");
    }
    public void eight(View view)
    {
        editText.setText(editText.getText().toString()+"8");
    }
    public void nine(View view)
    {
        editText.setText(editText.getText().toString()+"9");
    }
    public void dotted(View view)
    {
        editText.setText(editText.getText().toString()+".");
    }


}