package com.example.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder>{
    private ArrayList<FragmentObject> fragmentList;
    private RecyclerViewClickListener listener;
    public Adapter(ArrayList<FragmentObject> fragmentList,RecyclerViewClickListener listener)
    {
        this.fragmentList=fragmentList;
        this.listener=listener;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        private TextView nameText;
        public MyViewHolder(final View view)
        {
            super(view);
            nameText=view.findViewById(R.id.app_name);
            view.setOnClickListener(this);
        }
        public void onClick(View view) {
            listener.onClick(view,getAdapterPosition());
        }
    }

    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String name=fragmentList.get(position).;
        holder.nameText.setText(name);
    }
    public int getItemCount()
    {
        return fragmentList.size();
    }
    public interface RecyclerViewClickListener
    {
        void onClick(View v,int position);
    }
}