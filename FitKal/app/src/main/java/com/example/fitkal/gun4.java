package com.example.fitkal;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
public class gun4 extends AppCompatActivity {
    TextView textView, textView2;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gun4);
        textView = findViewById(R.id.txtBaslikId);
        textView2 = findViewById(R.id.txtAciklamaId);
        imageView = findViewById(R.id.ımageViewId);
    }
}