package com.example.uniline;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter  extends RecyclerView.Adapter<ListAdapter.ViewHolder>{
    private List <ListElement> mData;
    private LayoutInflater mInflater;
    private Context context;




    public ListAdapter (List<ListElement> itemList, Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemList;



    }
    @Override
    public int getItemCount (){return mData.size();}

    @Override
    public ListAdapter.ViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
        View view = mInflater.inflate(R.layout.list_element, null);
        return new ListAdapter.ViewHolder(view);


    }
    @Override
    public void onBindViewHolder (final ListAdapter.ViewHolder holder, final int position){
        holder.bindData(mData.get(position));
    }

    public void setItem (List<ListElement>items){mData = items;}

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView icomImage;
        TextView name,info, ver;
        ViewHolder (View itenView){
            super (itenView);
            icomImage = itemView.findViewById(R.id.iconImageView);
            name = itemView.findViewById(R.id.nameTextView);
            info = itemView.findViewById(R.id.infoTextView);
            ver = itemView.findViewById(R.id.verTextView);


        }
        void bindData (final ListElement item){

            name.setText(item.getName());
            info.setText(item.getInfo());
            ver.setText(item.getVer());


        }

    }

}
