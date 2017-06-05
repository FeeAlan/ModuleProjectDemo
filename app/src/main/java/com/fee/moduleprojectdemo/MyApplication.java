package com.fee.moduleprojectdemo;

import com.fee.modulea.ModuleAlogic;
import com.fee.moduleb.ModuleBlogic;
import com.spinytech.macore.MaApplication;

/**
 * =========================
 * <br/>Created by weizheng on  2017/6/5
 * <br/>email: weiz@mobilereality.org
 * <br/>Version：1.0
 * <br/>description:
 * <br/>
 * =========================
 */

public class MyApplication extends MaApplication {


    @Override
    public void initializeAllProcessRouter() {

    }

    @Override
    protected void initializeLogic() {
        registerApplicationLogic("com.fee.moduleprojectdemo", 999, MainApplicationLogic.class);
        if (!BuildConfig.isModuleDebug) {
            registerApplicationLogic("com.fee.moduleprojectdemo", 998, ModuleAlogic.class);
            registerApplicationLogic("com.fee.moduleprojectdemo", 998, ModuleBlogic.class);
        }
    }

    @Override
    public boolean needMultipleProcess() {
        return false;
    }
}
