package com.example.shopbiller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_finalbill.*

class Viewproducts : AppCompatActivity() {

    private var adpater: ProductAdapter?= null
    private var Productlist: ArrayList<products>? = null
    private var Productlistitem:ArrayList<products>?= null
    private var layoutManager: RecyclerView.LayoutManager?= null
    var dbHandler: productdatabasehandler?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.viewproducts)

        dbHandler = productdatabasehandler(this)
        Productlist = ArrayList()
        Productlistitem = ArrayList()
        layoutManager= LinearLayoutManager(this)
        adpater = ProductAdapter(Productlistitem!!,this)


        rvid.layoutManager= layoutManager // recyclerViewid is id of recyclerview
        rvid.adapter = adpater

        //load our products
        Productlist = dbHandler!!.readdataproduct()





        for(c in Productlist!!.iterator()){

            val Products = products()
            Products.productid = c.productid
            Products.productname = c.productname
            Products.productprice  =  c.productprice

            Productlistitem!!.add(Products)
        }
        adpater!!.notifyDataSetChanged()




    }
}
