package com.example.esho_shikhi_bornomala.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.esho_shikhi_bornomala.R;
import com.example.esho_shikhi_bornomala.v1;
import com.example.esho_shikhi_bornomala.v10;
import com.example.esho_shikhi_bornomala.v11;
import com.example.esho_shikhi_bornomala.v2;
import com.example.esho_shikhi_bornomala.v3;
import com.example.esho_shikhi_bornomala.v4;
import com.example.esho_shikhi_bornomala.v5;
import com.example.esho_shikhi_bornomala.v6;
import com.example.esho_shikhi_bornomala.v7;
import com.example.esho_shikhi_bornomala.v8;
import com.example.esho_shikhi_bornomala.v9;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TEXT = new int[]{R.string.tab_text_1,R.string.tab_text_2,R.string.tab_text_3,R.string.tab_text_4,R.string.tab_text_5,R.string.tab_text_6,R.string.tab_text_7,R.string.tab_text_8,R.string.tab_text_9,R.string.tab,R.string.tab_text_11};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                v1 vowel1= new v1();
                return vowel1;
            case 1:
                v2 vowel2= new v2();
                return vowel2;
            case 2:
                v3 vowel3= new v3();
                return vowel3;
            case 3:
                v4 vowel4= new v4();
                return vowel4;

            case 4:
                v5 vowel5= new v5();
                return vowel5;
            case 5:
                v6 vowel6= new v6();
                return vowel6;

            case 6:
                v7 vowel7= new v7();
                return vowel7;

            case 7:
                v8 vowel8= new v8();
                return vowel8;

            case 8:
                v9 vowel9= new v9();
                return vowel9;

            case 9:
                v10 vowel10= new v10();
                return vowel10;

            case 10:
                v11 vowel11= new v11();
                return vowel11;


            default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TEXT[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 11;
    }
}