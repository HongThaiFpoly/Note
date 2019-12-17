package com.kimhao.notes.injector.component;

import android.content.Context;

import com.kimhao.notes.injector.Activity;
import com.kimhao.notes.injector.ContextLifeCycle;
import com.kimhao.notes.injector.module.ActivityModule;
import com.kimhao.notes.ui.MainActivity;
import com.kimhao.notes.ui.NoteActivity;
import com.kimhao.notes.ui.SettingActivity;

import net.tsz.afinal.FinalDb;

import dagger.Component;


@Activity
@Component(dependencies = AppComponent.class, modules = {ActivityModule.class})
public interface ActivityComponent {
    void inject(MainActivity activity);
    void inject(NoteActivity activity);
    void inject(SettingActivity activity);
    android.app.Activity activity();
    FinalDb finalDb();
    @ContextLifeCycle("Activity") Context activityContext();
    @ContextLifeCycle("App") Context appContext();
}
