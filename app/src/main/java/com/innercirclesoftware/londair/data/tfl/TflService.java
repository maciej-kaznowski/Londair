package com.innercirclesoftware.londair.data.tfl;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TflService {

    String BASE_URL = "https://api.tfl.gov.uk";

    @GET("/AirQuality")
    Call<Air> getAirQuality();
}