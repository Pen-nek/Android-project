package com.example.a576p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {
    ArrayList<Book> items = new ArrayList<Book>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.item_book, viewGroup, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Book item = items.get(position);
        viewHolder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(Book item) {
        items.add(item);
    }

    public void setItems(ArrayList<Book> items) {
        this.items = items;
    }

    public Book getItem(int position) {
        return items.get(position);
    }

    public void setItem(int position, Book item) {
        items.set(position, item);
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView writer;

        public ViewHolder(View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.tvTitle);
            writer = itemView.findViewById(R.id.tvWriter);
        }

        public void setItem(Book item) {
            title.setText(item.getTitle());
            writer.setText(item.getWriter());
        }

    }
}
