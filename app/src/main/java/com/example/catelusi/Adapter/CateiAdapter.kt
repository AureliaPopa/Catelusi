package com.example.catelusi.Adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.catelusi.Model.CateiApi
import com.example.catelusi.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.catei_rv_layout.view.*

class CateiAdapter (val context: Context?, private val dogsImages: ArrayList<CateiApi> ):RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       val v = LayoutInflater.from(parent.context).inflate(R.layout.catei_rv_layout,parent,false)

        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return dogsImages.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

      Picasso.get().load(dogsImages[position].message).into(holder.itemView.dogImage)
    }


    class  ViewHolder(v:View?): RecyclerView.ViewHolder(v!!),
        View.OnClickListener{
        override fun onClick(v: View?) {

        }

        init {
            itemView.setOnClickListener(this)
        }
        val dogsImage = itemView.dogImage!!
    }


}