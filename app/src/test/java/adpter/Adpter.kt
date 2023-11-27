package adpter

import UsersApi
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.r1moreira9.plication.R
import com.r1moreira9.plication.databinding.ActivityMain2Binding

class Adptaer (private val onItemClicked: (UsersApi)-> Unit) : RecyclerView.Adapter<MainViewHolder>() {
    private var users = mutableListOf<UsersApi>()
    fun setUsersList(users: List<UsersApi>){
        this.users = users.toMutableList()
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ActivityMain2Binding.inflate(inflater, parent,false)
        return MainViewHolder(binding)
    }
    //definindo o tamanho do recyclerView
    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val users = users [position]
        holder.listar(users, onItemClicked)
    }
}
// Passando informações a Activiti e passando métodos de como tratar e receber as imagens.
class MainViewHolder (val binding: ActivityMain2Binding) : RecyclerView.ViewHolder(binding.root){

fun listar(users:UsersApi, onItemClicked: (UsersApi) -> Unit) {
    binding.txtLogin.text = users.login
    binding.txtId.text = users.id

    val requestOptions = RequestOptions()
        .placeholder(R.drawable.ic_launcher_background)
        .error(R.drawable.ic_launcher_background)

    Glide.with(itemView.context)
        .applyDefaultRequestOptions(requestOptions)
        .load(users.avatar)
        .into(binding.perfil)

}

}