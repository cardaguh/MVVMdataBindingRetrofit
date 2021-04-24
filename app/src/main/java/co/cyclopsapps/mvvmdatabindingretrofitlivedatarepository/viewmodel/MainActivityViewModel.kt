package co.cyclopsapps.mvvmdatabindingretrofitlivedatarepository.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import co.cyclopsapps.mvvmdatabindingretrofitlivedatarepository.model.ServicesSetterGetter
import co.cyclopsapps.mvvmdatabindingretrofitlivedatarepository.repository.MainActivityRepository

class MainActivityViewModel : ViewModel() {

    var servicesLiveData: MutableLiveData<ServicesSetterGetter>? = null

    fun getUser() : LiveData<ServicesSetterGetter>? {
        servicesLiveData = MainActivityRepository.getServicesApiCall()
        return servicesLiveData
    }

}