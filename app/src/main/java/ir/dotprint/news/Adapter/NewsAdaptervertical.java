package ir.dotprint.news.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
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

public class NewsAdaptervertical extends RecyclerView.Adapter<NewsAdaptervertical.NewsViewHolder>{
    ArrayList<NewsItems> newsItems;
    Context context;

    public NewsAdaptervertical(ArrayList<NewsItems> newsItems, Context context) {
        this.newsItems = newsItems;
        this.context = context;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.newslayoutvertical,null);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        NewsItems items=newsItems.get(position);
        Picasso.get().load(R.drawable.p1).into(holder.imgpost2);
        holder.txttitle2.setText(items.getTitle());
        holder.txtdate2.setText(items.getDate());
        holder.relativepost2.setOnClickListener(new View.OnClickListener() {
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

        RelativeLayout relativepost2;
        AppCompatImageView imgpost2;
        AppCompatTextView txttitle2,txtdate2;
         public NewsViewHolder(@NonNull View itemView) {
             super(itemView);
             relativepost2=itemView.findViewById(R.id.relativepost2);
             imgpost2=itemView.findViewById(R.id.imgpost2);
             txttitle2=itemView.findViewById(R.id.txttitle2);
             txtdate2=itemView.findViewById(R.id.txtdate2);
         }
     }
}
