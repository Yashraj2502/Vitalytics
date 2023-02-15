package com.example.vitalytics;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

import android.os.Bundle;

import java.util.ArrayList;

/**
 * {@link simpleFragmentPagerAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link textView} objects.
 */
public class simpleFragmentPagerAdapter extends FragmentPagerAdapter {
//    private String tabTitles[] = new String[] { "Numbers", "Family", "Colors", "Phrases"};
//
//    /** Context of the app */
//    private Context context;
//
//    /**
//     * Create a new {@link simpleFragmentPagerAdapter} object.
//     *
//     * @param context is the context of the app
//     * @param fm is the fragment manager that will keep each fragment's state in the adapter
//     *           across swipes.
//     */
//    public simpleFragmentPagerAdapter(Context context, FragmentManager fm) {
//        super(fm);
//        this.context = context;
//    }
//
//    /**
//     * Return the {@link Fragment} that should be displayed for the given page number.
//     */
//    @Override
//    public Fragment getItem(int position) {
//        if (position == 0)
//            return new oxygenCurrentFragment();
//        else if (position == 1)
//            return new oxygenFragment();
//
//    }
//
//    /**
//     * Return the total number of pages.
//     */
//    @Override
//    public int getCount() {
//        return 4;
//    }
//
//    @Override
//    public CharSequence getPageTitle(int position) {
//        // Generate title based on item position
//        return tabTitles[position];
//    }
//
//
//    @Nullable
//    @Override
//    public CharSequence getPageTitle(int position) {
//        return super.getPageTitle(position);
//        if (position == 0)
//        {return context.getString(R.string.cur);}
//        else if (position == 1)
//        {return context.getString(R.string.hist);}
////        return null;
//    }
//
//    @NonNull
//    @Override
//    public Fragment getItem(int position) {
//        return null;
//    }
//
////    private int mNumOfTabs;
////
////    simpleFragmentPagerAdapter(FragmentManager fm, int NumOfTabs) {
////        super(fm);
////        this.mNumOfTabs = NumOfTabs;
////    }
////
////    // get the current item with position number
////    @Override
////    public Fragment getItem(int position) {
////        Bundle b = new Bundle();
////        b.putInt("position", position);
////        Fragment frag = dynamicFragment.newInstance();
////        frag.setArguments(b);
////        return frag;
////    }
////
////    // returnthe mNumOfTabs
////    @Override
////    public int getCount() {
////        return mNumOfTabs;
////    }

    private final ArrayList<Fragment> fragmentArrayList = new ArrayList<>();
    private final ArrayList<String> fragmentTitle = new ArrayList<>();

    public simpleFragmentPagerAdapter(@NonNull FragmentManager fm, int behaviour) {
        super(fm, behaviour);
    }

    @NonNull
    @Override
    public Fragment getItem (int position) {
        return fragmentArrayList.get(position);
    }

    @Override
    public int getCount(){
        return fragmentArrayList.size();
    }

    public void addFragment(Fragment fragment, String title){
        fragmentArrayList.add(fragment);
        fragmentTitle.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position){
        return fragmentTitle.get(position);
    }
}
