package at.fh.swengb.bauer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_movie.view.*

class MovieAdapter(val clickListener: (movie: Movie) -> Unit): RecyclerView.Adapter<MovieViewHolder>(){

    private var movieList = listOf<Movie>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        // Here we create the view Holder and tell it how each child view - aka each item
        // looks like by providing it with the item layout (our item_movie.xml)
        val inflater = LayoutInflater.from(parent.context)
        val movieItemView = inflater.inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(movieItemView)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        // Here we bind a click listener to each element of the movie list
        holder.bindItem(movieList[position], clickListener)
    }

    fun updateList (newList: List<Movie>) {
        // This is the function we call to notify our recycler view that the list
        // it uses has changed
        movieList = newList
        notifyDataSetChanged()
    }
}

class MovieViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    fun bindItem(movie: Movie, clickListener: (movie: Movie) -> Unit){
        // This is the function where we fill our item_movie.xml with the actual data
        itemView.item_movie_title.text = movie.title
        itemView.item_movie_release.text = movie.release
        itemView.item_movie_director.text = movie.director.name
        // Take the first two elements of the actors list, get the names of the two
        // then join them to a String
        itemView.item_movie_actors.text = movie.actors.take(2).map{ it.name }.joinToString()
        itemView.item_movie_avg_rating_bar.rating = movie.ratingAverage().toFloat()
        itemView.item_movie_avg_rating_value.text = movie.ratingAverage().toString()
        itemView.item_movie_rating_count.text = movie.reviews.size.toString()
        itemView.setOnClickListener{
            clickListener(movie)
        }
    }
}