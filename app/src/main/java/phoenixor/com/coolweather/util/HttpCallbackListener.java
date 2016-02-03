package phoenixor.com.coolweather.util;

/**
 * Created by Administrator on 2016/2/2.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
