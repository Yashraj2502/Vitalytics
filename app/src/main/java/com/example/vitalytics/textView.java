package com.example.vitalytics;

/**
 * {@link textView} represents a single Android platform release.
 * Each object has 3 properties: name, version number, and image resource ID.
 */
public class textView {
    /**
     * Creating a value to set the default value of Resource ID as -1, since no color has a negative value.
     * Indicating it has no color.
     */
//    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Default translation for the word
     */
    private String mDate;
    /**
     * Miwok translation for the word
     */
    private String mTime;
    /**
     * Drawable resource ID
     */
    private String mStatus;
    /**
     *
     */
    private String mPercent;


    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     */

    public textView(String dateInput, String timeInput, String percentInput) {

        mDate = dateInput;
        mTime = timeInput;
        mPercent = percentInput;;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param imageResourceID    is used for storing the resource ID for the images linked to the words.
     */
    public textView(String dateInput, String timeInput, String statusInput, String percentInput) {
        mDate = dateInput;
        mTime = timeInput;
        mStatus = statusInput;
        mPercent = percentInput;
    }

    /**
     * Get the default translation of the word.
     *
     * @return the value/word of the english language.
     */
    public String getDate() {
        return mDate;
    }

    /**
     * Get the Miwok translation of the word.
     *
     * @return the value/word of Miwok language.
     */
    public String getTime() {
        return mTime;
    }

    /**
     * Get the image resource Id.
     *
     * @return the value of Image Resource ID.
     */
    public String getStatus() {
        return mStatus;
    }

    /**
     *
     */
    public String getPercent() {
        return mPercent;
    }

    /**
     * Returns the string representation of the {@link textView} object.
     */
    @Override
    public String toString() {
        return "textView{" +
                "Date='" + mDate + '\'' +
                ", Time='" + mTime + '\'' +
                ", Status=" + mStatus +
                ", Percent=" + mPercent +
                '}';
    }
}
