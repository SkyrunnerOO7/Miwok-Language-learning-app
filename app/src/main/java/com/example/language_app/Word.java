package com.example.language_app;

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static  final int NO_IMAGE_PROVIDED = -1;


    /*
    * Constructor
    * */
    public Word(String defaultTranslation,String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation,String miwokTranslation,int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    /*
    * get the Default translation of the word*/
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /*
     * get the Miwok translation of the word*/
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    /*
     * get the images*/
    public int getmImageResourceId(){return mImageResourceId;}

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
