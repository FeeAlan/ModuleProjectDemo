package com.fee.modulea;

import android.content.Context;

import com.spinytech.macore.MaAction;
import com.spinytech.macore.MaActionResult;

import java.util.HashMap;

/**
 * =========================
 * <br/>Created by weizheng on  2017/6/5
 * <br/>email: weiz@mobilereality.org
 * <br/>Version：1.0
 * <br/>description:
 * <br/>
 * =========================
 */

public class FragmentAAction extends MaAction {
    @Override
    public boolean isAsync(Context context, HashMap<String, String> requestData) {
        return false;
    }

    @Override
    public MaActionResult invoke(Context context, HashMap<String, String> requestData) {
        return new MaActionResult.Builder()
                .code(MaActionResult.CODE_SUCCESS)
                .msg("success")
                .data("")
                .object(FragmentA.newInstance())
                .build();
    }
}
