package com.youtwo.featurerecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView.State;

/**
 * Created by Bill on 2017/8/15.
 */

public class FeatureLinearLayoutManager extends android.support.v7.widget.LinearLayoutManager {

  public FeatureLinearLayoutManager(Context context) {
    super(context);
  }

  public FeatureLinearLayoutManager(Context context, int orientation, boolean reverseLayout) {
    super(context, orientation, reverseLayout);
  }

  @Override
  protected int getExtraLayoutSpace(State state) {
    return 1000;
  }
}
