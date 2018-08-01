package com.example.study;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SearchBookFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View searchbookLayout = inflater.inflate ( R.layout.searchbook_layout ,container,false);
        return searchbookLayout;
    }
}
