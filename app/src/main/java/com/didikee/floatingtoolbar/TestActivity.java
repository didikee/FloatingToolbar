package com.didikee.floatingtoolbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.FrameLayout;

import com.didikee.library.FloatingToolbar;

public class TestActivity extends AppCompatActivity {

    private FrameLayout container;
    private FloatingToolbar floatingToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
//        container = (FrameLayout) findViewById(R.id.container);
        floatingToolbar = new FloatingToolbar(this,getWindow());

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                floattoolbar();
            }
        });

    }

    private void floattoolbar(){

        floatingToolbar.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.test,menu);
        floatingToolbar.setMenu(menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void setLollipopAnimator() {
    }
}
