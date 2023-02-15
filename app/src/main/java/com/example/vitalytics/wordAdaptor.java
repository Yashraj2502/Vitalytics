package com.example.vitalytics;

import android.app.Activity;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

/**
 * {@link wordAdaptor} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link textView} objects.
 */
public class wordAdaptor extends ArrayAdapter<textView> {

    private static final String LOG_TAG = wordAdaptor.class.getSimpleName();
    /**
     * Resource ID for the background color for this list of words.
     */
    private int mColorResourceID;
    /**
     *
     */
    private MediaPlayer mediaPlayer;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context         The current context. Used to inflate the layout file.
     * @param androidFlavors  A List of AndroidFlavor objects to display in a list
     * @param colorResourceID takes in the resource ID for background color.
     */
    public wordAdaptor(Activity context, ArrayList<textView> androidFlavors, int colorResourceID) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, androidFlavors);
        mColorResourceID = colorResourceID;
    }

    @NonNull
    @Override
    /**
     *
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     *
     * @return The View for the position in the AdapterView.
     */
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getView(position, convertView, parent);
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        /**
         * Get the {@link textView} object located at this position in the list
         */

        textView currentNumberList = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.dateOutput);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentNumberList.getDate());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView translationTextView = (TextView) listItemView.findViewById(R.id.timeOutput);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        translationTextView.setText(currentNumberList.getTime());

//        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
//        ImageView iconView = (ImageView) listItemView.findViewById(R.id.icoN);
//        if (currentNumberList.hasImage()) {
//            // Get the image resource ID from the current AndroidFlavor object and
//            // set the image to iconView
//            iconView.setImageResource(currentNumberList.getImageResourceID());
//        } else {
//            iconView.setVisibility(View.GONE);
//        }

        TextView statusTextView = (TextView) listItemView.findViewById(R.id.statusOutput);
        statusTextView.setText(currentNumberList.getStatus());


        /**
         * This is used to set the background of the TextViews.
         */
//        View englishTextContainer = listItemView.findViewById(R.id.englishNumberList);
//        View miwokTextContainer = listItemView.findViewById(R.id.miwokNumberList);
//        int color = ContextCompat.getColor(getContext(), mColorResourceID);
//        englishTextContainer.setBackgroundColor(color);
//        miwokTextContainer.setBackgroundColor(color);

//        int soucre = currentNumberList.getSoundResourceID();
//        mediaPlayer = MediaPlayer.create(this, soucre);
//
//        TextView produceSoundMiwok = (TextView) listItemView.findViewById(R.id.miwokNumberList);
//        produceSoundMiwok.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mediaPlayer.start();
//            }
//        });
//
//        TextView produceSoundEnglish = (TextView) listItemView.findViewById(R.id.englishNumberList);
//        produceSoundEnglish.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mediaPlayer.start();
//            }
//        });
//
//        ImageView produceSoundImage = (ImageView) listItemView.findViewById(R.id.icoN);
//        produceSoundImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mediaPlayer.start();
//            }
//        });

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
