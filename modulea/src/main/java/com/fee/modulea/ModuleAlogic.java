package com.fee.modulea;

import com.spinytech.macore.multiprocess.BaseApplicationLogic;
import com.spinytech.macore.router.LocalRouter;

/**
 * =========================
 * <br/>Created by weizheng on  2017/6/5
 * <br/>email: weiz@mobilereality.org
 * <br/>Version：1.0
 * <br/>description:
 * <br/>
 * =========================
 */

public class ModuleAlogic extends BaseApplicationLogic {
    @Override
    public void onCreate() {
        super.onCreate();
        LocalRouter.getInstance(mApplication).registerProvider("modulea",new ModuleAProvider());

    }
}
