package com.vogella.android.toolbar.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.vogella.android.toolbar.IconsObject;
import com.vogella.android.toolbar.R;


public class FragmentTwo extends Fragment implements BaseFragment {

    private IconsObject mModelObject = IconsObject.FRAGMENTTWO;

    public FragmentTwo() {
    }

    public static FragmentTwo newInstance() {
        FragmentTwo mFragment = new FragmentTwo();
        return mFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_two, container, false);
    }

    @Override
    public IconsObject getIcons() {
        return mModelObject;
    }
}
