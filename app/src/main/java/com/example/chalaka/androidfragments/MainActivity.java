package com.example.chalaka.androidfragments;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v4.app.Fragment;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }
    public void changeFragment(View view){
        android.support.v4.app.Fragment fragment;

        if (view == findViewById(R.id. button )){
            fragment = new Fragment1();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frgmntDefault,fragment);
            ft.commit();
        }

        if (view == findViewById(R.id. button2 )){
            fragment = new Fragment2();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frgmntDefault,fragment);
            ft.commit();
        }

    }


}
