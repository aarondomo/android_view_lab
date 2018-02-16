package com.aarondomo.viewplayground;


import android.content.Context;
import android.support.v4.widget.Space;
import android.support.v7.widget.AppCompatMultiAutoCompleteTextView;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.AppCompatSeekBar;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.ProgressBar;
import android.widget.QuickContactBadge;
import android.widget.RatingBar;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.ZoomControls;

public abstract class ViewCreator {

    public static View getView(ViewsCatalog viewId, Context context){

        switch (viewId){
            case BUTTON:
                return new Button(context);
            case CHECKBOX:
                return new CheckBox(context);
            case CHECKED_TEXT_VIEW:
                return new CheckedTextView(context);
            case CHRONOMETER:
                return new Chronometer(context);
            case EDIT_TEXT:
                return new EditText(context);
            case IMAGE_BUTTON:
                return new ImageButton(context);
            case IMAGE_VIEW:
                return new ImageView(context);
            case MULTI_AUTO_COMPLETE_TEXT_VIEW:
                return new AppCompatMultiAutoCompleteTextView(context);
            case NUMBER_PICKER:
                return new NumberPicker(context);
            case PROGRESS_BAR:
                return new ProgressBar(context);
            case QUICK_CONTACT_BADGE:
                return new QuickContactBadge(context);
            case RADIO_BUTTON:
                return new AppCompatRadioButton(context);
            case RATING_BAR:
                return new RatingBar(context);
            case SEARCH_VIEW:
                return new SearchView(context);
            case SEEK_BAR:
                return new AppCompatSeekBar(context);
            case SPACE:
                return new Space(context);
            case SWITCH:
                return  new SwitchCompat(context);
            case TEXT_CLOCK:
                return new TextClock(context);
            case TEXT_VIEW:
                return new TextView(context);
            case TOGGLE_BUTTON:
                return new ToggleButton(context);
            case ZOOM_CONTROLS:
                return new ZoomControls(context);

        }
        return new View(context);
    }

}
