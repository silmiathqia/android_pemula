package id.co.silmiazdkiatul.athqia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCategory;
    private ArrayList<Rasul>list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(RasulData.getListData());
        showRecylerCardView();

    }

    private void showRecylerCardView() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewRasulAdapter cardViewRasulAdapter= new CardViewRasulAdapter(this);
        cardViewRasulAdapter.setListRasul(list);
        rvCategory.setAdapter(cardViewRasulAdapter);

    }

}
