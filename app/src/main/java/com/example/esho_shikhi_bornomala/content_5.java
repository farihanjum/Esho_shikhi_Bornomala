package com.example.esho_shikhi_bornomala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class content_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_5);
    }



    public void content_5_onClick(View v) {
        if (v.getId() == R.id.ka_id) {
            Intent intent = new Intent(this, mw_consonants.class);
            intent.putExtra("consonants", "c1");
            startActivity(intent);
        }
        else if (v.getId() == R.id.kha_id) {
            Intent intent = new Intent(this, mw_consonants.class);
            intent.putExtra("consonants", "c2");
            startActivity(intent);
        }

        else if (v.getId() == R.id.ga_id) {
            Intent intent = new Intent(this, mw_consonants.class);
            intent.putExtra("consonants", "c3");
            startActivity(intent);
        }

        else if (v.getId() == R.id.gha_id) {
            Intent intent = new Intent(this, mw_consonants.class);
            intent.putExtra("consonants", "c4");
            startActivity(intent);
        }

        else if (v.getId() == R.id.umo_id) {
            Intent intent = new Intent(this, mw_consonants.class);
            intent.putExtra("consonants", "c5");
            startActivity(intent);
        }

        else if (v.getId() == R.id.ca_id) {
            Intent intent = new Intent(this, mw_consonants.class);
            intent.putExtra("consonants", "c6");
            startActivity(intent);
        }

        else if (v.getId() == R.id.cha_id) {
            Intent intent = new Intent(this, mw_consonants.class);
            intent.putExtra("consonants", "c7");
            startActivity(intent);
        }

        else if (v.getId() == R.id.ja_id) {
            Intent intent = new Intent(this, mw_consonants.class);
            intent.putExtra("consonants", "c8");
            startActivity(intent);
        }

        else if (v.getId() == R.id.jha_id) {
            Intent intent = new Intent(this, mw_consonants.class);
            intent.putExtra("consonants", "c9");
            startActivity(intent);
        }

        else if (v.getId() == R.id.eoo_id) {
            Intent intent = new Intent(this, mw_consonants.class);
            intent.putExtra("consonants", "c10");
            startActivity(intent);
        }

        else if (v.getId() == R.id.taa_id) {
            Intent intent = new Intent(this, mw_consonants.class);
            intent.putExtra("consonants", "c11");
            startActivity(intent);
        }

        else if (v.getId() == R.id.tha_id) {
            Intent intent = new Intent(this, mw_consonants.class);
            intent.putExtra("consonants", "c12");
            startActivity(intent);
        }

        else if (v.getId() == R.id.doo_id) {
            Intent intent = new Intent(this, mw_consonants.class);
            intent.putExtra("consonants", "c13");
            startActivity(intent);
        }

        else if (v.getId() == R.id.dha_id) {
            Intent intent = new Intent(this, mw_consonants.class);
            intent.putExtra("consonants", "c14");
            startActivity(intent);
        }
    }
}

