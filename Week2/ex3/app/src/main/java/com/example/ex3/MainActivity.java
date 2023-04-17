package com.example.ex3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText tvResult;
//    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnCong,btnTru,btnNhan,btnChia,btnResult,btnReset;
    String input,answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult=findViewById(R.id.tvResult);



    }
    public void ButtonClick(View view){
        Button button= (Button) view;
        String data=button.getText().toString();
        switch (data){
            case "Reset":
                input="";
                break;
            case "=":
                Solve();
                answer=input;
                break;
            default:
                if(input == null){
                    input="";
                }
                if(data.equals("+")||data.equals("-")||data.equals("*")||data.equals("/"))  {
                    Solve();
                }
                input+=data;
        }
        tvResult.setText(input);
    }
    public void Solve(){
        if(input.split("\\*").length==2){
            String number[]=input.split("\\*");
            try {
                double mul=Double.parseDouble(number[0])*Double.parseDouble(number[1]);
                input=mul+"";
            }catch (Exception e){

            }

        }
        if(input.split("\\+").length==2){
            String number[]=input.split("\\+");
            try {
                double sum=Double.parseDouble(number[0])+Double.parseDouble(number[1]);
                input=sum+"";
            }catch (Exception e){

            }}
        if(input.split("\\-").length==2){
            String number[]=input.split("\\-");
            try {
                double sub=Double.parseDouble(number[0])-Double.parseDouble(number[1]);
                input=sub+"";
            }catch (Exception e){

            }}
        if(input.split("\\/").length==2){
            String number[]=input.split("\\/");
            try {
                double div=Double.parseDouble(number[0])/Double.parseDouble(number[1]);
                input=div+"";
            }catch (Exception e){

            }}
    }
}