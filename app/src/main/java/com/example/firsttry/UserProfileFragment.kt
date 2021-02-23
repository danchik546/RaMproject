package com.example.firsttry

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels

class UserProfileFragment : Fragment() {
    // To use the viewModels() extension function, include
    // "androidx.fragment:fragment-ktx:latest-version" in your app
    // module's build.gradle file.
    private val viewModel: DataModel by viewModels()
    //    factoryProducer = { SavedStateVMFactory(this) }
    //)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.activity_main, container, false)
    }
  //  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
     //   super.onViewCreated(view, savedInstanceState)
      //  viewModel.dataList2.observe
            // update UI
   //     }
 //   }
}
