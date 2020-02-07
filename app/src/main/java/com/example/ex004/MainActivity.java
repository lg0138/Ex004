package com.example.ex004;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.btn);
    }

    public void change(View view) {
        boolean flag=false;
        int original=count+1,d=0;

        count++;
        if(count%7==0){
            flag=true;
        }
        else{
            while(original!=0) {
                d=original%10;
                if(d==7){
                    flag=true;
                }
                original = original / 10;
            }
        }

        if(flag==false) {
            btn.setText("This is a click number " + count);
        }
        else{
            btn.setText("BOOM!");
        }
    }
}
