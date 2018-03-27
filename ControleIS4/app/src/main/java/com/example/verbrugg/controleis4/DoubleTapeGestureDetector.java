package com.example.verbrugg.controleis4;

        import android.app.Activity;
        import android.content.Context;
        import android.util.Log;
        import android.view.GestureDetector;
        import android.view.MotionEvent;

/**
 * Created by Nofix on 18/03/2018.
 */

class DoubleTapeGestureDetector extends GestureDetector.SimpleOnGestureListener {
    private SquareViewContener squareViewContener;
    private Activity activity;
    public DoubleTapeGestureDetector(SquareViewContener squareViewContener, Activity activity) {
        super();
        this.squareViewContener = squareViewContener;
        this.activity = activity;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {


        Log.e("OnDoubleTapListener", "onDoubleTap");
        ResetDialogFragment resetDialogFragment = ResetDialogFragment.newInstance(squareViewContener);
        resetDialogFragment.show(activity.getFragmentManager(), "Reset dialog");

        return true;
    }
}