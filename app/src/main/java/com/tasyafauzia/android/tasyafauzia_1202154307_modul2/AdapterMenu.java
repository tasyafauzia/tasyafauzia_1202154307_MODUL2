package com.tasyafauzia.android.tasyafauzia_1202154307_modul2;


import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


/**
 * Created by Tasya Fauzia on 2/18/2018.
 */

public class AdapterMenu extends RecyclerView.Adapter<AdapterMenu.MyViewHolder> {
    private List<Menu> menuList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView photo;
        public TextView nama, harga, tanda;

        public MyViewHolder(View itemView) {
            super(itemView);
            photo = (ImageView) itemView.findViewById(R.id.photo);
            nama = (TextView) itemView.findViewById(R.id.nama);
            harga = (TextView) itemView.findViewById(R.id.harga);
            tanda = (TextView) itemView.findViewById(R.id.tanda);
        }
    }

    public AdapterMenu (List<Menu> menuList) {

        this.menuList = menuList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listmenu, parent, false);

        return new MyViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        Menu menu = menuList.get(position);
        holder.tanda.setText(""+position);
        holder.photo.setImageResource(menu.getPhoto());
        holder.nama.setText(menu.getNama());
        holder.harga.setText(menu.getHarga());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String komp = holder.tanda.getText().toString();
                Log.d("ItemMenuCLICKED","ID:"+komp);
                Intent i = new Intent(view.getContext().getApplicationContext(),MenuDetail .class);
                i.putExtra("MenuID",""+komp);
                view.getContext().startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {

        return menuList.size();
    }
}
