package com.example.category;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

import adapter.GroceryProductAdapter;
import model.Grocery;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private GroceryProductAdapter mAdapter;
    private List<Grocery> mProductList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting the recyclerview from xml
        mRecyclerView = (RecyclerView) findViewById(R.id.RecyclerViewid);
        //mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Populate the products
        mProductList = new ArrayList<>();
//        Fruits and Veggies
        mProductList.add(new Grocery("Mango",R.drawable.mango,"Rs. 300", "1 kg", "5"));
        mProductList.add(new Grocery("Pineapple",R.drawable.pine,"Rs. 50", "1 Piece", "10"));
        mProductList.add(new Grocery("Strawberry",R.drawable.straw,"Rs. 500", "1 kg", "8"));
        mProductList.add(new Grocery("Broccoli",R.drawable.brocli,"Rs. 80", "1 Piece", "6"));
        mProductList.add(new Grocery("Capsicum",R.drawable.capsicum,"Rs. 45", "1 kg", "8"));
//        Beverages
        mProductList.add(new Grocery("Coco-Cola",R.drawable.cokezero,"Rs. 40", "1 Bottle", "7"));
        mProductList.add(new Grocery("Pepsi",R.drawable.pepsi,"Rs. 40", "1 Bottle", "2"));
        mProductList.add(new Grocery("Fruit Juice",R.drawable.tropicana,"Rs. 90", "1 Liter Packs", "8"));
        mProductList.add(new Grocery("Red Bull",R.drawable.redbull,"Rs. 115", "1 Cans", "11"));
        mProductList.add(new Grocery("Soda Water",R.drawable.sodawater,"Rs. 30", "1 Liter", "6"));
//        Biscuits Snacks and Chocolates
        mProductList.add(new Grocery("Oreo",R.drawable.oreo,"Rs. 30", "1 Piece", "4"));
        mProductList.add(new Grocery("Dairy Milk Silk",R.drawable.silk,"Rs. 75", "1 Piece", "3"));
        mProductList.add(new Grocery("Choco Cookies ",R.drawable.chunkies,"Rs. 50", "1 Piece", "7"));
        mProductList.add(new Grocery("Dipped Oreo",R.drawable.dippedoreo,"Rs. 60", "1 Piece", "9"));
        mProductList.add(new Grocery("Lays",R.drawable.images,"Rs. 20", "1 Packet", "25"));
//        Grocery and Staples
        mProductList.add(new Grocery("Flour",R.drawable.flour,"Rs. 38", "1 kg", "7"));
        mProductList.add(new Grocery("Rice",R.drawable.rice,"Rs. 80", "1 kg", "9"));
        mProductList.add(new Grocery("Cooking Oil",R.drawable.oil,"Rs. 500", "20 kg", "6"));
        mProductList.add(new Grocery("Salt",R.drawable.salt,"Rs. 20", "1 kg", "1"));
        mProductList.add(new Grocery("Sugar",R.drawable.sugar,"Rs. 150", "5 kg", "5"));
        //set adapter to recyclerview
        mAdapter = new GroceryProductAdapter(mProductList,this);
        mRecyclerView.setAdapter(mAdapter);
    }
}