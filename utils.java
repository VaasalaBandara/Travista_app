package com.example.btnrecyclerveiw;

import java.util.ArrayList;

//probably database class in real world
public class utils {

    private static  utils instance;
    private utils() {
        if(null==allplaces){
            allplaces=new ArrayList<>();
            initdata();
        }
    }

    private void initdata() {
        allplaces.add(new place("Bambarakiri fall District:",R.drawable.bambarakiri,1,"one onique and beautifu waterfall"));
        allplaces.add(new place("Aberdeen fall",R.drawable.hanthana,2,"one onique and beautifu waterfall"));
        allplaces.add(new place("Kahanwita fall",R.drawable.dalada,3,"one onique and beautifu waterfall"));
        allplaces.add(new place("Alihatha",R.drawable.kandylake,4,"one onique and beautifu waterfall"));
        allplaces.add(new place("Allewela elle",R.drawable.kandylake,5,"one onique and beautifu waterfall"));
        allplaces.add(new place("Sapugahadola",R.drawable.kandylake,6,"one onique and beautifu waterfall"));
        allplaces.add(new place("Hewawinna",R.drawable.kandylake,7,"one onique and beautifu waterfall"));
        allplaces.add(new place("Galboda",R.drawable.kandylake,8,"one onique and beautifu waterfall"));
        allplaces.add(new place("Makeli elle",R.drawable.kandylake,9,"one onique and beautifu waterfall"));
        allplaces.add(new place("Galpoththa",R.drawable.kandylake,10,"one onique and beautifu waterfall"));
        allplaces.add(new place("Rajanawa elle",R.drawable.kandylake,11,"one onique and beautifu waterfall"));
        allplaces.add(new place("Koslanda",R.drawable.kandylake,12,"one onique and beautifu waterfall"));
        allplaces.add(new place("Sera elle",R.drawable.kandylake,13,"one onique and beautifu waterfall"));
        allplaces.add(new place("Jodu elle",R.drawable.kandylake,14,"one onique and beautifu waterfall"));
        allplaces.add(new place("Geradi elle",R.drawable.kandylake,15,"one onique and beautifu waterfall"));
        allplaces.add(new place("Rathna elle",R.drawable.kandylake,16,"one onique and beautifu waterfall"));
    }
    //static lists

    private static ArrayList<place> allplaces;

    public static  utils getInstance() {
        if(null !=instance){
            return  instance;
        }else{
            instance= new utils();
            return  instance;
        }

    }
    //getting items from lists

    public static ArrayList<place> getAllplaces() {
        return allplaces;
    }

    public place getplacebyid(int Id){
        for(place b: allplaces){
            if (b.getId()==Id){
                return  b;
            }
        }
        return null;
    }
}
