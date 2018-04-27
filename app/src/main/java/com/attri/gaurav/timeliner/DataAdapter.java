package com.attri.gaurav.timeliner;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<postData> posts;

    public DataAdapter(ArrayList<postData> posts) {
        this.posts = posts;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.eachcard, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i) {

        viewHolder.username.setText(posts.get(i).name);
        viewHolder.caption.setText(posts.get(i).caption);
        String str = posts.get(i).downloadUrl;
        Picasso.with(viewHolder.itemView.getContext()).load(str).placeholder(R.mipmap.ic_image).into(viewHolder.post_image);
    }

    @Override
    public int getItemCount() {
        if(posts!= null)
            return posts.size();
        else
            return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView username,caption;
        private ImageView post_image;

        public ViewHolder(View view) {
            super(view);

            username = (TextView)view.findViewById(R.id.username);
            caption = (TextView)view.findViewById(R.id.caption);
            post_image = (ImageView)view.findViewById(R.id.post_image);
        }
    }

}