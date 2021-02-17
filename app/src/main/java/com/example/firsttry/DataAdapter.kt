package com.example.firsttry

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DataAdapter: RecyclerView.Adapter<DataAdapter.ViewHolder>(){
    private val userDataList = mutableListOf<DataModel.DataBean>()

    fun addDataList(arrList: List<DataModel.DataBean>){
        userDataList.addAll(arrList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.rick_list_row, viewGroup,  false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        val userDto = userDataList[i]
        viewHolder.count?.text = userDto.count.toString()
        viewHolder.pages?.text = userDto.pages.toString()
        viewHolder.next?.text = userDto.next
        viewHolder.prev?.text = userDto.prev
        viewHolder.id?.text = userDto.id.toString()
        viewHolder.nameChar?.text = userDto.nameChar
        viewHolder.status?.text = userDto.status
        viewHolder.species?.text = userDto.species
        viewHolder.type?.text = userDto.type
        viewHolder.gender?.text = userDto.gender
        viewHolder.nameOrigin?.text = userDto.nameOrigin
        viewHolder.urlOrigin?.text = userDto.urlOrigin
        viewHolder.nameLocation?.text = userDto.nameLocation
        viewHolder.urlLocation?.text = userDto.urlLocation
        viewHolder.urlChar?.text = userDto.urlChar
        viewHolder.created?.text = userDto.created

    }

    override fun getItemCount(): Int {
        return userDataList.size
    }

     class ViewHolder(view: View): RecyclerView.ViewHolder(view){
         var count: TextView? = null
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
           this.count = view.findViewById(R.id.Count)
           this.pages = view.findViewById(R.id.Pages)
           this.next = view.findViewById(R.id.Next)
           this.prev = view.findViewById(R.id.Prev)
           this.id = view.findViewById(R.id.ID)
           this.nameChar = view.findViewById(R.id.NameChar)
           this.status = view.findViewById(R.id.Status)
           this.species = view.findViewById(R.id.Species)
           this.type = view.findViewById(R.id.Type)
           this.gender = view.findViewById(R.id.Gender)
           this.nameOrigin = view.findViewById(R.id.NameOrigin)
           this.urlOrigin = view.findViewById(R.id.UrlOrigin)
           this.nameLocation = view.findViewById(R.id.NameLocation)
           this.urlLocation = view.findViewById(R.id.UrlLocation)
           this.urlChar = view.findViewById(R.id.UrlChar)
           this.created = view.findViewById(R.id.Created)
       }
    }

}