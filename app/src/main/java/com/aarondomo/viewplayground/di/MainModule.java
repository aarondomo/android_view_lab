package com.aarondomo.viewplayground.di;

import com.aarondomo.viewplayground.presenters.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    @Provides
    public MainActivityPresenter providesMainActivityPresenter(){
        return new MainActivityPresenter();
    }
}
