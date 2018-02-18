package com.tasyafauzia.android.tasyafauzia_1202154307_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ListMenu extends AppCompatActivity {
    //membuat arraylist
    public static ArrayList<Menu> menuList = new ArrayList<>();
    //memasukkan variable kedalam viewholder untuk recycleview dan menu adapter
    private RecyclerView recyclerView;
    private AdapterMenu mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);

        menuList = isiMenu();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new AdapterMenu(menuList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        //Give the recycleView a default layout manager.
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        // Connect the adapter with the RecyclerView.
        recyclerView.setAdapter(mAdapter);

    } //isi dari menu
    public ArrayList<Menu> isiMenu(){
        ArrayList<Menu> data = new ArrayList<>();
        data.add(new Menu(R.drawable.bbq,"Barbeque", "Harga : Rp.35.000", "Beef, Ketchup, Oil, "));
        data.add(new Menu(R.drawable.bokumbab,"Bokumbab", "Harga : Rp.40.000", ""));
        data.add(new Menu(R.drawable.dolsot,"Dolsot", "Harga : Rp.40.000", ""));
        data.add(new Menu(R.drawable.topokki,"Topokki", "Harga : Rp.43.000", ""));
        data.add(new Menu(R.drawable.chicken,"Chicken", "Harga : Rp.32.000", "Chicken, "));
        data.add(new Menu(R.drawable.kidsmeal,"KidsMeal", "Harga : Rp.45.000", ""));
        data.add(new Menu(R.drawable.cheesechicken,"CheeseChicken", "Harga : Rp.45.000", "Cheese, Chicken, Salt"));


        return data;
}
}
