package ir.dotprint.news;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import ir.dotprint.news.Adapter.NewsAdapter;
import ir.dotprint.news.Adapter.NewsAdaptervertical;
import ir.dotprint.news.Model.NewsItems;

public class MainActivity extends AppCompatActivity {

    String shortlorem="Lorem Ipsum is simply dummy text of the printing";
    String longlorem="Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
    RecyclerView recyclerlastnews , recyclerpopular;
    NewsAdapter newsAdapter;
    NewsAdaptervertical newsAdaptervertical;
    ArrayList<NewsItems> newsItems = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findviews();
        startac();
    }



    void findviews(){
        recyclerlastnews=findViewById(R.id.recyclerlastnews);
        recyclerpopular=findViewById(R.id.recyclerpopular);
    }

    void startac(){
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        recyclerlastnews.setLayoutManager(new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false));
        newsAdapter=new NewsAdapter(newsItems,MainActivity.this);
        newsAdaptervertical= new NewsAdaptervertical(newsItems,MainActivity.this);
        recyclerlastnews.setAdapter(newsAdapter);
        recyclerpopular.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerpopular.setAdapter(newsAdaptervertical);
        setdata();

    }

    void setdata(){
        newsItems.add(new NewsItems("1",shortlorem,shortlorem,longlorem,"R.drawable.p1","R.drawable.ic_baseline_account_circle_24","Sunday, Mordad 17, 1400"));
        newsItems.add(new NewsItems("1",shortlorem,shortlorem,longlorem,"R.drawable.p1","R.drawable.ic_baseline_account_circle_24","Sunday, Mordad 17, 1400"));
        newsItems.add(new NewsItems("1",shortlorem,shortlorem,longlorem,"R.drawable.p1","R.drawable.ic_baseline_account_circle_24","Sunday, Mordad 17, 1400"));
        newsItems.add(new NewsItems("1",shortlorem,shortlorem,longlorem,"R.drawable.p1","R.drawable.ic_baseline_account_circle_24","Sunday, Mordad 17, 1400"));
        newsItems.add(new NewsItems("1",shortlorem,shortlorem,longlorem,"R.drawable.p1","R.drawable.ic_baseline_account_circle_24","Sunday, Mordad 17, 1400"));
        newsItems.add(new NewsItems("1",shortlorem,shortlorem,longlorem,"R.drawable.p1","R.drawable.ic_baseline_account_circle_24","Sunday, Mordad 17, 1400"));
        newsItems.add(new NewsItems("1",shortlorem,shortlorem,longlorem,"R.drawable.p1","R.drawable.ic_baseline_account_circle_24","Sunday, Mordad 17, 1400"));
        newsItems.add(new NewsItems("1",shortlorem,shortlorem,longlorem,"R.drawable.p1","R.drawable.ic_baseline_account_circle_24","Sunday, Mordad 17, 1400"));
        newsItems.add(new NewsItems("1",shortlorem,shortlorem,longlorem,"R.drawable.p1","R.drawable.ic_baseline_account_circle_24","Sunday, Mordad 17, 1400"));
        newsItems.add(new NewsItems("1",shortlorem,shortlorem,longlorem,"R.drawable.p1","R.drawable.ic_baseline_account_circle_24","Sunday, Mordad 17, 1400"));
        newsItems.add(new NewsItems("1",shortlorem,shortlorem,longlorem,"R.drawable.p1","R.drawable.ic_baseline_account_circle_24","Sunday, Mordad 17, 1400"));
        newsItems.add(new NewsItems("1",shortlorem,shortlorem,longlorem,"R.drawable.p1","R.drawable.ic_baseline_account_circle_24","Sunday, Mordad 17, 1400"));
        newsItems.add(new NewsItems("1",shortlorem,shortlorem,longlorem,"R.drawable.p1","R.drawable.ic_baseline_account_circle_24","Sunday, Mordad 17, 1400"));
        newsItems.add(new NewsItems("1",shortlorem,shortlorem,longlorem,"R.drawable.p1","R.drawable.ic_baseline_account_circle_24","Sunday, Mordad 17, 1400"));

        newsAdapter.notifyDataSetChanged();
        newsAdaptervertical.notifyDataSetChanged();
    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("title");
        builder.setMessage("just a simple message ...");
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.create().show();
    }
}