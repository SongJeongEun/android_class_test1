package com.example.sje.test0314;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        Button btn = (Button) findViewById(v.getId());
        Button btn1 = (Button) findViewById(R.id.button1);
        if (btn.getId() == R.id.button4) {
            if (btn1.getText().equals("BUTTON1"))
                btn1.setText("첫번째 버튼");
            else
                btn1.setText("BUTTON1");
        } else
            Toast.makeText(this, btn.getText() + "Clicked", Toast.LENGTH_SHORT).show();
    }

    /*    public void onClick(View v){
        if(v.getId()==R.id.button2) //또는 스위치 문
         Toast.makeText(getApplicationContext(),"button2 click",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(getApplicationContext(),"button3 click",Toast.LENGTH_SHORT).show();
    }
    */

            /*final Button btn1=(Button)findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Toast.makeText(getApplicationContext(), "Button1", Toast.LENGTH_SHORT).show();
            }
        });
      Button btn4=(Button)findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                if(btn1.getText().equals("Button1")) {
                    btn1.setText("버튼 one");
                }
                else btn1.setText("Button1");
            }
        });*/


}
