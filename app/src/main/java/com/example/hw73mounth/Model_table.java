package com.example.hw73mounth;

import androidx.fragment.app.Fragment;

public class Model_table {
    private int image;
    private Fragment fragment;

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    public Model_table(int image, Fragment fragment) {
        this.image = image;
        this.fragment = fragment;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
