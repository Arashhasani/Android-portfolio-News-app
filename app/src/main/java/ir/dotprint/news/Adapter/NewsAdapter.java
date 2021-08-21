package ir.dotprint.news.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import ir.dotprint.news.Details;
import ir.dotprint.news.Model.NewsItems;
import ir.dotprint.news.R;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder>{
    ArrayList<NewsItems> newsItems;
    Context context;

    public NewsAdapter(ArrayList<NewsItems> newsItems, Context context) {
        this.newsItems = newsItems;
        this.context = context;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.newslayouthorizental,null);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        NewsItems items=newsItems.get(position);
        Picasso.get().load(R.drawable.ic_baseline_account_circle_24).into(holder.imgauthor);
        Picasso.get().load(R.drawable.p1).into(holder.imgpost);
        holder.txttitle.setText(items.getTitle());
        holder.txtdate.setText(items.getDate());
        holder.crdpost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, Details.class).putExtra("imgtoolbar",items.getImgpost()).putExtra("txttitle",items.getTitle()).putExtra("txttext",items.getFulldes()).putExtra("date",items.getDate()));

            }
        });



    }

    @Override
    public int getItemCount() {
        return newsItems.size();
    }

    class NewsViewHolder extends RecyclerView.ViewHolder {

        CardView crdpost;
        AppCompatImageView imgpost,imgauthor;
        AppCompatTextView txttitle,txtdate;
         public NewsViewHolder(@NonNull View itemView) {
             super(itemView);
             crdpost=itemView.findViewById(R.id.crdpost);
             imgpost=itemView.findViewById(R.id.imgpost);
             imgauthor=itemView.findViewById(R.id.imgauthor);
             txttitle=itemView.findViewById(R.id.txttitle);
             txtdate=itemView.findViewById(R.id.txtdate);
         }
     }
}
