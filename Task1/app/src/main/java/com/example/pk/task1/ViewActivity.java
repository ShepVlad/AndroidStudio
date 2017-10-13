package com.example.pk.task1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.pk.task1.Model.UserInfo;
import com.example.pk.task1.packege.User;

public class ViewActivity extends AppCompatActivity {

    TextView tvView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        tvView = (TextView) findViewById(R.id.tvView);

        Intent intent = getIntent();
        User  user = (User) getIntent().getParcelableExtra(User.class.getCanonicalName());
        tvView.setText(user.toString());

    }

}
