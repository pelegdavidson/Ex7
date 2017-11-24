package com.example.peleg.ex7b;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RegisterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    }

    public void sendMessage2(View v) {
        Intent intent = new Intent (this, RegisterActivity.class);
        EditText edt = (EditText)findViewById(R.id.input1);
        String s1 = edt.getText().toString();
        intent.putExtra("First Name", s1);
        EditText edt2 = (EditText)findViewById(R.id.input2);
        String s2 = edt2.getText().toString();
        intent.putExtra("Last Name", s2);
        RadioGroup rg = (RadioGroup)  findViewById(R.id.rg);
        int gender = rg.getCheckedRadioButtonId();
        RadioButton rb = (RadioButton)  findViewById(gender);
        String s3 = rb.getText().toString();
        intent.putExtra("Gender", s3);
        setResult(RESULT_OK,intent);
        finish();
    }
}
