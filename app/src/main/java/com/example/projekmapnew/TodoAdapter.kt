package com.example.projekmapnew


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class TodoAdapter (var ctx: Context, var resource: Int, var item: ArrayList<Model>): ArrayAdapter<Model>(ctx, resource, item) {
    lateinit var posterlist:Array<String>

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater = LayoutInflater.from(ctx)
        val view = layoutInflater.inflate(resource, null)

        val title = view.findViewById<TextView>(R.id.judulpilem)
        val description = view.findViewById<TextView>(R.id.sutradarapilem)
        val img = view.findViewById<ImageView>(R.id.posterpilem)
        posterlist = view.resources.getStringArray(R.array.posterlist)

        title.text = item[position].Title
        description.text = item[position].Description
        Glide.with(context)
            .load(posterlist[position])
            .into(img);

        return view
    }
}