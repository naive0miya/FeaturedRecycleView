package com.youtwo.featuredrecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.youtwo.featurerecyclerview.FeatureLinearLayoutManager;
import com.youtwo.featurerecyclerview.FeaturedRecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  List<String> dummyData = new ArrayList<>();
  FeaturedRecyclerView featuredRecyclerView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    createDummyDataList();
    featuredRecyclerView = (FeaturedRecyclerView) findViewById(R.id.featured_recycler_view);
    FeatureLinearLayoutManager layoutManager = new FeatureLinearLayoutManager(this);
    featuredRecyclerView.setLayoutManager(layoutManager);
    CustomRecyclerViewAdapter adapter = new CustomRecyclerViewAdapter(this, dummyData);
    featuredRecyclerView.setAdapter(adapter);
  }

  private void createDummyDataList() {
    for (int i = 1; i <= 20; i++) {
      dummyData.add("Item " + i);
    }
  }
}
