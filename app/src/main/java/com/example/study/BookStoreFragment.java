package com.example.study;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BookStoreFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View bookstoreLayout = inflater.inflate ( R.layout.bookstore_layout ,container,false);
        return bookstoreLayout;
    }
}
