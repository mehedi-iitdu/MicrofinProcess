package com.example.mehedi.microfinprocess.processCard;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mehedi.microfinprocess.Listener;
import com.example.mehedi.microfinprocess.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 1/23/17.
 */

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder>{

    Context context;
    List<CardData> cardDatas = new ArrayList<>();
    LayoutInflater inflater;
    Listener listener;

    public CardAdapter(Context context, List <CardData> cardDatas){
        this.context = context;
        this.cardDatas = cardDatas;
        this.listener = (Listener) listener;
        this.inflater = LayoutInflater.from(context);

    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.custom_card, parent, false);
        CardViewHolder cardViewHolder = new CardViewHolder(view);
        return cardViewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        holder.bind(cardDatas.get(position),listener);
    }

    @Override
    public int getItemCount() {

        return cardDatas.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder{

        ImageView iv_process_image;
        TextView tv_process_name;

        public CardViewHolder(View itemView) {
            super(itemView);

            iv_process_image = (ImageView) itemView.findViewById(R.id.process_image);
            tv_process_name = (TextView) itemView.findViewById(R.id.process_name);
        }

        public void bind(final CardData cardData, final Listener listener){

            iv_process_image.setImageResource(cardData.getProcess_image());
            tv_process_name.setText(cardData.getProcess_name());
        }
    }
}
