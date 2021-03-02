package com.example.firsttry.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.firsttry.DataAdapterSingleChar
import com.example.firsttry.DataModelAllChar
import com.example.firsttry.DataModelSingleChar
import kotlinx.coroutines.launch

class ProfileViewModel(private val profileId:Int) :ViewModel(){
    private val _user = MutableLiveData<DataModelSingleChar>()
    val user:LiveData<DataModelSingleChar> = _user

    private val repository:ProfileRepository = ProfileRepository()

    init {
        viewModelScope.launch {
            try{
                _user.value = repository.loadUser(profileId)
            } catch (t:Throwable){
                //TODO
            }
        }
    }
}