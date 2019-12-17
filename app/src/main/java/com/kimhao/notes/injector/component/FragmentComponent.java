package com.kimhao.notes.injector.component;

import com.kimhao.notes.injector.Fragment;
import com.kimhao.notes.injector.module.FragmentModule;
import com.kimhao.notes.ui.fragments.SettingFragment;

import dagger.Component;

/**
 * Created by lgp on 2015/9/3.
 */
@Fragment
@Component(dependencies = {ActivityComponent.class}, modules = {FragmentModule.class})
public interface FragmentComponent {
    void inject(SettingFragment fragment);
}
