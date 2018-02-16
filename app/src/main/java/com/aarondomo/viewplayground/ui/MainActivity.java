package com.aarondomo.viewplayground.ui;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


import com.aarondomo.viewplayground.R;
import com.aarondomo.viewplayground.ViewCreator;
import com.aarondomo.viewplayground.ViewsCatalog;
import com.aarondomo.viewplayground.di.DaggerMainComponent;
import com.aarondomo.viewplayground.di.MainModule;
import com.aarondomo.viewplayground.presenters.MainActivityPresenter;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity implements MainActivityPresenter.MainActivityView {

    private static final int VIEW_INDEX = 0;

    private LinearLayout linearLayout;
    private Button addButton;
    private Button removeButton;


    @Inject
    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.linearlayout_main_container);

        addButton = findViewById(R.id.addButton);
        removeButton = findViewById(R.id.removeButton);




        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(linearLayout.getChildCount() == 0){
                    addViewToContainer(ViewCreator.getView(ViewsCatalog.CHECKBOX, linearLayout.getContext()));
                }
            }
        });

        removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(linearLayout.getChildCount() != 0){
                    removeViewFromContainer();
                }
            }
        });

        setUpDaggerComponent();

        presenter.attachView(this);


    }

    private void setUpDaggerComponent(){
        DaggerMainComponent.builder()
                .mainModule(new MainModule())
                .build()
                .inject(this);
    }



    private void addViewToContainer(View view){
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        linearLayout.addView(view, VIEW_INDEX, params);
    }

    private void removeViewFromContainer(){
        linearLayout.removeViewAt(VIEW_INDEX);
    }


}
