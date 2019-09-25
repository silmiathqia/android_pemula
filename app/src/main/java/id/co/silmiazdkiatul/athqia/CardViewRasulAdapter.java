package id.co.silmiazdkiatul.athqia;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardViewRasulAdapter extends RecyclerView.Adapter<CardViewRasulAdapter.CardViewHolder> {

    private ArrayList<Rasul>listRasul;
    private Context context;
    private Activity activity;

    public CardViewRasulAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Rasul> getListRasul() {
        return listRasul;
    }

    public void setListRasul(ArrayList<Rasul> listRasul) {
        this.listRasul = listRasul;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_rasul, parent, false);
        CardViewHolder viewHolder = new CardViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        final Rasul k = getListRasul().get(position);
        Glide.with(context).load(k.getPhoto()).override(350,550).into(holder.imgPhoto);
        holder.tvname.setText(k.getName());
        holder.tvremarks.setText(k.getRemarks());
        holder.rasul = k;



    }

    @Override
    public int getItemCount() {
        return getListRasul().size();
    }

    public void startactivity(Intent intent){

    }

    public class CardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgPhoto;
        TextView tvname, tvremarks;
        Button btndetail;
        Rasul rasul;

        public CardViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvname = itemView.findViewById(R.id.tv_item_name);
            tvremarks = itemView.findViewById(R.id.tv_item_remarks);
            btndetail = itemView.findViewById(R.id.btn_set_detail);
            btndetail.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context, DetailRasulActivity.class);
            intent.putExtra("key", rasul);
            context.startActivity(intent);
        }
    }
}