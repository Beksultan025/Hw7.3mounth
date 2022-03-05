package com.example.hw73mounth.Adapters;

import androidx.fragment.app.Fragment;

public class ModelTableLayout {
    private int imageOne;
    private int imageTwo;
    private Fragment fragment;

    public ModelTableLayout(int imageTwo, Fragment fragment) {
        this.imageTwo = imageTwo;
        this.fragment = fragment;
    }

    public int getImageOne() {
        return imageOne;
    }

    public void setImageOne(int imageOne) {
        this.imageOne = imageOne;
    }

    public int getImageTwo() {
        return imageTwo;
    }

    public void setImageTwo(int imageTwo) {
        this.imageTwo = imageTwo;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }
}
