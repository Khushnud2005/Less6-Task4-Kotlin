package uz.exemple.less6_task4_kotlin.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.exemple.less6_task4_kotlin.ProfileActivity
import uz.exemple.less6_task4_kotlin.R
import uz.exemple.less6_task4_kotlin.model.MemberModel

class Adapter(var arrayList:ArrayList<String>):RecyclerView.Adapter<Adapter.MainViewHolder>() {

    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view: View
        view = LayoutInflater.from(parent.context).inflate(R.layout.items, parent, false)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.textView.text = arrayList[position]

        context = holder.itemView.context
        holder.linearLayout.setOnClickListener { v ->
            val model = MemberModel("Xushnud", 27, "Cardiology")
            val intent = Intent(v.context, ProfileActivity::class.java)
            intent.putExtra("member", model)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textView: TextView
        var linearLayout: LinearLayout

        init {
            linearLayout = itemView.findViewById(R.id.linear_layout)
            textView = itemView.findViewById(R.id.itemTv)

        }
    }
}