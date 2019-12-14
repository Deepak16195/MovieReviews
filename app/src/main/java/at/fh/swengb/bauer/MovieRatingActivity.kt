package at.fh.swengb.bauer

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import at.fh.swengb.bauer.MovieRepository.movieById
import kotlinx.android.synthetic.main.activity_movie_detail.*
import kotlinx.android.synthetic.main.activity_movie_rating.*

class MovieRatingActivity : AppCompatActivity() {

    companion object{
        val EXTRA_MOVIE_ID = "MOVIE_ID_EXTRA"
        val ADD_RATING = "ADD_RATING"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_rating)
        val extra:String? = intent.getStringExtra(MovieDetailActivity.EXTRA_MOVIE_ID)
        if (extra != null) {
            movie_review_header.text = movieById(extra)!!.title
        }

        rate_movie.setOnClickListener {
            val movieRating = Review(reviewValue = movie_review_ratingbar.rating.toDouble(),
                reviewText = movie_review_text.text.toString())
            MovieRepository.reviewMovie(intent.getStringExtra(MovieDetailActivity.EXTRA_MOVIE_ID), movieRating)

            val resultIntent = intent

            resultIntent.putExtra(EXTRA_MOVIE_ID, extra)
            resultIntent.putExtra(ADD_RATING, "ADDED")
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }
    }
}
