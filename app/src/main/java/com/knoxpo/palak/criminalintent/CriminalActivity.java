package com.knoxpo.palak.criminalintent;

public class CriminalActivity extends SingleFragmentActivity {

    @Override
    protected CrimeListFragment createFragment() {
        return new CrimeListFragment();
    }
}
