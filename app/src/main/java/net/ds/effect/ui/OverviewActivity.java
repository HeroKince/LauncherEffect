
package net.ds.effect.ui;

import net.ds.effect.R;
import net.ds.effect.ui.EffectsOverview;

import android.app.Activity;
import android.os.Bundle;

public class OverviewActivity extends Activity {
    
    private EffectsOverview mOverview;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);
        mOverview = (EffectsOverview) findViewById(R.id.overview);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mOverview.onShow();
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        mOverview.onExit();
    }
}
