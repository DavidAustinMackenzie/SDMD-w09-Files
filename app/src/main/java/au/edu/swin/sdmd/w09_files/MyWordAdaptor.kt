package au.edu.swin.sdmd.w09_files

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyWordAdaptor() : RecyclerView.Adapter<MyWordAdaptor.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyWordAdaptor.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater
            .inflate(R.layout.layout_row, parent, false) as View
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyWordAdaptor.ViewHolder, position: Int) {
        val item = MyWordCollection.wordCollection.get(position)
        holder.bind(item)
    }

    override fun getItemCount(): Int = MyWordCollection.count

    inner class ViewHolder(private val v: View): RecyclerView.ViewHolder(v){
        private val word: TextView = v.findViewById(R.id.txtWord)
        private val num: TextView = v.findViewById(R.id.txtNum)

        //Setup the view in each row
        fun bind(item: MyWord){
            word.text = item.word
            num.text = item.num.toString()
        }
    }
}