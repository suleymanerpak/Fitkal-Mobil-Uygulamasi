package com.example.fitkal;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class anasayfa extends AppCompatActivity {
    Button buton1;
    Button buton2;
    Button buton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anasayfa);
        buton1 = this.findViewById(R.id.BtnEgzersizler);
        buton2 = this.findViewById(R.id.BtnKalori);
        buton3 = this.findViewById(R.id.BtnVucut);
        buton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(anasayfa.this,egzersizanasayfa.class);
                startActivity(intent);
            }
        });
        buton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(anasayfa.this,kalorihesaplayici.class);
                startActivity(intent);
            }
        });
        buton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(anasayfa.this,vucudum.class);
                startActivity(intent);
            }
        });
    }
}