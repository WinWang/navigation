package com.winwang.navigationdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;


public class FourFragment extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getActivity(), R.layout.frag_first, null);
        initView();
        return view;
    }

    private void initView() {
        AppCompatButton button = (AppCompatButton) view.findViewById(R.id.jump_bt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putInt("id",15);
                NavOptions navOptions = new NavOptions.Builder().build();
                navOptions.shouldLaunchSingleTop();
                Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment,bundle);
            }
        });
    }


//    public void jump(View view){
//        System.out.printf("我在输出数据");
////        Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment2);
//    }
}
