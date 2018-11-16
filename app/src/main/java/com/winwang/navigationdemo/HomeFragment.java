package com.winwang.navigationdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class HomeFragment extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(view==null){

            view = View.inflate(getActivity(), R.layout.layout_home, null);
        }
        initView();
        return view;
    }

    private void initView() {
        NavController navController = Navigation.findNavController(view);
//        navController.navigate(R.id.action_firstFragment_to_secondFragment);
        Navigation.setViewNavController(view, navController);
    }
}
