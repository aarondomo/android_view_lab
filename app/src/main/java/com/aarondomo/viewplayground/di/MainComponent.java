package com.aarondomo.viewplayground.di;

import com.aarondomo.viewplayground.ui.MainActivity;

import dagger.Component;

@Component(modules = MainModule.class)
public interface MainComponent {

    void inject(MainActivity mainActivity);
}
