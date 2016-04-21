package com.epicodus.pinestreetmarket;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.epicodus.pinestreetmarket.adapters.EateryListAdapter;
import java.util.ArrayList;
import butterknife.Bind;
import butterknife.ButterKnife;

public class EateriesActivity extends AppCompatActivity {
    public static final String TAG = EateriesActivity.class.getSimpleName();
    @Bind(R.id.recyclerView) RecyclerView mRecyclerView;
    private EateryListAdapter mEateryListAdapter;
    public ArrayList<Eatery> mEateries = new ArrayList<>();

    int[] allLogoIds = new int[]{
            R.drawable.barista, R.drawable.commonlaw, R.drawable.marukin, R.drawable.opwurst, R.drawable.pollobravo, R.drawable.shalomyall, R.drawable.trifectaannex, R.drawable.wizbangbar
    };

    String[] allEateryNames = new String[] {
            "Brass Bar", "Common Law", "Marukin Ramen", "OP Wurst", "Pollo Bravo", "Shalom Y'all", "Trifecta Annex", "WizBangBar"
    };

    String[] allEateryDescriptions = new String[] {
            "A coffee shop by Barista.", "A Asian Fusion restaurant from chefs Patrick McKee and Earl Nimsom.", "Specialty Ramen from Japan.", "Olympia Provision presents foot-long hot dogs.", "A Tapas Bar featuring Spanish-style rotisserie chicken.", "Vegetable-centric Israeli Street Food with American whiskey and Israeli Beer.", "Ken Forkish's newest bakery marrying New York and Italian style.", "The newest offering from Salt & Straw offering soft serve and CHOCOLATE TACOLATES!"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eateries);
        ButterKnife.bind(this);




        for (int i =0; i<allEateryNames.length; i++) {
            Eatery eatery = new Eatery();
            eatery.setName(allEateryNames[i]);
            eatery.setDescription(allEateryDescriptions[i]);
            eatery.setLogo(allLogoIds[i]);
            mEateries.add(eatery);
        }

        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(EateriesActivity.this);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setHasFixedSize(true);
        mEateryListAdapter = new EateryListAdapter(this, mEateries);
        mRecyclerView.setAdapter(mEateryListAdapter);
    }
}
