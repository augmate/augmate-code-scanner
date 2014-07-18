package com.augmate.scany;

import com.google.zxing.ResultPoint;

import android.graphics.Point;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

public final class DebugVizHandler extends Handler {

	private static final String TAG = "ActivityHandler";
	private final DebugViz mScanActivity;

	DebugVizHandler(DebugViz activity)
	{
		this.mScanActivity = activity;
	}
	
	@Override
	public void handleMessage(Message message) {
		switch (message.what) {

		case R.id.submit_viz:
			Log.i(TAG, "Decode succeeded");
			
			Point pt = (Point) message.obj;
			mScanActivity.AddPoint(pt);
			
			//ResultPoint[] pts = (ResultPoint[]) message.obj;
			//mScanActivity.AddPoints(pts);
			break;
		}
	}
}