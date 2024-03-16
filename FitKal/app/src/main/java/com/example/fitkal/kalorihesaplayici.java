package com.example.fitkal;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class kalorihesaplayici extends AppCompatActivity {
    private HashMap _$_findCachedViewById;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_kalorihesaplayici);
        ListView listview = this.findViewById(R.id.listView);
        boolean var4 = false;
        List list = (List) (new ArrayList());
        TextView calorieText = this.findViewById(R.id.calorieText);
        Button reset = this.findViewById(R.id.reset);
        final TextView value = this.findViewById(R.id.valueCal);
        list.add(new modelkalori("Ayran", " Ayran : 37 cal", R.drawable.ayran));
        list.add(new modelkalori("Badem", "Badem : 598 cal", R.drawable.almond));
        list.add(new modelkalori("Beyaz Peynir", "Beyaz Peynir : 289 cal", R.drawable.cheese));
        list.add(new modelkalori("Biftek", "Biftek : 156 cal", R.drawable.steak));
        list.add(new modelkalori("Burrito", " Burrito : 163 cal", R.drawable.burrito));
        list.add(new modelkalori("Ceviz", "Ceviz : 651 cal", R.drawable.walnut));
        list.add(new modelkalori("Çikolata", "Çikolata barı : 200 cal", R.drawable.chocolate));
        list.add(new modelkalori("Çilek", "Çilek : 110 cal", R.drawable.strawberry));
        list.add(new modelkalori("Cips", "Cips : 155 cal", R.drawable.potatochips));
        list.add(new modelkalori("Dondurma", "Dondurma : 100 cal", R.drawable.icecream));
        list.add(new modelkalori("Donut", "Donut : 110 cal", R.drawable.donut));
        list.add(new modelkalori("Ekmek", "4 dilim ekmek :65 cal", R.drawable.bread));
        list.add(new modelkalori("Elma", "Elma : 114 cal", R.drawable.apple));
        list.add(new modelkalori("Erik", "Erik : 75 cal", R.drawable.plum));
        list.add(new modelkalori("Fındık", "Fındık : 634 cal", R.drawable.hazelnut));
        list.add(new modelkalori("Hamburger", "Hamburger: 200 cal", R.drawable.hamburger));
        list.add(new modelkalori("Hamsi", "Hamsi : 131 cal", R.drawable.anchovy));
        list.add(new modelkalori("Havuç", " Havuç : 30 cal", R.drawable.carrot));
        list.add(new modelkalori("Hindi", "Hindi : 160 cal", R.drawable.turkey));
        list.add(new modelkalori("Kayısı", "Kayısı : 51 cal", R.drawable.apricot));
        list.add(new modelkalori("Kiraz", "Kiraz : 70 cal", R.drawable.cherry));
        list.add(new modelkalori("Kola", "Kola :140 cal", R.drawable.coke));
        list.add(new modelkalori("Lazanya", "Lazanya : 132 cal", R.drawable.lasagna));
        list.add(new modelkalori("Levrek Fileto", "Levrek Fileto : 98 cal", R.drawable.seabass));
        list.add(new modelkalori("Midye", "1 adet midye : 10 cal", R.drawable.mussel));
        list.add(new modelkalori("Muffin", "Muffin : 47 cal", R.drawable.muffin));
        list.add(new modelkalori("Muz", "Muz : 85 cal", R.drawable.banana));
        list.add(new modelkalori("Noodle", "Noodle : 140 cal", R.drawable.noodle));
        list.add(new modelkalori("Pasta", "1 dilim pasta : 132 cal", R.drawable.cake));
        list.add(new modelkalori("Patates Kızartması", "M boy patates kızartması : 110 cal", R.drawable.frenchfries));
        list.add(new modelkalori("Patlamış Mısır", "Patlamış Mısır : 478 cal", R.drawable.popcorn));
        list.add(new modelkalori("Pilav", "Plain Rice : 200 cal", R.drawable.rice));
        list.add(new modelkalori("Pizza", " 1 dilim pizza : 250 cal", R.drawable.pizza));
        list.add(new modelkalori("Portakal", " Portakal : 52 cal", R.drawable.orange));
        list.add(new modelkalori("Salam", "Salam : 450 cal", R.drawable.salami));
        list.add(new modelkalori("Salata", "Çoban Salatası : 50 cal", R.drawable.salad));
        list.add(new modelkalori("Şeftali", "Şeftali : 38 cal", R.drawable.peach));
        list.add(new modelkalori("Somon Füme", "Somon Füme : 117 cal", R.drawable.salmon));
        list.add(new modelkalori("Sosis", "Sosis : 322  cal", R.drawable.hotdog));
        list.add(new modelkalori("Sucuk", "Sucuk : 452 cal", R.drawable.sucuk));
        list.add(new modelkalori("Süt", "Süt : 61 cal", R.drawable.milk));
        list.add(new modelkalori("Taco", "Taco : 217  cal", R.drawable.taco));
        list.add(new modelkalori("Tavuk Eti", "Tavuk Eti : 220 cal", R.drawable.chicken));
        list.add(new modelkalori("Ton Balığı", "Ton Balığı : 115 cal", R.drawable.tuna));
        list.add(new modelkalori("Üzüm", "Üzüm : 67 cal", R.drawable.grape));
        list.add(new modelkalori("Yoğurt", "Yoğurt : 62 cal", R.drawable.yogurt));
        list.add(new modelkalori("Yumurta", "Yumurta : 70 cal", R.drawable.hazelnut));
        listview.setAdapter((ListAdapter) new foodAdapter(this, R.layout.listview_row, list));
        ((ListView)this.findViewById(R.id.listView)).setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public final void onItemClick(@NotNull AdapterView parent, @NotNull View view, int position, long id) {
                TextView var10000;
                TextView var10001;
                String var6;
                boolean var7;
                if (position == 0) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 37));
                }
                if (position == 1) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 598));
                }
                if (position == 2) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 289));
                }
                if (position == 3) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 156));
                }
                if (position == 4) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 163));
                }
                if (position == 5) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 651));
                }
                if (position == 6) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 200));
                }
                if (position == 7) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 110));
                }
                if (position == 8) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 155));
                }
                if (position == 9) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 100));
                }
                if (position == 10) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 110));
                }
                if (position == 11) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 65));
                }
                if (position == 12) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 114));
                }
                if (position == 13) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 75));
                }
                if (position == 14) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 634));
                }
                if (position == 15) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 200));
                }
                if (position == 16) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 131));
                }
                if (position == 17) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 30));
                }
                if (position == 18) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 160));
                }
                if (position == 19) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 51));
                }
                if (position == 20) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 70));
                }
                if (position == 21) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 140));
                }
                if (position == 22) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 132));
                }
                if (position == 23) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 98));
                }
                if (position == 24) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 10));
                }
                if (position == 25) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 47));
                }
                if (position == 26) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 85));
                }
                if (position == 27) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 140));
                }
                if (position == 28) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 132));
                }
                if (position == 29) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 110));
                }
                if (position == 30) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 478));
                }
                if (position == 31) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 200));
                }
                if (position == 32) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 250));
                }
                if (position == 33) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 52));
                }
                if (position == 34) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 450));
                }
                if (position == 35) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 50));
                }
                if (position == 36) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 38));
                }
                if (position == 37) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 117));
                }
                if (position == 38) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 322));
                }
                if (position == 39) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 452));
                }
                if (position == 40) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 61));
                }
                if (position == 41) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 217));
                }
                if (position == 42) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 220));
                }
                if (position == 43) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 115));
                }
                if (position == 44) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 67));
                }
                if (position == 45) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 62));
                }
                if (position == 46) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 70));
                }
            }
        });
        reset.setOnClickListener(new OnClickListener() {
            public final void onClick(View it) {
                value.setText("0");
            }
        });
    }
}