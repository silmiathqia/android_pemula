package id.co.silmiazdkiatul.athqia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailRasulActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_rasul);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Rasul rasulululazmi = getIntent().getParcelableExtra("key");

        ImageView gamabar = findViewById(R.id.img_item_photo);
        TextView name = findViewById(R.id.tv_item_name);
        TextView remarks = findViewById(R.id.tv_item_remarks);
        TextView deskripsi = findViewById(R.id.content_detail);
        TextView gelar = findViewById(R.id.content_gelar);
        TextView mukjizat = findViewById(R.id.content_mukjizat);

        Glide.with(this).load(rasulululazmi.getPhoto()).override(350,550).into(gamabar);
        name.setText(rasulululazmi.getName());
        remarks.setText(rasulululazmi.getRemarks());
        deskripsi.setText(rasulululazmi.getDeskripsi());
        gelar.setText(rasulululazmi.getGelar());
        mukjizat.setText(rasulululazmi.getMukjizat());

        Log.i("photo", rasulululazmi.getPhoto());
        Log.i("deskripsi", rasulululazmi.getDeskripsi());
    }
}
