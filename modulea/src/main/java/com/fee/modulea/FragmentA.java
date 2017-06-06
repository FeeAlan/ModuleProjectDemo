package com.fee.modulea;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FragmentA extends Fragment {
    private View mView;
    private Button mBtn;

    public FragmentA() {
    }

    public static FragmentA newInstance() {
        FragmentA fragment = new FragmentA();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_a, container, false);
        mView.findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),TestActivity.class));
            }
        });
        return mView;
    }



}
