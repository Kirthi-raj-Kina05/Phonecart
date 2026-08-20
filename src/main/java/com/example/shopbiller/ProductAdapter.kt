package com.example.shopbiller

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter(private val list:ArrayList<products>,
                     val context: Context):RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup,position: Int):ViewHolder {


        val view = LayoutInflater.from(context)
            .inflate(R.layout.list_row1,parent,false)
        return ViewHolder(view,context)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bindViews(list[position],context)
    }


    class ViewHolder(itemView:View, context: Context):RecyclerView.ViewHolder(itemView){
        var Productname =itemView.findViewById(R.id.pname) as TextView
        var Productid = itemView.findViewById(R.id.barcode) as TextView
        var Productamount = itemView.findViewById(R.id.pamount) as TextView
        var Deleteproduct = itemView.findViewById(R.id.delete) as Button
        var dbHandler = productdatabasehandler(context);


        fun bindViews(products: products,context:Context){

            Productname.text = products.productname
            Productid.text = products.productid.toString()
            Productamount.text = products.productprice.toString()

            Deleteproduct.setOnClickListener {

                dbHandler!!.deleteproduct1(products.productid)

                var intent = Intent(context,admindash::class.java)
                context.startActivity(intent)

            }
        }


    }




}