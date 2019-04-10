package com.example.qingkan.fragments;

import android.content.Intent;
import android.support.v4.app.Fragment;

import com.example.qingkan.R;

public class BaseFragment extends Fragment {
    @Override
    public void startActivity(Intent intent) {
        getActivity().startActivity(intent);
        getActivity().overridePendingTransition(R.anim.anmi_in_right_left, R.anim.anmi_out_right_left);

    }

    @Override
    public void startActivityForResult(Intent intent, int requestCode) {
        getActivity().startActivityForResult(intent,requestCode);
        getActivity().overridePendingTransition(R.anim.anmi_in_right_left, R.anim.anmi_out_right_left);

    }
}
