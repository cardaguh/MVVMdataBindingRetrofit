package co.cyclopsapps.mvvmdatabindingretrofitlivedatarepository.retrofit

import co.cyclopsapps.mvvmdatabindingretrofitlivedatarepository.model.ServicesSetterGetter
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("character")
    fun getServices() : Call<ServicesSetterGetter>

}