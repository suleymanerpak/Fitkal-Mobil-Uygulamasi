package com.example.fitkal;
import java.util.ArrayList;
public class egzersiz {
    private String egzersizName;
    private String egzersizDescription;
    private int egzersizID;
    public egzersiz() {
    }
    public egzersiz(int egzersizID, String egzersizName, String egzersizDescription) {
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
        this.egzersizDescription = egzersizDescription;
    }
    public static ArrayList<egzersiz> getData() {
        ArrayList<egzersiz> egzersizList = new ArrayList<egzersiz>();
        int egzersizImages[] = {R.drawable.ayakkaldirma, R.drawable.havadaelayakbirlestirme,
                R.drawable.kalcakaldirma,R.drawable.kelebekhareketi,R.drawable.kolbacakcapraz,
                R.drawable.mekikcekme,
                R.drawable.sabitemekleme, R.drawable.sinav,
                R.drawable.tekkolhavada,R.drawable.yerdeadimatma,
                R.drawable.yerdedizkaldirma,R.drawable.yerindeemekleme,R.drawable.ziplayarakyanadim};
        String[] egzersizNames = {"Ayak Kaldırma", "Havada El Ayak Birleştirme", "Kalça Kaldırma",
                "Kelebek Hareketi","Kol Bacak Çapraz","Mekik Çekme",
                "Sabit Emekleme","Şınav Hareketi","Tek Kol Havada","Yerde Adım Atma","Yerde Diz Kaldırma",
                "Yerinde Emekleme","Zıplayarak Yan Adım"};
        String [] egzersizDescriptions = {"x15","x12","x15","x12","x18","x12",
                "x20","x20","x15","x30","x20","x15","x12"};
        for (int i = 0; i < egzersizImages.length; i++) {
            egzersiz temp = new egzersiz();
            temp.setegzersizID(egzersizImages[i]);
            temp.setegzersizName(egzersizNames[i]);
            temp.setegzersizDescription(egzersizDescriptions[i]);
            egzersizList.add(temp);
        }
        return egzersizList;
    }
}
