package com.kimhao.notes.utils;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.kimhao.notes.R;
import com.kimhao.notes.ui.BaseActivity;


public class ToolbarUtils {

    public static void initToolbar(Toolbar toolbar, AppCompatActivity activity){
        if (toolbar == null || activity == null)
            return;
        if (activity instanceof BaseActivity){
            toolbar.setBackgroundColor(((BaseActivity) activity).getColorPrimary());
        }else {
            toolbar.setBackgroundColor(activity.getResources().getColor(R.color.toolbar_bg_color));
        }
        toolbar.setTitle(R.string.app_name);
        toolbar.setTitleTextColor(activity.getResources().getColor(R.color.toolbar_title_color));
        toolbar.collapseActionView();
        activity.setSupportActionBar(toolbar);
        if (activity.getSupportActionBar() != null){
            activity.getSupportActionBar().setHomeAsUpIndicator(R.drawable.abc_ic_ab_back_mtrl_am_alpha);
            activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
}
