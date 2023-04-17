package com.example.ex4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edName,edMail,edProject;
    Button btnView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edName=findViewById(R.id.edName);
        edMail=findViewById(R.id.edEmail);
        edProject=findViewById(R.id.edProject);
        btnView=findViewById(R.id.btnAdd);
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=edName.getText().toString();
                String mail=edMail.getText().toString();
                String project=edProject.getText().toString();
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                Bundle a=new Bundle();
                a.putString("name",name);
                a.putString("mail",mail);
                a.putString("project",project);
                intent.putExtras(a);
                startActivity(intent);
            }
        });
    }
}