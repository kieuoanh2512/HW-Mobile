package com.example.ex4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView tvName,tvMail,tvProject;
    Button btnFinish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvName=findViewById(R.id.tvName);
        tvMail=findViewById(R.id.tvMail);
        tvProject=findViewById(R.id.tvProject);
        Bundle a=getIntent().getExtras();
        if ((a!=null)){
            String s=a.getString("name");
            tvName.setText(s);
            String b=a.getString("mail");
            tvMail.setText(b);
            String c=a.getString("project");
            tvProject.setText(c);
            btnFinish=findViewById(R.id.btnFinish);
            btnFinish.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                    Toast.makeText(MainActivity2.this, "Ket Thuc", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
            });
        }
    }
}