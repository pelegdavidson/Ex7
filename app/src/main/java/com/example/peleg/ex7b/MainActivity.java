package com.example.peleg.ex7b;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    final int REGISTERCODE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage1(View v) {
        Intent i=new Intent(this,RegisterActivity.class);
        startActivityForResult(i,REGISTERCODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==REGISTERCODE) {
            TextView tv = (TextView) findViewById(R.id.tvIntro);
            if (data.getStringExtra("Gender").compareTo("Male")==0) {
                tv.setText("Welcome back Mr. "+data.getStringExtra("First Name")+ " " +  data.getStringExtra("Last Name"));
            }
            else
                tv.setText("Welcome back Ms. "+data.getStringExtra("First Name")+ " " +  data.getStringExtra("Last Name"));
        }
        Button bt = (Button)findViewById(R.id.bt1);
        bt.setText("Again...");
    }
}
