package com.example.fitkal;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
public class egzersizanasayfa extends AppCompatActivity {
    Button buton,buton2,buton3,buton5,
            buton6,buton7,buton9,buton10,buton11,buton13,buton14,buton15;
    ImageButton buton4,buton8,buton12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egzersizanasayfa);
        buton = findViewById(R.id.Btn1);
        buton2 = findViewById(R.id.Btn2);
        buton3 = findViewById(R.id.Btn3);
        buton4 = findViewById(R.id.Btn4);
        buton5 = findViewById(R.id.Btn5);
        buton6 = findViewById(R.id.Btn6);
        buton7 = findViewById(R.id.Btn7);
        buton8 = findViewById(R.id.Btn8);
        buton9 = findViewById(R.id.Btn9);
        buton10 = findViewById(R.id.Btn10);
        buton11 = findViewById(R.id.Btn11);
        buton12 = findViewById(R.id.Btn12);
        buton13 = findViewById(R.id.Btn13);
        buton14 = findViewById(R.id.Btn14);
        buton15 = findViewById(R.id.Btn15);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(egzersizanasayfa.this, gun1.class);
                startActivity(intent);
            }
        });
        buton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(egzersizanasayfa.this, gun2.class);
                startActivity(intent2);
            }
        });
        buton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(egzersizanasayfa.this, gun3.class);
                startActivity(intent3);
            }
        });
        buton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(egzersizanasayfa.this, gun4.class);
                startActivity(intent4);
            }
        });
        buton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(egzersizanasayfa.this, gun5.class);
                startActivity(intent5);
            }
        });
        buton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(egzersizanasayfa.this, gun6.class);
                startActivity(intent6);
            }
        });
        buton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent7 = new Intent(egzersizanasayfa.this, gun7.class);
                startActivity(intent7);
            }
        });
        buton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent8 = new Intent(egzersizanasayfa.this, gun8.class);
                startActivity(intent8);
            }
        });
        buton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent9 = new Intent(egzersizanasayfa.this, gun9.class);
                startActivity(intent9);
            }
        });
        buton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent10 = new Intent(egzersizanasayfa.this, gun10.class);
                startActivity(intent10);
            }
        });
        buton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent11 = new Intent(egzersizanasayfa.this, gun11.class);
                startActivity(intent11);
            }
        });
        buton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent12 = new Intent(egzersizanasayfa.this, gun12.class);
                startActivity(intent12);
            }
        });
        buton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent13 = new Intent(egzersizanasayfa.this, gun13.class);
                startActivity(intent13);
            }
        });
        buton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent14 = new Intent(egzersizanasayfa.this, gun14.class);
                startActivity(intent14);
            }
        });
        buton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent15 = new Intent(egzersizanasayfa.this, gun15.class);
                startActivity(intent15);
            }
        });
    }
}