package at.fh.swengb.bauer

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import at.fh.swengb.bauer.MovieRepository.movieById
import kotlinx.android.synthetic.main.activity_movie_detail.*

class MovieDetailActivity : AppCompatActivity() {

    companion object {
        val EXTRA_MOVIE_ID = "MOVIE_ID_EXTRA"
        val RATE_MOVIE = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        val extra:String? = intent.getStringExtra(MainActivity.EXTRA_MOVIE_ID)

        if (extra != null){
            fillViewWithContent(extra)
        }
        else {
            movie_detail_header.text = "Empty"
        }

        add_rating_movie.setOnClickListener {
            val intent = Intent(this, MovieRatingActivity::class.java)
            intent.putExtra(EXTRA_MOVIE_ID, extra)
            startActivityForResult(intent, RATE_MOVIE)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // When we get the result for our activity we check if it is OK and if so
        // We also check if the passed EXTRA_MOVIE_ID that we passed back and forth
        // is not null - just in case.
        if (requestCode == RATE_MOVIE && resultCode == Activity.RESULT_OK) {
            val extra: String? = intent.getStringExtra(MovieRatingActivity.EXTRA_MOVIE_ID)
            if (extra != null) {
                fillViewWithContent(extra)
            }
        }
    }

    private fun fillViewWithContent(extra:String) {
        // Fill our view with content by using the provided "extra" string from the intent
        movie_detail_header.text = movieById(extra)!!.title
        movie_detail_director.text = movieById(extra)!!.director.name
        movie_detail_actors.text = movieById(extra)!!.actors.map{ it.name }.joinToString()
        movie_detail_genre.text = movieById(extra)!!.genre.name
        movie_detail_ratingBar.rating = movieById(extra)!!.ratingAverage().toFloat()
        movie_detail_rating_avg.text = movieById(extra)!!.ratingAverage().toString()
        movie_detail_rating_cnt.text = movieById(extra)!!.reviews.size.toString()
        movie_detail_release.text = movieById(extra)!!.release
        movie_detail_plot.text = movieById(extra)!!.plot
    }
}
