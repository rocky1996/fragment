package com.example.study;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BookShelfFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View bookshelfLayout = inflater.inflate ( R.layout.bookshelf_layout ,container,false);
        return bookshelfLayout;
    }
}
