package com.example.com.calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends Activity {

    EditText edit1, edit2;
    Button BtnAdd, BtnSub, BtnMul, BtnDiv, BtnElse;
    TextView TextResult;
    String num1, num2;
    Double Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초 간단 계산기");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);

        BtnAdd = (Button) findViewById(R.id.BtnAdd);
        BtnSub = (Button) findViewById(R.id.BtnSub);
        BtnMul = (Button) findViewById(R.id.BtnMul);
        BtnDiv = (Button) findViewById(R.id.BtnDiv);
        BtnElse = (Button) findViewById(R.id.BtnElse);

        TextResult = (TextView) findViewById(R.id.TextResult);


        BtnAdd.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.isEmpty())
                    Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
                else if (num2.isEmpty())
                    Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
                else {
                    Result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    TextResult.setText("계산결과 : " + Result.toString());
                }
            }
        });

        BtnSub.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if(num1.isEmpty())
                    Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
                else if(num2.isEmpty())
                    Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
                else{
                    Result = Double.parseDouble(num1) - Double.parseDouble(num2);
                    TextResult.setText("계산결과 : " + Result.toString());
                }
            }
        });

        BtnMul.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty())
                    Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
                else if (num2.isEmpty())
                    Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
                else {
                    TextResult.setText("계산결과 : " + Result.toString());
                    Result = Double.parseDouble(num1) * Double.parseDouble(num2);
                }
            }
        });

        BtnDiv.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.isEmpty())
                    Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
                else if(num2.isEmpty())
                    Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
                else if(Double.parseDouble(num2) == 0)
                    Toast.makeText(getApplicationContext(), "계산 불가능", Toast.LENGTH_SHORT).show();
                else {
                    TextResult.setText("계산결과 : " + Result.toString());
                    Result = Double.parseDouble(num1) / Double.parseDouble(num2);
                }
            }
        });

        BtnElse.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty())
                    Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
                else if (num2.isEmpty())
                    Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
                else {
                    TextResult.setText("계산결과 : " + Result.toString());
                    Result = Double.parseDouble(num1) % Double.parseDouble(num2);
                }
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
