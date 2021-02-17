package com.example.firsttry

    fun getDataList(dataList: ArrayList<DataModel.DataBean>){
        val dataAdapter = dataAdapter()
        dataAdapter.addDataList(dataList)
}