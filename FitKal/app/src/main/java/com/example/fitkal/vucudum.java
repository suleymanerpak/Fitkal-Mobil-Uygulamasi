package com.example.fitkal;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
public class vucudum extends AppCompatActivity {
    private EditText editText;
    private TextView boy_gos,durum_gos,ideal_gos,kilo_gos,yagsizagirlik_tv,vya_tv,vki_tv;
    private SeekBar seekBar;
    private RadioGroup radioGroup;
    private boolean erkekMi = true;
    private double boy = 0;
    private int kilo = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vucudum);
        boy_gos = findViewById(R.id.BoyGorunusId);
        durum_gos = findViewById(R.id.DurumGosterisId);
        ideal_gos = findViewById(R.id.İdealGosterisId);
        kilo_gos = findViewById(R.id.KiloGorunusId);
        yagsizagirlik_tv = findViewById(R.id.YagsizGosterisId);
        vki_tv = findViewById(R.id.VKIIdGosterisId);
        vya_tv = findViewById(R.id.VYAGosterisId);
        editText = findViewById(R.id.EditTextBoyId);
        radioGroup = findViewById(R.id.RadioGrupId);
        seekBar = findViewById(R.id.seekBarId);
        editText.addTextChangedListener(editTextOlayIsleyicisi);
        seekBar.setOnSeekBarChangeListener(seekBarOlayIsleyicisi);
        radioGroup.setOnCheckedChangeListener(radioGroupOlayIsleyicisi);
        guncelle();
    }
    public void guncelle(){
        kilo_gos.setText(String.valueOf(kilo) + "kg");
        boy_gos.setText(String.valueOf(boy));
        vki_tv.setText(" ");
        int BayİdealKilo = (int) (50 + 2.3 * (boy * 100 * 0.4 - 60));
        int BayanİdealKilo = (int) (45.5 + 2.3 * (boy * 100 * 0.4 - 60));
        double vki = kilo / (boy * boy);
        double vya = 0.20247 * Math.pow(boy,0.725) * Math.pow(kilo,0.425);
        if (boy <= 0) {
            ideal_gos.setText("");
            durum_gos.setText("");
        }
        else {
            if (erkekMi) {
                ideal_gos.setText(String.valueOf(BayİdealKilo));
                int ideal_kiloBay = (int) (50+2.3*((boy*100*0.4)-60));
                int yagsizAgirlik_Bay = (int) ((1.10 * kilo) - (128 * (kilo*kilo)/ Math.pow((100 * boy),2)));
                ideal_gos.setText(String.valueOf(ideal_kiloBay));
                yagsizagirlik_tv.setText(String.valueOf(yagsizAgirlik_Bay));
                vki_tv.setText(String.valueOf(vki));
                vya_tv.setText(String.valueOf(vya));
                if (vki <= 17.5) {
                    durum_gos.setBackgroundResource(R.color.cokzayif);
                    durum_gos.setText(R.string.cokzayif);
                } else if (vki > 17.5 && vki <= 20.7) {
                    durum_gos.setBackgroundResource(R.color.zayif);
                    durum_gos.setText(R.string.zayif);
                } else if (vki > 20.7 && vki <= 26.4) {
                    durum_gos.setBackgroundResource(R.color.ideal);
                    durum_gos.setText(R.string.ideal);
                } else if (vki > 26.4 && vki <= 27.8) {
                    durum_gos.setBackgroundResource(R.color.birazFazla);
                    durum_gos.setText(R.string.birazFazla);
                } else if (vki > 27.8 && vki <= 31.1) {
                    durum_gos.setBackgroundResource(R.color.fazla);
                    durum_gos.setText(R.string.fazla);
                } else if (vki > 31.1 && vki <= 34.9) {
                    durum_gos.setBackgroundResource(R.color.cokFazla);
                    durum_gos.setText(R.string.cokFazla);
                } else if (vki > 34.9 && vki <= 40) {
                    durum_gos.setBackgroundResource(R.color.riskli);
                    durum_gos.setText(R.string.riskli);
                } else if (vki > 40 && vki <= 50) {
                    durum_gos.setBackgroundResource(R.color.hasta);
                    durum_gos.setText(R.string.hasta);
                } else {
                    durum_gos.setBackgroundResource(R.color.superkilo);
                    durum_gos.setText(R.string.superkilo);
                }
            }
            else {
                ideal_gos.setText(String.valueOf(BayanİdealKilo));
                int yagsizAgirlik_Bayan = (int) ((1.07 * kilo) - (148 * (kilo*kilo)/ Math.pow((100 * boy),2)));
                int ideal_kiloBayan = (int) (45.5+2.3*((boy*100*0.4)-60));
                ideal_gos.setText(String.valueOf(ideal_kiloBayan));
                yagsizagirlik_tv.setText(String.valueOf(yagsizAgirlik_Bayan));
                vki_tv.setText(String.valueOf(vki));
                vya_tv.setText(String.valueOf(vya));
                if (vki <= 17.5) {
                    durum_gos.setBackgroundResource(R.color.cokzayif);
                    durum_gos.setText(R.string.cokzayif);
                } else if (vki > 17.5 && vki <= 19.1) {
                    durum_gos.setBackgroundResource(R.color.zayif);
                    durum_gos.setText(R.string.zayif);
                } else if (vki > 19.1 && vki <= 25.8) {
                    durum_gos.setBackgroundResource(R.color.ideal);
                    durum_gos.setText(R.string.ideal);
                } else if (vki > 25.8 && vki <= 27.3) {
                    durum_gos.setBackgroundResource(R.color.birazFazla);
                    durum_gos.setText(R.string.birazFazla);
                } else if (vki > 27.3 && vki <= 32.3) {
                    durum_gos.setBackgroundResource(R.color.fazla);
                    durum_gos.setText(R.string.fazla);
                } else if (vki > 32.3 && vki <= 34.9) {
                    durum_gos.setBackgroundResource(R.color.cokFazla);
                    durum_gos.setText(R.string.cokFazla);
                } else if (vki > 34.9 && vki <= 40) {
                    durum_gos.setBackgroundResource(R.color.riskli);
                    durum_gos.setText(R.string.riskli);
                } else if (vki > 40 && vki <= 50) {
                    durum_gos.setBackgroundResource(R.color.hasta);
                    durum_gos.setText(R.string.hasta);
                } else {
                    durum_gos.setBackgroundResource(R.color.superkilo);
                    durum_gos.setText(R.string.superkilo);
                }
            }
        }
    }
    private RadioGroup.OnCheckedChangeListener radioGroupOlayIsleyicisi = new
            RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int i) {
                    if (i == R.id.RadioBayId)
                        erkekMi = true;
                    else if (i == R.id.RadioBayan)
                        erkekMi = false;
                    guncelle();
                }
            };
    private SeekBar.OnSeekBarChangeListener seekBarOlayIsleyicisi = new
            SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                    kilo = 30+i;
                    guncelle();
                }
                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {
                }
                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {
                }
            };
    private TextWatcher editTextOlayIsleyicisi = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int
                i2) {
        }
        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            try {
                boy = Double.parseDouble(charSequence.toString())/100.0;
            }catch (NumberFormatException e){
                boy = 0.0;
            }
            guncelle();
        }
        @Override
        public void afterTextChanged(Editable editable) {
        }
    };
}