package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.UserData as UserDataModel

class MainActivity : AppCompatActivity() {
    var usr: UserDataModel? = null
    var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        usr = UserDataModel("Android", "123456")
        //binding?.user?.name = "Test"
        var e = binding?.txt1?.textSize

    }

    fun setData(view: View) {
        //usr=null
        binding?.user = usr
        Toast.makeText(this, usr?.name, Toast.LENGTH_SHORT).show()
    }
}