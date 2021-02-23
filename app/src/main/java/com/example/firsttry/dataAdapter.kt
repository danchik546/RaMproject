package com.example.firsttry

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.firsttry.databinding.RickListRowBinding

class DataAdapter: RecyclerView.Adapter<DataAdapter.ViewHolder>(){
    private val userResultDataList = mutableListOf<DataModel.DataBean>()
    private val userinfoDataList1  = mutableListOf<String?>()
    private var bindingRick: RickListRowBinding? = null

    fun addDataList(DataModel: DataModel){
        var DataBeanean: DataModel.DataBean
       // var info: DataModel.DataBean.info =
        //var infolist: List<DataModel.DataBean.info> = listOf(info)
        var resultList: List<DataModel.DataBean> = DataModel.dataList
        //var infoList: List<String?> = listOf(DataModel.count, DataModel.pages,DataModel.next, DataModel.prev)
      //  userinfoDataList1.addAll(infoList)
        //  userinfoDataList1.addAll(infolist)
        userResultDataList.addAll(resultList)

        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val inflater = LayoutInflater.from(viewGroup.context)
        bindingRick = RickListRowBinding.inflate(inflater,viewGroup,false )
        return ViewHolder(bindingRick!!)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        val userResultDto =  userResultDataList[i]
       // val userInfoDto =  userinfoDataList1[i]
      //  var info: DataModel.DataBean.info = com.example.firsttry.DataModel.DataBean.info()
       // val userInfoDto =  userinfoDataList1[userinfoDataList1.size]
      //  viewHolder.count?.text = userInfoDto?.get(0)?.toString()
       //  viewHolder.pages?.text = userInfoDto?.get(1)?.toString()
      //  viewHolder.next?.text = userInfoDto?.get(2)?.toString()
      //   viewHolder.prev?.text = userInfoDto?.get(3)?.toString()
        viewHolder.id?.text = userResultDto.id.toString()
        viewHolder.nameChar?.text = userResultDto.name
        viewHolder.status?.text = userResultDto.status
        viewHolder.species?.text = userResultDto.species
        viewHolder.type?.text = userResultDto.type
        viewHolder.gender?.text = userResultDto.gender
       // viewHolder.nameOrigin?.text = userResultDto.nameOrigin
       // viewHolder.urlOrigin?.text = userOriginDto.url
        //viewHolder.nameLocation?.text = userLocationDto.name
        //viewHolder.urlLocation?.text = userLocationDto.url
        viewHolder.episode?.text = userResultDto.episode.toString()
        viewHolder.image?.text = userResultDto.image
         viewHolder.url?.text = userResultDto.url
        viewHolder.created?.text = userResultDto.created

    }

    override fun getItemCount(): Int {
        return (userResultDataList.size)
    }

    class ViewHolder(bindingRick: RickListRowBinding): RecyclerView.ViewHolder(bindingRick.root){
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