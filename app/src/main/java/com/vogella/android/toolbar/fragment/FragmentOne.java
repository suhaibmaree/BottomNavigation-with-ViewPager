package com.vogella.android.toolbar.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.vogella.android.toolbar.IconsObject;
import com.vogella.android.toolbar.R;


public class FragmentOne extends Fragment implements BaseFragment {

    private IconsObject icons = IconsObject.FRAGMENTONE;

    public FragmentOne() {
    }

    public static FragmentOne newInstance() {
        FragmentOne     mFragment = new FragmentOne();
        return mFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_one, container, false);
    }

    public IconsObject getIcons() {
        return icons;
    }
}
