package com.example.fitkal;
import java.util.ArrayList;
public class egzersiz3 {
    private String egzersizName;
    private String egzersizDescription;
    private int egzersizID;
    public egzersiz3(){
    }
    public egzersiz3(int egzersizID, String egzersizName, String egzersizDescription) {
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
        this.egzersizDescription = egzersizDescription;}
    public static ArrayList<egzersiz3> getData() {
        ArrayList<egzersiz3> egzersizList3 = new ArrayList<egzersiz3>();
        int egzersizImages[] = {R.drawable.havadaelayakbirlestirme,R.drawable.kolbacakcapraz
                ,R.drawable.sabitemekleme,R.drawable.yerdedizkaldirma,R.drawable.ayakkaldirma,
                R.drawable.kelebekhareketi,R.drawable.yerdeadimatma};
        String[] egzersizNames = {"Havada El Ayak Birleştirme","Kol Bacak Çapraz","Sabit Emekleme",
                "Yerde Diz Kaldırma","Ayak Kaldırma","Kelebek Hareketi","Yerde Adım Atma"};
        String [] egzersizDescriptions = {"x12","x18","x20","x20","x15","x12","x30"};
        for (int i = 0; i < egzersizImages.length; i++) {
            egzersiz3 temp = new egzersiz3();
            temp.setegzersizID(egzersizImages[i]);
            temp.setegzersizName(egzersizNames[i]);
            temp.setegzersizDescription(egzersizDescriptions[i]);
            egzersizList3.add(temp);
        }
        return egzersizList3;
    }
}
