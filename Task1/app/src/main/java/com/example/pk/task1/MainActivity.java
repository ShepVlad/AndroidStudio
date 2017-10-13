package com.example.pk.task1;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Parcel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.pk.task1.Model.UserInfo;

public class MainActivity extends AppCompatActivity {

    public ImageView imgview;

    public EditText editName;
    public EditText password;
    public EditText editMultyText;
    public AutoCompleteTextView autoCompleteTextView;


    UserInfo userInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInfo=new UserInfo((ImageView) findViewById(R.id.imgFace),
                (EditText)findViewById(R.id.editTextName),
                (EditText) findViewById(R.id.password),(EditText) findViewById(R.id.editMultyText),
                (AutoCompleteTextView) findViewById(R.id.editAutoCompliteText),
                getApplicationContext());

//        imgview   =(ImageView) findViewById(R.id.imgFace);
//        editName  =(EditText) findViewById(R.id.editTextName);
//        password  =(EditText) findViewById(R.id.password);
//        editMultyText=(EditText) findViewById(R.id.editMultyText);
//        autoCompleteTextView=(AutoCompleteTextView) findViewById(R.id.editAutoCompliteText);
    }


    public void SendInfo(View view)
    {
        Intent intent = new Intent(this, ViewActivity.class);
        intent.putExtra(userInfo.getUser().getClass().getCanonicalName(),userInfo.getUser());
        startActivity(intent);
    }

    public void ImgShow(View view)
    {

    }

    public void ClearInfo(View view)
    {
       userInfo.Clear();
    }

}

