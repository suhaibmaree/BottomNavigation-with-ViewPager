package com.vogella.android.toolbar;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.vogella.android.toolbar.fragment.FragmentOne;
import com.vogella.android.toolbar.fragment.FragmentTwo;
import com.vogella.android.toolbar.fragment.HomeFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.viewpager)
    ViewPager mViewPager;

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @BindView(R.id.bottom_navigation)
    BottomNavigationView mBottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setupToolbar();
        setupViewPager(mViewPager);
        addListener();
    } //end onCreate

    private void setupToolbar() {
        mToolbar.setTitle("Home");
        mToolbar.inflateMenu(R.menu.main);
    }// end setup Toolbar

    private void addListener() {

        mBottomNavigationView.setOnNavigationItemSelectedListener(menuItem -> {
            switch (menuItem.getItemId()) {
                case R.id.home_icon:
                    mViewPager.setCurrentItem(0);
                    Manager.changeIcon(mToolbar, HomeFragment.newInstance());
                    return true;

                case R.id.frag_one_icon:
                    mViewPager.setCurrentItem(1);
                    Manager.changeIcon(mToolbar, FragmentOne.newInstance());
                    return true;

                case R.id.frag_two_icon:

                    mViewPager.setCurrentItem(2);
                    Manager.changeIcon(mToolbar, FragmentTwo.newInstance());
                    return true;
            }
            return false;
        });
    }// end listener

    private void setupViewPager(ViewPager viewPager) {

        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        adapter.addFragment(HomeFragment.newInstance());
        adapter.addFragment(FragmentOne.newInstance());
        adapter.addFragment(FragmentTwo.newInstance());

        viewPager.setAdapter(adapter);
    } //end setup viewpager


}
