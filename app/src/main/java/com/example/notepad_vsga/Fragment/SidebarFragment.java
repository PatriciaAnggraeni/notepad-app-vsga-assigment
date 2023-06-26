package com.example.notepadvsgaproject.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.notepadvsgaproject.R;

public class SidebarFragment extends Fragment {

    private View view;

    public SidebarFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_sidebar, container, false);
        return view;
    }
}