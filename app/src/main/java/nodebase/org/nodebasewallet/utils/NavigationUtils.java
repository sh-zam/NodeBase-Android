package nodebase.org.nodebasewallet.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import nodebase.org.nodebasewallet.ui.wallet_activity.WalletActivity;

/**
 * Created by akshaynexus on 10/19/17.
 */

public class NavigationUtils {

    public static void goBackToHome(Activity activity){
        Intent upIntent = new Intent(activity,WalletActivity.class);
        upIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        activity.startActivity(upIntent);
        activity.finish();
    }

}
