package at.fh.swengb.bauer

import android.util.Log

// Here we define all attributes of a movie as well as a function that calculates
// the average of all review scores
class Movie(val id:String,
            val title:String,
            val release:String,
            val plot:String,
            val genre:MovieGenre,
            val reviews:MutableList<Review>,
            val director:Person,
            val actors: List<Person>
            ){

    fun ratingAverage():Double{
        var reviewSum = reviews.map{it.reviewValue}.average()
        if (reviewSum.isNaN()) {
            reviewSum = 0.0
        }
        return reviewSum
    }

}