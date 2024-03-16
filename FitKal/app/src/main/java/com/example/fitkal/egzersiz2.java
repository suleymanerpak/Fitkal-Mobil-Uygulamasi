package com.example.fitkal;
import java.util.ArrayList;
public class egzersiz2 {
    private String egzersizName;
    private String egzersizDescription;
    private int egzersizID;
    public egzersiz2() {
    }
    public egzersiz2(int egzersizID, String egzersizName, String egzersizDescription) {
        this.egzersizID = egzersizID;
        this.egzersizName = egzersizName;
        this.egzersizDescription = egzersizDescription;
    }
    public int getegzersizID() {
        return egzersizID;
    }
    public void setegzersizID(int egzersizID) {
        this.egzersizID =egzersizID;
    }
    public String getegzersizName() {
        return egzersizName;
    }
    public void setegzersizName(String egzersizName) {
        this.egzersizName = egzersizName;
    }
    public String getegzersizDescription() {
        return egzersizDescription;
    }
    public void setegzersizDescription(String egzersizDescription) {
        this.egzersizDescription = egzersizDescription; }
    public static ArrayList<egzersiz2> getData() {
        ArrayList<egzersiz2> egzersizList2 = new ArrayList<egzersiz2>();
        int egzersizImages[] = {R.drawable.kalcakaldirma, R.drawable.mekikcekme, R.drawable.sinav,
                R.drawable.tekkolhavada, R.drawable.yerdeadimatma, R.drawable.yerindeemekleme,
                R.drawable.ziplayarakyanadim};
        String[] egzersizNames = {"Kalça Kaldırma","Mekik Çekme","Şınav Hareketi",
                "Tek Kol Havada","Yerde Adım Atma","Yerinde Emekleme","Zıplayarak Yan Adım"};
        String [] egzersizDescriptions = {"x15","x12","x20","x15","x30","x15","x12"};
        for (int i = 0; i < egzersizImages.length; i++) {
            egzersiz2 temp = new egzersiz2();
            temp.setegzersizID(egzersizImages[i]);
            temp.setegzersizName(egzersizNames[i]);
            temp.setegzersizDescription(egzersizDescriptions[i]);
            egzersizList2.add(temp);
        }
        return egzersizList2;
    }
}
