package com.example.firsttry

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.firsttry.databinding.FragmentPersonInfoBinding
import com.example.firsttry.databinding.RickListRowBinding

class DataAdapter: RecyclerView.Adapter<DataAdapter.ViewHolder>(){
    private val userResultDataList = mutableListOf<DataModelAllChar.DataBean>()
    private val userinfoDataList1  = mutableListOf<String?>()
    private var bindingRick: RickListRowBinding? = null
    private var SingleChar: FragmentPersonInfoBinding? = null

    fun addDataList(DataModel: DataModelAllChar){
        userResultDataList.addAll(DataModel.dataList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {

        val inflater = LayoutInflater.from(viewGroup.context)
        val binding = RickListRowBinding.inflate(inflater,viewGroup,false )
        val bindingSingle = FragmentPersonInfoBinding.inflate(inflater,viewGroup,false )
        return ViewHolder(binding, viewGroup)
    }


    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        val userResultDto =  userResultDataList[i]
      //  viewHolder.bindingRick.root.setOnClickListener{
       //     clickListener(userResultDto.id)
      //  }
       // viewHolder.bindingRick.root.setOnClickListener { clickListener(userResultDto.id)
       // }
        viewHolder.next?.text = userResultDto.info?.next
        viewHolder.prev?.text = userResultDto.info?.prev
        viewHolder.id?.text = userResultDto.id.toString()
        viewHolder.nameChar?.text = userResultDto.name
        viewHolder.status?.text = userResultDto.status
        viewHolder.species?.text = userResultDto.species
        viewHolder.type?.text = userResultDto.type
        viewHolder.gender?.text = userResultDto.gender
        viewHolder.nameOrigin?.text = userResultDto.origin.name
        viewHolder.urlOrigin?.text = userResultDto.origin.url
        viewHolder.nameLocation?.text = userResultDto.location.name
        viewHolder.urlLocation?.text = userResultDto.location.url
        //viewHolder.episode?.text = userResultDto.episode.toString()
        viewHolder.image?.text = userResultDto.image
         viewHolder.url?.text = userResultDto.url
        viewHolder.created?.text = userResultDto.created

    }

    override fun getItemCount(): Int {
        return (userResultDataList.size)
    }


    class ViewHolder(val bindingRick: RickListRowBinding, viewGroup: ViewGroup): RecyclerView.ViewHolder(bindingRick.root) {
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
        var image: TextView? = null
        var episode: TextView? = null
        var url: TextView? = null
        var created: TextView? = null
        init {
            this.count = bindingRick.Count
            this.pages = bindingRick.Pages
            this.next = bindingRick.Next
            this.prev = bindingRick.Prev
            this.id = bindingRick.ID
            this.nameChar = bindingRick.NameChar
            this.status = bindingRick.Status
            this.species = bindingRick.Species
            this.type = bindingRick.Type
            this.gender = bindingRick.Gender
            this.nameOrigin = bindingRick.NameOrigin
            this.urlOrigin = bindingRick.UrlOrigin
            this.nameLocation = bindingRick.NameLocation
            this.urlLocation = bindingRick.UrlLocation
            this.image = bindingRick.image
            this.episode = bindingRick.episode
            this.url = bindingRick.url
            this.created = bindingRick.Created
        }
    }
}