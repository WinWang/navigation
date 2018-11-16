package com.winwang.navigationdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

public class SecondFragment extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getActivity(), R.layout.frag_second, null);
        initView();
        return view;
    }

    private void initView() {
//        Bundle arguments = getArguments();
//        int id = arguments.getInt("id");
//        System.out.println("获取的数据" + id);
        final View viewById = view.findViewById(R.id.jump_bt);
        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("name","这是我的测试文字");
                NavOptions navOptions = new NavOptions.Builder().build();
                navOptions.shouldLaunchSingleTop();
                Navigation.findNavController(viewById).navigate(R.id.action_secondFragment_to_naviActivity,bundle,navOptions);
            }
        });
    }
}
