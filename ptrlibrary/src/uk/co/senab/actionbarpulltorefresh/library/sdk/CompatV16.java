package uk.co.senab.actionbarpulltorefresh.library.sdk;

import android.annotation.TargetApi;
import android.view.View;

@TargetApi(16)
class CompatV16 {

    static void postOnAnimation(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

}
