package uz.exemple.less6_task4_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import uz.exemple.less6_task4_kotlin.model.MemberModel

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        initViews()
    }

    fun initViews() {
        val text1: TextView = findViewById(R.id.tv_profile)
        val member: MemberModel? = intent.getSerializableExtra("member") as MemberModel?
        text1.setText(member.toString())
    }
}