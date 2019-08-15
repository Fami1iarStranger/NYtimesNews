package com.example.andronews2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import com.example.andronews2.data.Results;

public class MainActivity extends AppCompatActivity {

    public static String period = "30";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewPager);
        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(this,getSupportFragmentManager());
        viewPager.setAdapter(myPagerAdapter);
        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    public void goToSecondActivity(View v) {

        String a = "";
        String b = Results.getUrl();


        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key", a);
        startActivity(intent);


    }
}
