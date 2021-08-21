package ir.dotprint.news;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.view.View;

public class Details extends AppCompatActivity {

    AppCompatImageView imgtoolbar,imgback;
    AppCompatTextView titledetail,textdetail,txtdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        findview();
        startac();
    }

    void findview(){
        imgback=findViewById(R.id.imgback);
        imgtoolbar=findViewById(R.id.imgtoolbar);
        titledetail=findViewById(R.id.titledetail);
        textdetail=findViewById(R.id.txtdetail);
        txtdate=findViewById(R.id.txtdate);

    }

    void startac(){
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        textdetail.setText(getIntent().getStringExtra("txttext"));
        titledetail.setText(getIntent().getStringExtra("txttitle"));
        txtdate.setText(getIntent().getStringExtra("date"));
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }
}