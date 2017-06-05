package com.fee.moduleb;

import com.spinytech.macore.MaProvider;

/**
 * =========================
 * <br/>Created by weizheng on  2017/6/5
 * <br/>email: weiz@mobilereality.org
 * <br/>Version：1.0
 * <br/>description:
 * <br/>
 * =========================
 */

class ModuleBProvider extends MaProvider {
    @Override
    protected void registerActions() {
        registerAction("action_fragment_b", new FragmentBAction());
    }
}
