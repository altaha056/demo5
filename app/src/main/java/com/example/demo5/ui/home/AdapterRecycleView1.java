package com.example.demo5.ui.home;/*Menginisiasi nama package dari project agar tidak terjadi crash dengan projek lain ketika diupload ke internet misal play store*/

/*melakukan impor library yang dibutuhkan class*/
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demo5.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/*membuat class public untuk mengatur activity dari recycleview dengan extend dari library recyclerview*/
public class AdapterRecycleView1 extends RecyclerView.Adapter<AdapterRecycleView1.Holder> {

    /*membuat array list untuk menampung data dari model data*/
    List<ModelData>data=new ArrayList<>();

    public AdapterRecycleView1(List<ModelData> data) {
        this.data = data;
    }/*membuat konstruktor untuk menginisialisasi data dari model data*/

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycle,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        ModelData modelData=data.get(position);
        holder.title.setText(modelData.getTitle());
        holder.description.setText(modelData.getDescription());
        Picasso.get().load(modelData.getImage()).into(holder.bgcard);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class Holder extends RecyclerView.ViewHolder{
        TextView title, description;
        ImageView bgcard;
        public Holder(@NonNull View itemView) {

            super(itemView);
            title=itemView.findViewById(R.id.title);
            description=itemView.findViewById(R.id.description);
            bgcard=itemView.findViewById(R.id.bgcard);

        }
    }
}
