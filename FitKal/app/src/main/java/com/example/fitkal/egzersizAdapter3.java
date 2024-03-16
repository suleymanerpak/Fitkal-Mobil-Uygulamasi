package com.example.fitkal;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class egzersizAdapter3 extends RecyclerView.Adapter<egzersizAdapter3.MyViewHolder> {
    ArrayList<egzersiz3> mProductList;
    LayoutInflater inflater;
    public egzersizAdapter3(Context context, ArrayList<egzersiz3> products) {
        inflater = LayoutInflater.from(context);
        this.mProductList = products;
    }
    @Override
    public egzersizAdapter3.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.card, parent, false);
        egzersizAdapter3.MyViewHolder holder = new egzersizAdapter3.MyViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(egzersizAdapter3.MyViewHolder holder, int position) {
        egzersiz3 selectedProduct = mProductList.get(position);
        holder.setData(selectedProduct, position);
    }
    @Override
    public int getItemCount() {
        return mProductList.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView egzersizName, egzersizDescription;
        ImageView egzersizImage;
        public MyViewHolder(View itemView) {
            super(itemView);
            egzersizName = (TextView) itemView.findViewById(R.id.egzersizName);
            egzersizDescription = (TextView) itemView.findViewById(R.id.egzersizDescription);
            egzersizImage = (ImageView) itemView.findViewById(R.id.egzersizImage);
        }
        public void setData(egzersiz3 selectedProduct, int position) {

            this.egzersizName.setText(selectedProduct.getegzersizName());
            this.egzersizDescription.setText(selectedProduct.getegzersizDescription());
            this.egzersizImage.setImageResource(selectedProduct.getegzersizID());
        }
        @Override
        public void onClick(View v) {
        }
    }
}
