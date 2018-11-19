package com.blogspot.yourfavoritekaisar.aboutpancasila;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleActivity extends AppCompatActivity {

    String[] NamaSila,DetailSila;
    int[] gambarSila;
    @BindView(R.id.my_recycler_view)
    RecyclerView myRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);


        NamaSila = getResources().getStringArray(R.array.nama_sila);
        DetailSila = getResources().getStringArray(R.array.detail_sila);
        gambarSila = new int[]{R.drawable.silapertama,R.drawable.sila2,R.drawable.sila3,R.drawable.sila4,R.drawable.sila5};

        AdapterPancasila adapterPancasila = new AdapterPancasila(RecycleActivity.this,gambarSila,DetailSila, NamaSila);

        myRecyclerView.setHasFixedSize(true);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(RecycleActivity.this));
        myRecyclerView.setAdapter((RecyclerView.Adapter) adapterPancasila);

    }
}
