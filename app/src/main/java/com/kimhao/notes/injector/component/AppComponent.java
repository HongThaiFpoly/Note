package com.kimhao.notes.injector.component;

import android.content.Context;

import com.kimhao.notes.App;
import com.kimhao.notes.injector.ContextLifeCycle;
import com.kimhao.notes.injector.module.AppModule;

import net.tsz.afinal.FinalDb;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    App app();
    @ContextLifeCycle("App") Context context();
    FinalDb finalDb();
    FinalDb.DaoConfig daoConfig();
}
