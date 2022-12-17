package com.asashka.instagrama.home;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.asashka.instagrama.Post;
import com.asashka.instagrama.R;

import java.util.ArrayList;
import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder>{

private List<Post> posts =new ArrayList<>();
public void setPosts(List<Post>posts){
    this.posts.clear();
    notifyDataSetChanged();
}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).
               inflate(R.layout.item_home,parent,false);
       return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.bind(posts.get(position));
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView profile;
        TextView name;
        ImageView image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            profile = itemView.findViewById(R.id.item_profile);
            name = itemView.findViewById(R.id.item_name);
            image = itemView.findViewById(R.id.item_image);
        }
        public void bind(Post post){
            name.setText(post.getName());
            profile.setImageURI(Uri.parse(String.valueOf(post.getProfile())));
            image.setImageURI(Uri.parse(String.valueOf(post.getImage())));
        }
    }
}
