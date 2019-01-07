package com.example.molys.dynamicrecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.example.molys.dynamicrecyclerview.adapter.InvoiceAdapter
import com.example.molys.dynamicrecyclerview.item.BaseItem
import com.example.molys.dynamicrecyclerview.model.MockInvoice
import com.google.gson.Gson
import org.json.JSONObject
import java.io.IOException
import java.nio.charset.StandardCharsets

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initInstances()
    }

    private fun initInstances() {
        recyclerView = findViewById(R.id.rv_item)
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = InvoiceAdapter(InvoiceCreator.toBaseItem(LoadFileJson()!!) as ArrayList<BaseItem>)
        }
    }

    private fun LoadFileJson(): MockInvoice? {
        try {
            val jsonFile = assets.open("mock.json")
            val size = jsonFile.available()
            val buffer = ByteArray(size)
            jsonFile.read(buffer)
            jsonFile.close()
            val json = String(buffer, StandardCharsets.UTF_8)
            val mockInvoice = Gson().fromJson<MockInvoice>(json,MockInvoice::class.java)
            return mockInvoice
        }catch (ex : IOException){
            ex.printStackTrace()
        }
        return null
    }
}
