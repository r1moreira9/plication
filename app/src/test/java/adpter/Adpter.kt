package adpter

import UsersApi
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.r1moreira9.plication.databinding.ActivityMain2Binding

class Adptaer (private val onItemClicked: (UsersApi)-> Unit) : RecyclerView.Adapter<MainViewHolder>() {
    private var users = mutableListOf<UsersApi>()
    fun setUsersList(users: List<UsersApi>){
        this.users = users<UsersApi>()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ActivityMain2Binding.inflate(inflater, parent,false)
        return MainViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val users = users [position]
        holder.binding(users, onItemClicked)
    }
}
class MainViewHolder (val binding: ActivityMain2Binding) : RecyclerView.ViewHolder(binding.root){



}