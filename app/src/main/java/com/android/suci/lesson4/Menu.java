package com.android.suci.lesson4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

/**
 * Created by SuciWulanda on 2/18/2018.
 */

public class Menu extends AppCompatActivity {

    // untuk deklarasi objek
    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // membuat adapter dan memanggil data yang akan ditampilkan
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        // menghubungkan adaptor dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // memberikan RecyclerView sebagai pengelola tata letak default.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            // memberi dan memanggil nama untuk data yang ditampilkan
            foods.add("Alola Pizza");
            foods.add("BBQ Pizza");
            foods.add("Cheese Potato Pizza");
            foods.add("Crunchy Pizza");
            foods.add("Extra Cheese Pizza");
            foods.add("Italian Pizza");
            foods.add("Mexican Pizza");
            foods.add("Mushrooms Pizza");
            foods.add("Paprica Pizza");
            foods.add("Cheese Pizza");

            // mamanggil harga
            priceses.add(25000);
            priceses.add(22000);
            priceses.add(15000);
            priceses.add(17000);
            priceses.add(10000);
            priceses.add(15000);
            priceses.add(25000);
            priceses.add(18000);
            priceses.add(20000);

            // memanggil foto yang ada di drawable
            photos.add(R.drawable.alolpizza);
            photos.add(R.drawable.bbqpizza);
            photos.add(R.drawable.cheesepotatopizza);
            photos.add(R.drawable.crunchpizza);
            photos.add(R.drawable.ekstracheese);
            photos.add(R.drawable.italianpizza);
            photos.add(R.drawable.mexicanpizza);
            photos.add(R.drawable.mushroomspizza);
            photos.add(R.drawable.papricapizza);
            photos.add(R.drawable.pizzakeju);
        }
    }
}
