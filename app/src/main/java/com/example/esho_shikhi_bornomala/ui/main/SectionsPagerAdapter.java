package com.example.esho_shikhi_bornomala.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.esho_shikhi_bornomala.R;
import com.example.esho_shikhi_bornomala.con1;
import com.example.esho_shikhi_bornomala.con10;
import com.example.esho_shikhi_bornomala.con11;
import com.example.esho_shikhi_bornomala.con12;
import com.example.esho_shikhi_bornomala.con13;
import com.example.esho_shikhi_bornomala.con14;
import com.example.esho_shikhi_bornomala.con15;
import com.example.esho_shikhi_bornomala.con16;
import com.example.esho_shikhi_bornomala.con17;
import com.example.esho_shikhi_bornomala.con18;
import com.example.esho_shikhi_bornomala.con19;
import com.example.esho_shikhi_bornomala.con2;
import com.example.esho_shikhi_bornomala.con20;
import com.example.esho_shikhi_bornomala.con21;
import com.example.esho_shikhi_bornomala.con22;
import com.example.esho_shikhi_bornomala.con23;
import com.example.esho_shikhi_bornomala.con24;
import com.example.esho_shikhi_bornomala.con25;
import com.example.esho_shikhi_bornomala.con26;
import com.example.esho_shikhi_bornomala.con27;
import com.example.esho_shikhi_bornomala.con28;
import com.example.esho_shikhi_bornomala.con29;
import com.example.esho_shikhi_bornomala.con3;
import com.example.esho_shikhi_bornomala.con30;
import com.example.esho_shikhi_bornomala.con31;
import com.example.esho_shikhi_bornomala.con32;
import com.example.esho_shikhi_bornomala.con33;
import com.example.esho_shikhi_bornomala.con34;
import com.example.esho_shikhi_bornomala.con35;
import com.example.esho_shikhi_bornomala.con36;
import com.example.esho_shikhi_bornomala.con37;
import com.example.esho_shikhi_bornomala.con38;
import com.example.esho_shikhi_bornomala.con39;
import com.example.esho_shikhi_bornomala.con4;
import com.example.esho_shikhi_bornomala.con5;
import com.example.esho_shikhi_bornomala.con6;
import com.example.esho_shikhi_bornomala.con7;
import com.example.esho_shikhi_bornomala.con8;
import com.example.esho_shikhi_bornomala.con9;
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
    private static final int[] TAB_TEXT = new int[]{R.string.tab_text_1,R.string.tab_text_2,R.string.tab_text_3,R.string.tab_text_4,
                                                    R.string.tab_text_5,R.string.tab_text_6,R.string.tab_text_7,R.string.tab_text_8,
                                                    R.string.tab_text_9,R.string.tab,R.string.tab_text_11,R.string.tab_text_12,
                                                    R.string.tab_text_13,R.string.tab_text_14,R.string.tab_text_15,R.string.tab_text_16,
                                                    R.string.tab_text_17,R.string.tab_text_18,R.string.tab_text_19,R.string.tab_text_20,
                                                    R.string.tab_text_21,R.string.tab_text_22,R.string.tab_text_23,R.string.tab_text_24,
                                                    R.string.tab_text_25,R.string.tab_text_26,R.string.tab_text_27,R.string.tab_text_28,
                                                    R.string.tab_text_29,R.string.tab_text_30,R.string.tab_text_31,R.string.tab_text_32,
                                                    R.string.tab_text_33,R.string.tab_text_34,R.string.tab_text_35,R.string.tab_text_36,
                                                    R.string.tab_text_37,R.string.tab_text_38,R.string.tab_text_39,R.string.tab_text_40,
                                                    R.string.tab_text_41,R.string.tab_text_42,R.string.tab_text_43,R.string.tab_text_44,
                                                    R.string.tab_text_45,R.string.tab_text_46,R.string.tab_text_47,R.string.tab_text_48,
                                                    R.string.tab_text_49,R.string.tab_text_50};




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


            case 11:
                con1 c1= new con1();
                return c1;



            case 12:
                con2 c2= new con2();
                return c2;

            case 13:
                con3 c3= new con3();
                return c3;


            case 14:
                con4 c4= new con4();
                return c4;


            case 15:
                con5 c5= new con5();
                return c5;


            case 16:
                con6 c6= new con6();
                return c6;


            case 17:
                con7 c7= new con7();
                return c7;


            case 18:
                con8 c8= new con8();
                return c8;


            case 19:
                con9 c9= new con9();
                return c9;


            case 20:
                con10 c10= new con10();
                return c10;

            case 21:
                con11 c11= new con11();
                return c11;


            case 22:
                con12 c12= new con12();
                return c12;


            case 23:
                con13 c13= new con13();
                return c13;


            case 24:
                con14 c14= new con14();
                return c14;


            case 25:
                con15 c15= new con15();
                return c15;


            case 26:
                con16 c16= new con16();
                return c16;


            case 27:
                con17 c17= new con17();
                return c17;


            case 28:
                con18 c18= new con18();
                return c18;

            case 29:
                con19 c19= new con19();
                return c19;

            case 30:
                con20 c20= new con20();
                return c20;

            case 31:
                con21 c21= new con21();
                return c21;

            case 32:
                con22 c22= new con22();
                return c22;

            case 33:
                con23 c23= new con23();
                return c23;

            case 34:
                con24 c24= new con24();
                return c24;

            case 35:
                con25 c25= new con25();
                return c25;

            case 36:
                con26 c26= new con26();
                return c26;

            case 37:
                con27 c27= new con27();
                return c27;


            case 38:
                con28 c28= new con28();
                return c28;


            case 39:
                con29 c29=new con29();
                return c29;


            case 40:
                con30 c30= new con30();
                return c30;


            case 41:
                con31 c31= new con31();
                return c31;


            case 42:
                con32 c32= new con32();
                return c32;


            case 43:
                con33 c33= new con33();
                return c33;


            case 44:
                con34 c34= new con34();
                return c34;

            case 45:
                con35 c35= new con35();
                return c35;

            case 46:
                con36 c36= new con36();
                return c36;


            case 47:
                con37 c37= new con37();
                return c37;

            case 48:
                con38 c38= new con38();
                return c38;

            case 49:
                con39 c39= new con39();
                return c39;







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
        return 50;
    }
}