package com.blogspot.yourfavoritekaisar.aboutpancasila;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class AdapterPancasila extends RecyclerView.Adapter<AdapterPancasila.ViewHolder>{
    Context context;
    int[] gambarSila;
    String [] DetailSila, NamaSila;

    public AdapterPancasila(Context context, int[] gambarSila, String[] detailSila, String[] namaSila) {
        this.context = context;
        this.gambarSila = gambarSila;
        this.DetailSila = detailSila;
        this.NamaSila = namaSila;
    }


    @NonNull
    @Override
    public AdapterPancasila.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_sila, viewGroup,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPancasila.ViewHolder viewHolder, final int i) {
        viewHolder.txtSila.setText(NamaSila[i]);
        Glide.with(context).load(gambarSila[i]).into(viewHolder.logo);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(context,DetailActivity.class);
                pindah.putExtra("ds",DetailSila[i]);
                pindah.putExtra("ns",NamaSila[i]);
                pindah.putExtra("gs",gambarSila[i]);
                context.startActivity(pindah);

            }
        });

    }

    @Override
    public int getItemCount() { return gambarSila.length; }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logo;
        TextView txtSila, DetailSila;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logo = itemView.findViewById(R.id.listSila);
            DetailSila = itemView.findViewById(R.id.txtDetail);
            txtSila = itemView.findViewById(R.id.txtListSila);

        }
    }
}
