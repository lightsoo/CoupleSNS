package swmaestro.lightsoo.couplesns.RestAPI;

import retrofit.Call;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
import swmaestro.lightsoo.couplesns.Data.Message;

/**
 * Created by LG on 2016-07-24.
 */
public interface Signup {



    @FormUrlEncoded
    @POST("/join/check")
    Call<Message> check(@Field("email") String email);


    @FormUrlEncoded
    @POST("/join")
    Call<Message> join(@Field("email") String email,
                       @Field("pwd") String pwd,
                       @Field("user_name") String name);

}
