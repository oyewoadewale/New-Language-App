package com.example.hp.newlanguage;

public class Word {

    /**
     * {@link Word} represents a vocabulary word that the user wants to learn.
     * It contains a default translation and a Miwok translation for that word.
     */


    /**
     * Constant value that represents no image provided for the word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;
    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;
    /**
     * Audio resource id for the word
     */
    private int mAudioResourceid;
    /**
     * Image resource to be  displayed
     **/

    private int mImageresource = NO_IMAGE_PROVIDED;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param audioResourceId    is the audio file associated with the word
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceid = audioResourceId;
    }


    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     *
     * @param imageresource is the image resource that is set on the screen at runtime
     * @param audioResourceId    is the audio file associated with the word
     */

    public Word(String defaultTranslation, String miwokTranslation, int imageresource, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageresource = imageresource;
        mAudioResourceid = audioResourceId;

    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslatio() {
        return mMiwokTranslation;
    }

    /**
     * Get the Image associated with the word.
     */

    public int getImageresourceid() {
        return mImageresource;
    }

    /**
     * this method return the audio id for the word.
     */

    public int getmAudioResourceid() {
        return mAudioResourceid;
    }

    /**
     * return whether or not there is an Image for this word.
     */

    public boolean hasImage() {

        return mImageresource != NO_IMAGE_PROVIDED;
    }

}