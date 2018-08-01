package com.example.study;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WriterFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View writerLayout = inflater.inflate ( R.layout.writer_layout ,container,false);
        return writerLayout;
    }
}
