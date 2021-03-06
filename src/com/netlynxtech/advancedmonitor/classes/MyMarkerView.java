package com.netlynxtech.advancedmonitor.classes;

import android.content.Context;
import android.widget.TextView;

import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.utils.MarkerView;
import com.netlynxtech.advancedmonitor.R;
import com.github.mikephil.charting.utils.Utils;

public class MyMarkerView extends MarkerView {

	private TextView tvContent;

	public MyMarkerView(Context context, int layoutResource) {
		super(context, layoutResource);
		tvContent = (TextView) findViewById(R.id.tvContent);
	}

	@Override
	public void refreshContent(Entry e, int dataSetIndex) {

		if (e instanceof CandleEntry) {
			CandleEntry ce = (CandleEntry) e;
			tvContent.setText("" + ce.getHigh());
		} else {
			tvContent.setText("" + e.getVal());
		}
	}
}
