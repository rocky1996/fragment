package com.example.study;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private BookShelfFragment bookShelfFragment;
    private BookStoreFragment bookStoreFragment;
    private WriterFragment writerFragment;
    private MeFragment meFragment;
    private SearchBookFragment searchBookFragment;

    private List<View> bottomTabs;
    private View bookshelfLayout;
    private View bookstoreLayout;
    private View searchbookfLayout;
    private View writerLayout;
    private View meLayout;

    private ImageView bookshelfImage;
    private ImageView bookstoreImage;
    private ImageView searchbookImage;
    private ImageView writerImage;
    private ImageView meImage;

    private TextView bookshelfText;
    private TextView bookstoreText;
    private TextView searchbookText;
    private TextView writerText;
    private TextView meText;

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        if(getSupportActionBar () != null){
            getSupportActionBar ().hide ();
        }
        setContentView ( R.layout.activity_main );
        initViews();
        fragmentManager = getFragmentManager ();
        setSelectTab(0);
    }

    private void initViews(){
        bookshelfLayout = findViewById ( R.id.bookshelf_layout );
        searchbookfLayout = findViewById ( R.id.searchshelf_layout );
        bookstoreLayout = findViewById ( R.id.bookstore_layout );
        writerLayout = findViewById ( R.id.writer_layout );
        meLayout = findViewById ( R.id.me_layout );

        bookshelfImage = (ImageView)findViewById ( R.id.home_bookshelf_image );
        searchbookImage = (ImageView)findViewById ( R.id.home_searchshelf_image );
        bookstoreImage = (ImageView)findViewById ( R.id.home_booksrore_image );
        writerImage = (ImageView)findViewById ( R.id.writer_image );
        meImage = (ImageView)findViewById ( R.id.me_image );

        bookshelfText = (TextView)findViewById ( R.id.home_bookshelf_text );
        searchbookText = (TextView)findViewById ( R.id.home_searchbook_text );
        bookstoreText = (TextView)findViewById ( R.id.home_bookstore_text );
        writerText = (TextView)findViewById ( R.id.writer_text );
        meText = (TextView)findViewById ( R.id.me_text );

        bookshelfLayout.setOnClickListener ( this );
        searchbookfLayout.setOnClickListener ( this );
        bookstoreLayout.setOnClickListener ( this );
        writerLayout.setOnClickListener ( this );
        meLayout.setOnClickListener ( this );

        bottomTabs = new ArrayList<> ( 5 );
        bottomTabs.add ( bookshelfLayout );
        bottomTabs.add ( searchbookfLayout );
        bottomTabs.add ( bookstoreLayout );
        bottomTabs.add ( writerLayout );
        bottomTabs.add ( meLayout );
    }

    private void setSelectTab(int index){
        clearSelection ();

        //开启一个Fragment
        FragmentTransaction transaction = fragmentManager.beginTransaction ();
        hideFragments ( transaction );
        switch (index){
            case 0:
                bookshelfImage.setImageResource ( R.drawable.icon_home_tab_bookshelf );
                bookshelfText.setTextColor ( Color.parseColor ( "#00c98d" ) );
                if(bookShelfFragment == null){
                    bookShelfFragment = new BookShelfFragment ();
                    transaction.add ( R.id.content,bookShelfFragment );
                }else {
                    transaction.show ( bookShelfFragment );
                }
                break;

            case 1:
                searchbookImage.setImageResource ( R.drawable.icon_home_tab_searchbook );
                searchbookText.setTextColor ( Color.parseColor ( "#00c98d" ) );
                if(searchBookFragment == null){
                    searchBookFragment = new SearchBookFragment ();
                    transaction.add ( R.id.content,searchBookFragment );
                }else {
                    transaction.show ( searchBookFragment );
                }
                break;

            case 2:
                bookstoreImage.setImageResource ( R.drawable.icon_home_tab_bookstore );
                bookstoreText.setTextColor ( Color.parseColor ( "#00c98d" ) );
                if(bookStoreFragment == null){
                    bookStoreFragment = new BookStoreFragment ();
                    transaction.add ( R.id.content,bookStoreFragment );
                }else {
                    transaction.show ( bookStoreFragment );
                }
                break;

            case 3:
                writerImage.setImageResource ( R.drawable.icon_home_tab_writer_n );
                writerText.setTextColor ( Color.parseColor ( "#00c98d" ) );
                if(writerFragment == null){
                    writerFragment = new WriterFragment ();
                    transaction.add ( R.id.content,writerFragment );
                }else {
                    transaction.show ( writerFragment );
                }
                break;

            case 4:
                meImage.setImageResource ( R.drawable.icon_home_tab_me );
                meText.setTextColor ( Color.parseColor ( "#00c98d" ) );
                if(meFragment == null){
                    meFragment = new MeFragment ();
                    transaction.add ( R.id.content,meFragment );
                }else {
                    transaction.show ( meFragment );
                }
                break;
                default:
                    break;
        }
        transaction.commit ();
    }

    @Override
    public void onClick(View v){
        switch (v.getId ()){
            case R.id.bookshelf_layout:
                setSelectTab ( 0 );
                break;
            case R.id.searchshelf_layout:
                setSelectTab ( 1 );
                break;
            case R.id.bookstore_layout:
                setSelectTab ( 2 );
                break;
            case R.id.writer_layout:
                setSelectTab ( 3 );
                break;
            case R.id.me_layout:
                setSelectTab ( 4 );
                break;
                default:
                    break;

        }
    }

    private void clearSelection(){
        bookshelfImage.setImageResource ( R.drawable.icon_home_tab_bookshelf );
        bookshelfText.setTextColor ( Color.parseColor ( "#82858b" ) );
        searchbookImage.setImageResource ( R.drawable.icon_home_tab_searchbook );
        searchbookText.setTextColor ( Color.parseColor ( "#82858b" ) );
        bookstoreImage.setImageResource ( R.drawable.icon_home_tab_bookstore );
        bookstoreText.setTextColor ( Color.parseColor ( "#82858b" ) );
        writerImage.setImageResource ( R.drawable.icon_home_tab_writer_n );
        writerText.setTextColor ( Color.parseColor ( "#82858b" ) );
        meImage.setImageResource ( R.drawable.icon_home_tab_me );
        meText.setTextColor ( Color.parseColor ( "#82858b" ) );
    }

    private void hideFragments(FragmentTransaction transaction){
        if(bookShelfFragment != null){
            transaction.hide ( bookShelfFragment );
        }
        if(searchBookFragment != null){
            transaction.hide ( searchBookFragment );
        }
        if(bookStoreFragment != null){
            transaction.hide ( bookStoreFragment );
        }
        if(writerFragment != null){
            transaction.hide ( writerFragment );
        }
        if(meFragment != null){
            transaction.hide ( meFragment );
        }
    }
}
