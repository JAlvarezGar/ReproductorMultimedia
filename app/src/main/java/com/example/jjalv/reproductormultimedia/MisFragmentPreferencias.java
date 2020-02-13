package com.example.jjalv.reproductormultimedia;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.support.annotation.Nullable;

import java.util.List;

public class MisFragmentPreferencias extends PreferenceActivity {
    @Override
    public void onBuildHeaders(List<Header> target) {
        super.onBuildHeaders(target);
        loadHeadersFromResource(R.xml.preferences_headers,target);
    }

    @Override
    protected boolean isValidFragment (String fragmentName) {
        if (DatosPersonales.class.getName().equals(fragmentName)) return true;
        return false;
    }
}
