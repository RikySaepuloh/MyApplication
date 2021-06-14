package com.esaku.myapplication.populaterecyclerview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.esaku.myapplication.databinding.ListInformasiBinding
import com.esaku.myapplication.populaterecyclerview.models.ModelInformasi

class InformasiAdapter : RecyclerView.Adapter<InformasiAdapter.NamaKelompokViewHolder>() {
    val link="https://api.simkug.com/api/mobile-sekolah/storage/"
    private var dataArray= mutableListOf<ModelInformasi>()
    private val dataTemporary= mutableListOf<ModelInformasi>()
    lateinit var context: Context
    fun addData(data:MutableList<ModelInformasi>){
        dataArray.addAll(data)
        notifyDataSetChanged()
    }
    fun initData(data:MutableList<ModelInformasi>){
        dataArray.clear()
        dataTemporary.clear()
        dataArray.addAll(data)
        dataTemporary.addAll(data)
        notifyDataSetChanged()
    }


    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        context = recyclerView.context
    }
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamaKelompokViewHolder {
        val binding = ListInformasiBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return NamaKelompokViewHolder(binding)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun onBindViewHolder(holder: NamaKelompokViewHolder, position: Int) {
        with(holder){
            with(dataArray[position]) {

            }
        }

    }



    override fun getItemCount(): Int {
        return dataArray.size
    }

    inner class NamaKelompokViewHolder(val binding: ListInformasiBinding)
        :RecyclerView.ViewHolder(binding.root)


}