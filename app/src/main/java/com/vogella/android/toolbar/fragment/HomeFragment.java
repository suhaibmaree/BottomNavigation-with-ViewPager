package com.vogella.android.toolbar.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.vogella.android.toolbar.IconsObject;
import com.vogella.android.toolbar.R;


public class HomeFragment extends Fragment implements BaseFragment{

    private IconsObject mModelObject = IconsObject.FRAGMENTHOME;


    public HomeFragment() {
    }

    public static HomeFragment newInstance() {
        HomeFragment mFragment = new HomeFragment();
        return mFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home , container , false);
    }

    @Override
    public IconsObject getIcons() {
        return mModelObject;
    }
}
