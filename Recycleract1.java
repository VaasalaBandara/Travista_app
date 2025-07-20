package com.example.btnrecyclerveiw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Recycleract1 extends AppCompatActivity {
//additems to the array list
    //List<place> firstplace;
    private RecyclerView placrecview;
    private rec1adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleract1);

   /*firstplace=new ArrayList<>();//arraylist for card data
   firstplace.add(new place("waterfalls",R.drawable.bambarakiri));
        firstplace.add(new place("mountains/hiking",R.drawable.hanthana));
        firstplace.add(new place("temples and places of worship",R.drawable.dalada));
        firstplace.add(new place("lakes",R.drawable.kandylake));*/

adapter=new rec1adapter(this);
placrecview=findViewById(R.id.recyclerveiw_id);

placrecview.setAdapter(adapter);
placrecview.setLayoutManager(new GridLayoutManager(this,2));

        adapter.setMdata(utils.getInstance().getAllplaces());
        /*RecyclerView myrv= (RecyclerView)findViewById(R.id.recyclerveiw_id);
        rec1adapter myadapter= new rec1adapter(this,firstplace);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myadapter);*/
    }
}
