package com.example.btnrecyclerveiw;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class rec1adapter extends RecyclerView.Adapter <rec1adapter.MyVeiwHolder> {
//new
    public rec1adapter(Context mcontext) {
        this.mcontext = mcontext;
    }

    private Context mcontext;

    //new
    public void setMdata(List<place> mdata) {
        this.mdata = mdata;
    }

    private List<place> mdata;//array list for the card data


   /* public rec1adapter(Context mcontext, List<place> mdata) {
        this.mcontext = mcontext;
        this.mdata = mdata;
    }*/

    //code for the veiwholder
    @NonNull
    @Override
    public MyVeiwHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflator = LayoutInflater.from(mcontext);
        view = mInflator.inflate(R.layout.card1, parent, false);
        return new MyVeiwHolder(view);
    }

    //importing getters and setters for the items of veiw
    @Override
    public void onBindViewHolder(@NonNull MyVeiwHolder holder, int position) {
        holder.card_title.setText(mdata.get(position).getTitle());
        holder.card_image.setImageResource(mdata.get(position).getThumbnail());

//new//set click listener
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mcontext,PlaceActivity.class);
                intent.putExtra("placeId",mdata.get(position).getId());
                mcontext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }


    //set the references for the cardveiw items
    public static class MyVeiwHolder extends RecyclerView.ViewHolder{

        TextView card_title;
        ImageView card_image;
        CardView parent;





        public MyVeiwHolder(@NonNull View itemView){
            super(itemView);

            card_title = (TextView) itemView.findViewById(R.id.placeTxt);
            card_image = (ImageView) itemView.findViewById(R.id.placeImg);
parent=(CardView)itemView.findViewById(R.id.parent);



        }


    }


}


