package com.example.esho_shikhi_bornomala;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class contentActivity extends AppCompatActivity {

    ListView contentsListView;

    String[] contentGula = {" স্বরবর্ণ "," ব্যঞ্জনবর্ণ "," চলো শিখি(স্বরবর্ণ)  "," স্বরবর্ণের কিছু শব্দ ","চলো শিখি(ব্যঞ্জনবর্ণ) "," ব্যঞ্জনবর্ণের কিছু শব্দ  "," স্বরচিহ্ন  "," সংখ্যা  "};

    int[] imageGula={R.drawable.v1,R.drawable.c_1,R.drawable.cholo_shikhi_pic,R.drawable.v1_back,R.drawable.small_a_for_contents,R.drawable.aaa_kar_for_contents,R.drawable.ek_for_contents,R.drawable.one_for_contents};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content);

        contentsListView= (ListView)findViewById(R.id.listViewContentsId);

        myAdapterForContents adapterForContents = new myAdapterForContents(this,contentGula,imageGula);
        contentsListView.setAdapter(adapterForContents);

     /*   contentsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                  if(position==0){
                      Toast.makeText(contentActivity.this,"a normal text",Toast.LENGTH_SHORT);
                  }
                if(position==0){
                    Toast.makeText(contentActivity.this,"a normal text___2",Toast.LENGTH_SHORT);
                }
            }
        });*/

        contentsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Intent content1Intent =new Intent(contentActivity.this,content_1.class);
                    startActivity(content1Intent);
                }

                if(position==1)
                {
                  //  Intent content2Intent =new Intent(contentActivity.this,content_2.class);
                  //  startActivity(content2Intent);
                }
                if(position==2)
                {
                    Intent content3Intent =new Intent(contentActivity.this,content_3.class);
                    startActivity(content3Intent);
                }


                if(position==3)
                {
                    Intent content4Intent =new Intent(contentActivity.this,content_4.class);
                    startActivity(content4Intent);
                }
/*
                if(position==4)
                {
                    Intent content5Intent =new Intent(contentActivity.this,content_5.class);
                    startActivity(content5Intent);
                }*/


            }
        });
    }

    class myAdapterForContents extends ArrayAdapter<String>{

        Context context;
        String[] contentsGula2;
        int[] imageGula2;

        myAdapterForContents(Context c,String[] sArr,int[] imgArr)
        {
            super(c,R.layout.row,R.id.textView1,sArr);

            this.context =c ;
            this.contentsGula2 = sArr;
            this.imageGula2= imgArr;

        }




        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater inflaterForContentsPage = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflaterForContentsPage.inflate(R.layout.row,parent,false );

            ImageView image= row.findViewById(R.id.imageView1);
            TextView textForContent = row.findViewById(R.id.textView1);

            image.setImageResource(imageGula2[position]);

            textForContent.setText(contentsGula2[position]);
            return row;
        }
    }



}
