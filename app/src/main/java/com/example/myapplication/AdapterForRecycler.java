package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterForRecycler extends RecyclerView.Adapter<AdapterForRecycler.MyViewHolder> {

    private Context context;
    private List<Adapter> list;

    private static final String TITLE = "com.example.myapplication.TITLE";
    private static final String DESC = "com.example.myapplication.DESC";
    private static final String IMG = "com.example.myapplication.IMG";

    public AdapterForRecycler(Context context, List<Adapter> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(context);
        view = mInflater.inflate(R.layout.cardview_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.textViewTitle.setText(list.get(position).getTitle());
        holder.imageView.setImageResource(list.get(position).getImg());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, ViewDataActivity.class);
                intent.putExtra(TITLE, list.get(position).getTitle());
                intent.putExtra(DESC, list.get(position).getDescription());
                intent.putExtra(IMG, list.get(position).getImg());
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle;
        ImageView imageView;
        CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);

            textViewTitle = (TextView) itemView.findViewById(R.id.title1);
            imageView = (ImageView) itemView.findViewById(R.id.img1);
            cardView = (CardView) itemView.findViewById(R.id.cardView);

        }
    }
}
