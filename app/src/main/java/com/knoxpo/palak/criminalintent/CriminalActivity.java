package com.knoxpo.palak.criminalintent;

import android.content.Context;
import android.content.Intent;

import java.util.UUID;

public class CriminalActivity extends SingleFragmentActivity {

    private static final String EXTRA_CRIME_ID =
            "com.knoxpo.palak.criminalintent.crime_id";

    public static Intent newIntent(Context packageContext, UUID crimeId) {
        Intent intent = new Intent(packageContext, CriminalActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, crimeId);
        return intent;
    }

    @Override
    protected CrimeFragment createFragment() {

        UUID CrimeId=(UUID) getIntent().getSerializableExtra(EXTRA_CRIME_ID);
        return createFragment().newInstance(crimeId);

    }
}
