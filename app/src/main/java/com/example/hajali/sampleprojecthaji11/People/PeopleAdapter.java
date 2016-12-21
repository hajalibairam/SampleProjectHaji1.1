package com.example.hajali.sampleprojecthaji11.People;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hajali.sampleprojecthaji11.R;

import java.util.List;

/**
 * Created by hajali on 12/21/16.
 */

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.MyViewHolder> {
    static class MyViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        TextView name;
        TextView type;

        MyViewHolder(final View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.name_list_items);
            type = (TextView) itemView.findViewById(R.id.type_list_item);


        }
    }

    private List<People> mPeople;
    private Context mContext;

    public PeopleAdapter(Context context, List<People> peoples) {
        mPeople = peoples;
        mContext = context;
    }

    @Override
    public PeopleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.people_list_items, parent, false);

        return new PeopleAdapter.MyViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(PeopleAdapter.MyViewHolder holder, int position) {
        People variant = mPeople.get(position);

        TextView mNameTextView = holder.name;
        TextView mTypeTextView = holder.type;

        mNameTextView.setText(variant.getNName());
        mTypeTextView.setText(variant.getType());
//   TODO: setting image
//     mImageView.setImageBitmap(variant.getVariant());
    }

    @Override
    public int getItemCount() {
        return mPeople.size();
    }

}
