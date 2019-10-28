package com.example.esho_shikhi_bornomala;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class content_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_4);
    }

    public void content_4_onClick(View v){
        if(v.getId()==R.id.shore_o_id){
            Intent intent = new Intent(this,mw_v1.class);
            intent.putExtra("vowels","v1");
            startActivity(intent);
        }

        else if(v.getId()==R.id.shore_a_id){
            Intent intent = new Intent(this,mw_v1.class);
            intent.putExtra("vowels","v2");
            startActivity(intent);
        }


        else if(v.getId()==R.id.hrossho_e_id){
            Intent intent = new Intent(this,mw_v1.class);
            intent.putExtra("vowels","v3");
            startActivity(intent);
        }

        else if(v.getId()==R.id.dirgho_e_id){
            Intent intent = new Intent(this,mw_v1.class);
            intent.putExtra("vowels","v4");
            startActivity(intent);
        }

        else if(v.getId()==R.id.hrossho_u_id){
            Intent intent = new Intent(this,mw_v1.class);
            intent.putExtra("vowels","v5");
            startActivity(intent);
        }

        else if(v.getId()==R.id.dirgho_u_id){
            Intent intent = new Intent(this,mw_v1.class);
            intent.putExtra("vowels","v6");
            startActivity(intent);
        }

        else if(v.getId()==R.id.hrii_id){
            Intent intent = new Intent(this,mw_v1.class);
            intent.putExtra("vowels","v7");
            startActivity(intent);
        }

        else if(v.getId()==R.id.e_id){
            Intent intent = new Intent(this,mw_v1.class);
            intent.putExtra("vowels","v8");
            startActivity(intent);
        }

        else if(v.getId()==R.id.oiii_id){
            Intent intent = new Intent(this,mw_v1.class);
            intent.putExtra("vowels","v9");
            startActivity(intent);
        }

        else if(v.getId()==R.id.ooo_id){
            Intent intent = new Intent(this,mw_v1.class);
            intent.putExtra("vowels","v10");
            startActivity(intent);
        }

        else if(v.getId()==R.id.ouu_id){
            Intent intent = new Intent(this,mw_v1.class);
            intent.putExtra("vowels","v11");
            startActivity(intent);
        }
    }
}
