package com.blogspot.yourfavoritekaisar.aboutpancasila;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {

    @BindView(R.id.sila1)
    ImageView sila1;
    @BindView(R.id.txtSila)
    TextView txtSila;
    @BindView(R.id.txtDetail)
    TextView txtDetail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);

        Glide.with(this).load(getIntent().getIntExtra("gs", 0)).into(sila1);
        txtSila.setText(getIntent().getStringExtra("ns"));
        txtDetail.setText(getIntent().getStringExtra("ds"));
    }
}
