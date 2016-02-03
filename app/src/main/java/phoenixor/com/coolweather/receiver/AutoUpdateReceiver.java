package phoenixor.com.coolweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import phoenixor.com.coolweather.service.AutoUpdateService;

/**
 * Created by Administrator on 2016/2/3.
 */
public class AutoUpdateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i=new Intent(context, AutoUpdateService.class);
        context.startActivity(i);
    }
}
