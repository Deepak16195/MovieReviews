package at.fh.swengb.bauer

object MovieRepository {
    private val movies: List<Movie>

    init {
        movies = listOf(
            // I've stuck to concretely declaring the attributes instead of letting
            // Kotlin use it's inference mainly because it is more readable with
            // the multiple "Person" objects for director and actors
            Movie(id = "0",
                title = "Lord of the Rings FotR",
                release = "2001",
                plot = "A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful " +
                        "One Ring and save Middle-earth from the Dark Lord Sauron. ",
                genre = MovieGenre.FANTASY,
                reviews = mutableListOf(), // Reviews
                director = Person("Peter Jackson", "31.10.1961"),
                actors = listOf(
                    Person("Elijah Wood", "28.1.1981"),
                    Person("Viggo Mortensen", "20.10.1958")
                )
            ),
            Movie(id = "1",
                title = "Lord of the Rings - TtT",
                release = "2002",
                plot = "While Frodo and Sam edge closer to Mordor with the help of the shifty Gollum, the divided fellowship makes" +
                        " a stand against Sauron's new ally, Saruman, and his hordes of Isengard. ",
                genre = MovieGenre.FANTASY,
                reviews = mutableListOf(), // Reviews
                director = Person("Peter Jackson", "31.10.1961"),
                actors = listOf(
                    Person("Elijah Wood", "28.1.1981"),
                    Person("Viggo Mortensen", "20.10.1958")
                )
            ),
            Movie(id = "2",
                title = "Harry Potter and the Sorcerers Stone",
                release = "2001",
                plot = "An orphaned boy enrolls in a school of wizardry, where he learns the truth about" +
                        " himself, his family and the terrible evil that haunts the magical world. ",
                genre = MovieGenre.FANTASY,
                reviews = mutableListOf(), // Reviews
                director = Person("Chris Columbus", "10.9.1958"),
                actors = listOf(
                    Person("Daniel Radcliff", "23.7.1989"),
                    Person("Emma Watson", "15.4.1990")
                )
            ),

            Movie(id = "3",
                title = "Die Hard",
                release = "1988",
                plot = "An NYPD officer tries to save his wife and several others taken hostage by" +
                        " German terrorists during a Christmas party at the Nakatomi Plaza in Los Angeles.",
                genre = MovieGenre.ACTION,
                reviews = mutableListOf(), // Reviews
                director = Person("John McTiernan", "8.1.1951"),
                actors = listOf(
                    Person("Bruce Willis", "19.3.1955"),
                    Person("Alan Rickman", "21.2.1946")
                )
            ),
            Movie(id = "4",
                title = "Harry Potter and the Chamber of Secrets",
                release = "2002",
                plot = "An ancient prophecy seems to be coming true when a mysterious presence begins" +
                        " stalking the corridors of a school of magic and leaving its victims paralyzed. ",
                genre = MovieGenre.FANTASY,
                reviews = mutableListOf(), // Reviews
                director =Person("Chris Columbus", "10.9.1958"),
                actors = listOf(
                    Person("Daniel Radcliff", "23.7.1989"),
                    Person("Emma Watson", "15.4.1990")
                )
            ),

            Movie(id = "5",
                title = "Die Hard 2",
                release = "1990",
                plot = "John McClane attempts to avert disaster as rogue military operatives seize" +
                        " control of Dulles International Airport in Washington, D.C. ",
                genre = MovieGenre.ACTION,
                reviews = mutableListOf(), // Reviews
                director = Person("Renny Harlin", "15.3.1959"),
                actors = listOf(
                    Person("Bruce Willis", "19.3.1955"),
                    Person("William Atherton", "30.7.1947")
                )
            ),

            Movie(id = "6",
                title = "Harry Potter and the Goblet of Fire",
                release = "2005",
                plot = "Harry Potter (Daniel Radcliffe) finds himself competing in a hazardous tournament" +
                        " between rival schools of magic, but he is distracted by recurring nightmares. ",
                genre = MovieGenre.FANTASY,
                reviews = mutableListOf(), // Reviews
                director = Person("Mike Newell", "28.3.1942"),
                actors = listOf(
                    Person("Daniel Radcliff", "23.7.1989"),
                    Person("Emma Watson", "15.4.1990")
                )
            ),

            Movie(id = "7",
                title = "Die Hard with a Vengeance",
                release = "1995",
                plot = "John McClane and a Harlem store owner are targeted by German terrorist" +
                        " Simon Gruber in New York City, where he plans to rob the Federal Reserve Building. ",
                genre = MovieGenre.ACTION,
                reviews = mutableListOf(), // Reviews
                director = Person("John McTiernan", "8.1.1951"),
                actors = listOf(
                    Person("Bruce Willis", "19.3.1955"),
                    Person("Samuel L. Jackson", "21.12.1948")
                )
            ),

            Movie(id = "8",
                title = "Harry Potter and the Prisoner of Azkaban",
                release = "2004",
                plot = "It's Harry's (Daniel Radcliffe's) third year at Hogwarts; not only does he have a new " +
                        "\"Defense Against the Dark Arts\" teacher, Professor Lupin (David Thewlis), " +
                        "but there is also trouble brewing. Convicted murderer Sirius Black " +
                        "(Gary Oldman) has escaped the Wizards' Prison and is coming after Harry. ",
                genre = MovieGenre.FANTASY,
                reviews = mutableListOf(), // Reviews
                director = Person("Alfonso Cuaron", "28.11.1961"),
                actors = listOf(
                    Person("Daniel Radcliff", "23.7.1989"),
                    Person("Emma Watson", "15.4.1990")
                )
            ),

            Movie(id = "9",
                title = "Lord of the Rings: RotK",
                release = "2003",
                plot = "Gandalf and Aragorn lead the World of Men against Sauron's army to draw his gaze" +
                        " from Frodo and Sam as they approach Mount Doom with the One Ring. ",
                genre = MovieGenre.FANTASY,
                reviews = mutableListOf(), // Reviews
                director = Person("Peter Jackson", "31.10.1961"),
                actors = listOf(
                    Person("Elijah Wood", "28.1.1981"),
                    Person("Viggo Mortensen", "20.10.1958")
                )
            ),

            Movie(id = "10",
                title = "Stargate",
                release = "1994",
                plot = "An interstellar teleportation device, found in Egypt, leads to a planet" +
                        " with humans resembling ancient Egyptians who worship the god Ra.",
                genre = MovieGenre.SCIFI,
                reviews = mutableListOf(), // Reviews
                director = Person("Roland Emmerich", "10.11.1955"),
                actors = listOf(
                    Person("Kurt Russel", "17.3.1951"),
                    Person("James Spader", "7.2.1960")
                )
            ),

            Movie(id = "11",
                title = "The Hateful Eight",
                release = "2015",
                plot = "In the dead of a Wyoming winter, a bounty hunter and his prisoner" +
                        " find shelter in a cabin currently inhabited by a collection" +
                        " of nefarious characters.",
                genre = MovieGenre.ACTION,
                reviews = mutableListOf(), // Reviews
                director = Person("Quentin Tarantino", "27.3.1963"),
                actors = listOf(
                    Person("Kurt Russel", "17.3.1951"),
                    Person("Samuel L. Jackson", "21.12.1948")
                )
            ),

            Movie(id = "12",
                title = "Inside Man",
                release = "2006",
                plot = "A police detective, a bank robber, and a high-power broker enter high-stakes" +
                        " negotiations after the criminal's brilliant heist spirals into a" +
                        " hostage situation. ",
                genre = MovieGenre.ACTION,
                reviews = mutableListOf(), // Reviews
                director = Person("Spike Lee", "20.3.1957"),
                actors = listOf(
                    Person("Denzel Washington", "28.12.1954"),
                    Person("Clive Owen", "3.10.1964")
                )
            ),

            Movie(id = "13",
                title = "GoldenEye",
                release = "1995",
                plot = "Years after a friend and fellow 00 agent is killed on a joint mission, " +
                        "a secret space based weapons program known as \"GoldenEye\" is stolen." +
                        " James Bond sets out to stop a Russian crime syndicate from using the weapon. ",
                genre = MovieGenre.ACTION,
                reviews = mutableListOf(), // Reviews
                director = Person("Martin Campbell", "24.10.1943"),
                actors = listOf(
                    Person("Pierce Brosnan", "16.5.1953"),
                    Person("Sean Bean", "17.4.1959")
                )
            ),

            Movie(id = "14",
                title = "Tomorrow Never Dies",
                release = "1997",
                plot = "James Bond (Pierce Brosnan) heads to stop a media mogul's plan to induce" +
                        " war between China and the U.K. in order to obtain exclusive" +
                        " global media coverage. ",
                genre = MovieGenre.ACTION,
                reviews = mutableListOf(), // Reviews
                director = Person("Martin Campbell", "24.10.1943"),
                actors = listOf(
                    Person("Pierce Brosnan", "16.5.1953"),
                    Person("Jonathan Pryce", "1.6.1947")
                )
            ),

            Movie(id = "15",
                title = "The World Is Not Enough",
                release = "1999",
                plot = "James Bond (Pierce Brosnan) uncovers a nuclear plot when he protects an oil" +
                        " heiress from her former kidnapper, an international" +
                        " terrorist who can't feel pain. ",
                genre = MovieGenre.ACTION,
                reviews = mutableListOf(), // Reviews
                director = Person("Michael Apted", "10.2.1941"),
                actors = listOf(
                    Person("Pierce Brosnan", "16.5.1953"),
                    Person("Sophie Marceau", "17.11.1966")
                )
            )




        )
    }
    // Return our list of movies as a whole
    fun movieList(): List<Movie> {
        return movies
    }

    // Return only the movie that matches the provided id
    fun movieById(id: String): Movie? {
        return movies.find { (it.id == id) }
    }

    // Check if we have a movie with the ID provided, if so add the review
    // provided to that movies list of reviews
    fun reviewMovie(id: String, review: Review) {
        if (movieById(id) != null){
            movieById(id)!!.reviews.add(review)
        }

    }

}