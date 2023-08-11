package com.example.class__3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<MyList> userList;
    public Adapter(List<MyList> userList){this.userList=userList;}

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        int resource=userList.get(position).getImageView();
        String name=userList.get(position).getTextView1();
        String msg=userList.get(position).getTextView2();
        String time=userList.get(position).getTextView3();


        holder.setData(resource,name,msg,time);
    }

    @Override
    public int getItemCount() {
        if (userList != null)
            return userList.size();
        else
            return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView textView;
        private TextView textView2;
        private TextView textView3;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.img1);
            textView=itemView.findViewById(R.id.tv1);
            textView=itemView.findViewById(R.id.tv2);
            textView=itemView.findViewById(R.id.tv3);

        }

        public void setData(int resource, String name, String msg, String time) {
            imageView.setImageResource(resource);
//            textView.setText(name);
//            textView2.setText(msg);
//            textView3.setText(time);
        }
    }
}