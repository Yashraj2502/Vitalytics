package com.example.vitalytics;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link oxygenFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class oxygenFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public oxygenFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment oxygenFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static oxygenFragment newInstance(String param1, String param2) {
        oxygenFragment fragment = new oxygenFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView =inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<textView> oxy = new ArrayList<>();
        oxy.add(new textView("19-01-2023", "01:45:12", "Very Poor", "79%"));
        oxy.add(new textView("19-01-2023", "01:45:12", "Very Poor", "79%"));
        oxy.add(new textView("19-01-2023", "01:45:12", "Very Poor", "79%"));
        oxy.add(new textView("19-01-2023", "01:45:12", "Very Poor", "79%"));
        oxy.add(new textView("19-01-2023", "01:45:12", "Very Poor", "79%"));
        oxy.add(new textView("19-01-2023", "01:45:12", "Very Poor", "79%"));
        oxy.add(new textView("19-01-2023", "01:45:12", "Very Poor", "79%"));

//        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
//        // adapter knows how to create list items for each item in the list.
//        wordAdapter numAdapter = new wordAdapter(getActivity(), num, R.color.categoryNumbers);
//
//        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
//        // There should be a {@link ListView} with the view ID called list, which is declared in the
//        // word_list.xml layout file.
//        ListView listView = (ListView) rootView.findViewById(R.id.list);
//        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
//        // {@link ListView} will display list items for each {@link Word} in the list.
//        listView.setAdapter(numAdapter);
//
//        // Set a click listener to play the audio when the list item is clicked on
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                // Release the media player if it currently exists because we are about to
//                // play a different sound file
//                releaseMediaPlayer();
//
//                // Get the {@link Word} object at the given position the user clicked on
//                textView word = num.get(position);
//
//                // Request audio focus so in order to play the audio file. The app needs to play a
//                // short audio file, so we will request audio focus with a short amount of time
//                // with AUDIOFOCUS_GAIN_TRANSIENT.
//                int result = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener,
//                        AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
//
//                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
//                    // We have audio focus now.
//
//                    // Create and setup the {@link MediaPlayer} for the audio resource associated
//                    // with the current word
//                    mediaPlayer = MediaPlayer.create(getContext(), word.getSoundResourceID());
//
//                    // Start the audio file
//                    mediaPlayer.start();
//
//                    // Setup a listener on the media player, so that we can stop and release the
//                    // media player once the sound has finished playing.
//                    mediaPlayer.setOnCompletionListener(completionListener);
//                }
//            }
//        });



        return rootView;
    }
}