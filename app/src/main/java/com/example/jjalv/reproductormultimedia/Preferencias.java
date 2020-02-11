package com.example.jjalv.reproductormultimedia;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by jjalv on 11/02/2020.
 */
public class Preferencias  extends PreferenceActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preferencias);



    }
}
