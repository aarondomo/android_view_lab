package com.aarondomo.viewplayground.presenters;

import android.view.View;

public class MainActivityPresenter {

    public interface MainActivityView {


    }

    private MainActivityView mainActivityView;

    public void attachView(MainActivityView view){
        this.mainActivityView = view;
    }

    public void dettachView(){
        this.mainActivityView = null;
    }

}
