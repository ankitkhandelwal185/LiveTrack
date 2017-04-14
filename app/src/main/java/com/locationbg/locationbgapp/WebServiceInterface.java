package com.locationbg.locationbgapp;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by Sarthak on 13-04-2017
 */

public interface WebServiceInterface {

    @POST("location")
    Call<BackgroundLocationResponseParser> callLocationServiceApi(@Body BackgroundLocationRequestParser requestParser);
}
