package swmaestro.lightsoo.couplesns.RestAPI;

import retrofit.Call;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
import swmaestro.lightsoo.couplesns.Data.Message;

/**
 * Created by LG on 2016-07-20.
 */
public interface PushService {


    @FormUrlEncoded
    @POST("/registrationtoken")
    Call<Message> register(@Field("token") String token);

}
