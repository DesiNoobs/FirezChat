package  com.ai.firezchat.Fragments;



import com.ai.firezchat.Notifications.MyResponse;
import com.ai.firezchat.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAe8_IZR4:APA91bEErcfw8cr1iuWpqE-SdGo5Ek-i3GNKjrAlNWc_fmPQhWpjZdlHL-pPFu5gDG4MrBa1_dbv-_6IUn6p7pgrIlM0te4LqLuw_xgl9k9U4b9b5Pj6wO_OrNoweJk8ISJS6vWHCMM6"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
