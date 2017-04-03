package com.didikee.floatingtoolbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;

import com.didikee.library.FloatingToolbar;

public class TestActivity extends AppCompatActivity {

    private FrameLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
//        container = (FrameLayout) findViewById(R.id.container);


        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void floattoolbar(){
        FloatingToolbar floatingToolbar =new FloatingToolbar(this,getWindow());
    }


    private void setLollipopAnimator() {
    }
}
