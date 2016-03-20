package fr.xebia.microsoftoxforddemo.api;

import fr.xebia.microsoftoxforddemo.model.MatchRequest;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

public interface RestService {

    @POST("user")
    @Headers({"Content-Type: application/json;charset=UTF-8"})
    Observable<String> match(@Body MatchRequest body);
}