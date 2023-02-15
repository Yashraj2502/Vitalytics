//package com.example.vitalytics;
//
//import android.content.Context;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.fragment.app.Fragment;
//import androidx.fragment.app.FragmentManager;
//import androidx.fragment.app.FragmentPagerAdapter;
//
///**
// * {@link simpleFragmentPagerAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
// * each list item based on a data source which is a list of {@link textView} objects.
// */
//public class simpleFragmentPagerAdapter extends FragmentPagerAdapter{
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
//        if (position == 0) {
//            return new oxygenCurrentFragment();
//        } else if (position == 1) {
//            return new oxygenFragment();
//        }
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
//}
