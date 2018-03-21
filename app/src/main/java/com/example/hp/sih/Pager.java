package com.example.hp.sih;

/**
 * Created by hp on 3/21/2018.
 */

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class Pager extends FragmentStatePagerAdapter {

    int tabCount;

    public Pager(FragmentManager fm, int tabCount){
        super(fm);
        this.tabCount=tabCount;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        switch(position){
            case 0 :
                pollution pollutiontab=new pollution();
                return pollutiontab;
            case 1 :
                encroachment encroachmenttab=new encroachment();
                return encroachmenttab;
            case 2 :
               RRR RRRtab=new RRR();
                return RRRtab;
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
