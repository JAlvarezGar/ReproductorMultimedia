package com.example.jjalv.reproductormultimedia;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class DatosPersonales extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.datospersonales);
    }
}
