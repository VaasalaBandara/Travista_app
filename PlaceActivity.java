package com.example.btnrecyclerveiw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceActivity extends AppCompatActivity {

    private TextView txtdesc;
    private ImageView imgdesc;
    private TextView txtTit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);

        initviews();
        //just to test ui place is obtained
       // place place=new place("waterfall",R.drawable.bambarakiri);

//calling the one cicked from adapter extra
        Intent intent=getIntent();//will receive activity cause this to launch
        if(null!=intent){
            int bookId=intent.getIntExtra("placeId",-1);
            if(bookId !=-1){//checking if book exists
                place incomingplace=utils.getInstance().getplacebyid(bookId);
                if(null!=incomingplace){
                    setData(incomingplace);
                }
            }
        }
    }
    //just to test ui
    private void setData(place place){
        txtdesc.setText(place.getTitle());
        imgdesc.setImageResource(place.getThumbnail());
        txtTit.setText(place.getDescription());
    }
    private void initviews(){
        txtdesc=findViewById(R.id.txtdesc);
        imgdesc=findViewById(R.id.imgdesc);
        txtTit=findViewById(R.id.txtTit);
    }
}
