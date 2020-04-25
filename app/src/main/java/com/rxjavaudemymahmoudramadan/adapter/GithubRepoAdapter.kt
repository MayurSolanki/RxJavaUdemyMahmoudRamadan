package com.rxjavaudemymahmoudramadan.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rxjavaudemymahmoudramadan.R
import com.rxjavaudemymahmoudramadan.db.Repo
import kotlinx.android.synthetic.main.stars_item.view.*

/**
 * Created by Mayur Solanki (mayursolanki120@gmail.com) on 24/04/20, 11:35 PM.
 */
class GithubRepoAdapter(context : Context) : RecyclerView.Adapter<GithubRepoAdapter.StarsRepoViewHolder>() {

    private var data = ArrayList<Repo>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StarsRepoViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.stars_item,parent,false)
        return StarsRepoViewHolder(view)
    }

    override fun getItemCount(): Int {
       return  data.size
    }

    public fun addData(repos : List<Repo>){
        data.addAll(repos)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: StarsRepoViewHolder, position: Int) {
        var repo : Repo = data[position]

        holder.repoName.text = repo.name
        holder.repoStarsCount.text = repo.count.toString()

        repo.lang?.let {
            holder.repoLang.text = repo.lang
        }?:run{
            holder.repoLang.text = "No Language"
        }

        var desc : String =  repo.desc   ?: " No descc "
        holder.repoDesc.text = desc

    }

    class StarsRepoViewHolder(view : View):RecyclerView.ViewHolder(view){

        val repoName = view.tv_repo_name;
        val repoDesc = view.tv_repo_desc;
        val repoLang = view.tv_repo_lang;
        val repoStarsCount = view.tv_stars_count;

    }
}