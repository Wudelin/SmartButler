package com.example.wudelin.smartbutler.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wudelin.smartbutler.R;

/**
 * 项目名：  SmartButler
 * 包名：    com.example.wudelin.smartbutler.fragment
 * 创建者：   wdl
 * 创建时间： 2018/3/22 13:12
 * 描述：    美女社区
 */

public class GirlFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_girl,null);
        return view;
    }
}
