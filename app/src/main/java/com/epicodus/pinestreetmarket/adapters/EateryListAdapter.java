package com.epicodus.pinestreetmarket.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.epicodus.pinestreetmarket.Eatery;
import com.epicodus.pinestreetmarket.R;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Guest on 4/21/16.
 */
public class EateryListAdapter extends RecyclerView.Adapter<EateryListAdapter.EateryViewHolder> {
    private ArrayList<Eatery> mEateries = new ArrayList<>();
    private Context mContext;

    public EateryListAdapter(Context context, ArrayList<Eatery> eateries) {
        mContext = context;
        mEateries = eateries;
    }

    @Override
    public EateryListAdapter.EateryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.eatery_list_item, parent, false);
        EateryViewHolder viewHolder = new EateryViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(EateryListAdapter.EateryViewHolder holder, int position) {
        holder.bindEatery(mEateries.get(position));
    }

    @Override
    public int getItemCount() {
        return mEateries.size();
    }

    public class EateryViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.eateryLogoImageView) ImageView mEateryLogoImageView;
        @Bind(R.id.eateryNameTextView) TextView mEateryNameTextView;
        @Bind(R.id.eateryDescriptionTextView) TextView mEateryDescriptionTextView;
        private Context mContext;

        public EateryViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
        }

        public void bindEatery(Eatery eatery) {
            mEateryLogoImageView.setImageResource(eatery.getLogo());
            mEateryNameTextView.setText(eatery.getName());
            mEateryDescriptionTextView.setText(eatery.getDescription());

        }
    }

}
