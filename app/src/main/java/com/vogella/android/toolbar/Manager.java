package com.vogella.android.toolbar;

import androidx.appcompat.widget.Toolbar;

import com.vogella.android.toolbar.fragment.BaseFragment;

public class Manager {

    private static Manager mManager;

    private Manager() {
    }

    public static Manager getInstance() {
        if (mManager == null)
            return new Manager();
        return mManager;
    }

    public static void changeIcon(Toolbar toolbar, BaseFragment fragment) {

        IconsObject icons = fragment.getIcons();

        toolbar.setTitle(fragment.getTitle());
        toolbar.getMenu().findItem(R.id.menu).setVisible(icons.iconMenu);
        toolbar.getMenu().findItem(R.id.Search).setVisible(icons.iconSearch);
        toolbar.getMenu().findItem(R.id.Filter).setVisible(icons.iconFilter);
    }
}
