package com.example.firsttry

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentViewHolder
import okhttp3.internal.notify

class dataAdapter(): RecyclerView.Adapter<dataAdapter.ViewHolder>(){
    val userDataList = ArrayList<DataModel.DataBean>()

    fun addDataList(arrList: ArrayList<DataModel.DataBean>){
        userDataList.addAll(arrList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.rick_list_row, viewGroup,  false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        var userDto = userDataList[i]
        viewHolder?.сount?.text = userDto.count.toString()
        viewHolder?.pages?.text = userDto.pages.toString()
        viewHolder?.next?.text = userDto.next
        viewHolder?.prev?.text = userDto.prev
        viewHolder?.id?.text = userDto.id.toString()
        viewHolder?.nameChar?.text = userDto.nameChar
        viewHolder?.status?.text = userDto.status
        viewHolder?.species?.text = userDto.species
        viewHolder?.type?.text = userDto.type
        viewHolder?.gender?.text = userDto.gender
        viewHolder?.nameOrigin?.text = userDto.nameOrigin
        viewHolder?.urlOrigin?.text = userDto.urlOrigin
        viewHolder?.nameLocation?.text = userDto.nameLocation
        viewHolder?.urlLocation?.text = userDto.urlLocation
        viewHolder?.urlChar?.text = userDto.urlChar
        viewHolder?.created?.text = userDto.created

    }

    override fun getItemCount(): Int {
        return userDataList.size
    }

     class ViewHolder(view: View): RecyclerView.ViewHolder(view){
         var сount: TextView? = null
         var pages: TextView? = null
         var next: TextView? = null
         var prev: TextView? = null
         var id: TextView? = null
         var nameChar: TextView? = null
         var status: TextView? = null
         var species: TextView? = null
         var type: TextView? = null
         var gender: TextView? = null
         var nameOrigin: TextView? = null
         var urlOrigin: TextView? = null
         var nameLocation: TextView? = null
         var urlLocation: TextView? = null
         var urlChar: TextView? = null
         var created: TextView? = null

       init {
           this.сount = view.findViewById<TextView>(R.id.Count)
           this.pages = view.findViewById<TextView>(R.id.Pages)
           this.next = view.findViewById<TextView>(R.id.Next)
           this.prev = view.findViewById<TextView>(R.id.Prev)
           this.id = view.findViewById<TextView>(R.id.ID)
           this.nameChar = view.findViewById<TextView>(R.id.NameChar)
           this.status = view.findViewById<TextView>(R.id.Status)
           this.species = view.findViewById<TextView>(R.id.Species)
           this.type = view.findViewById<TextView>(R.id.Type)
           this.gender = view.findViewById<TextView>(R.id.Gender)
           this.nameOrigin = view.findViewById<TextView>(R.id.NameOrigin)
           this.urlOrigin = view.findViewById<TextView>(R.id.UrlOrigin)
           this.nameLocation = view.findViewById<TextView>(R.id.NameLocation)
           this.urlLocation = view.findViewById<TextView>(R.id.UrlLocation)
           this.urlChar = view.findViewById<TextView>(R.id.UrlChar)
           this.created = view.findViewById<TextView>(R.id.Created)
       }
    }

}