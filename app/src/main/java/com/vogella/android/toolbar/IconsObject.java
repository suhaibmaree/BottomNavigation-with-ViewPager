package com.vogella.android.toolbar;

public enum IconsObject {
    FRAGMENTHOME(true, false, false),
    FRAGMENTONE(false, true, true),
    FRAGMENTTWO(false, false, true);

    boolean iconMenu, iconFilter, iconSearch;

    IconsObject(boolean iconMenu, boolean iconSearch, boolean iconFilter) {

        this.iconMenu = iconMenu;
        this.iconSearch = iconSearch;
        this.iconFilter = iconFilter;
    }
}
