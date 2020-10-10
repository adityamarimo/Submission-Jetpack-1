package com.mojasoft.movieapp.utils;

import com.mojasoft.movieapp.R;
import com.mojasoft.movieapp.data.FilmEntity;

import java.util.ArrayList;
import java.util.List;

public class DataDummy {

    public static List<FilmEntity> generateDummyMovies() {

        ArrayList<FilmEntity> movie = new ArrayList<>();

        movie.add(new FilmEntity("m1",
                "Aquaman",
                "Action, Adventure, Fantasy",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne",
                "12/21/2018",
                "69%",
                "2h 24m",
                "https://www.themoviedb.org/movie/297802-aquaman",
                R.drawable.poster_aquaman));

        movie.add(new FilmEntity("m2",
                "Alita: Battle Angel",
                "Action, Science Fiction, Adventure",
                "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
                "02/14/2019",
                "71%",
                "2h 2m",
                "https://www.themoviedb.org/movie/399579-alita-battle-angel",
                R.drawable.poster_alita));

        movie.add(new FilmEntity("m3",
                "How to Train Your Dragon: The Hidden World",
                "Animation, Family, Adventure",
                "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
                "02/22/2019",
                "78%",
                "1h 44m",
                "https://www.themoviedb.org/movie/166428-how-to-train-your-dragon-3",
                R.drawable.poster_how_to_train));

        movie.add(new FilmEntity("m4",
                "Spider-Man: Into the Spider-Verse ",
                "Action, Adventure, Animation",
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                "12/14/2018",
                "84%",
                "1h 57m",
                "https://www.themoviedb.org/movie/324857-spider-man-into-the-spider-verse",
                R.drawable.poster_spiderman));

        movie.add(new FilmEntity("m5",
                "Creed II",
                "Drama",
                "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life",
                "11/21/2018",
                "69%",
                "2h 10m",
                "https://www.themoviedb.org/movie/480530-creed-ii",
                R.drawable.poster_creed));

        movie.add(new FilmEntity("m6",
                "Mortal Engines",
                "Adventure, Fantasy",
                "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                "12/14/2018",
                "61%",
                "2h 9m",
                "https://www.themoviedb.org/movie/428078-mortal-engines",
                R.drawable.poster_mortal_engines));

        movie.add(new FilmEntity("m7",
                "Avengers: Infinity War",
                "Adventure, Action, Science Fiction",
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                "04/27/2018",
                "83%",
                "2h 29m",
                "https://www.themoviedb.org/movie/299536-avengers-infinity-war",
                R.drawable.poster_infinity_war));

        movie.add(new FilmEntity("m8",
                "Overlord",
                "Horror, War, Science Fiction",
                "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.",
                "11/09/2018",
                "67%",
                "1h 50m",
                "https://www.themoviedb.org/movie/438799-overlord",
                R.drawable.poster_overlord));

        movie.add(new FilmEntity("m9",
                "Ralph Breaks the Internet",
                "Family, Animation, Comedy, Adventure",
                "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, Sugar Rush. In way over their heads, Ralph and Vanellope rely on the citizens of the internet — the netizens — to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube.",
                "11/21/2018",
                "72%",
                "1h 52m",
                "https://www.themoviedb.org/movie/404368-ralph-breaks-the-internet",
                R.drawable.poster_ralph));

        movie.add(new FilmEntity("m10",
                "Robin Hood",
                "Adventure, Action, Thriller",
                "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
                "11/21/2018",
                "59%",
                "1h 56m",
                "https://www.themoviedb.org/movie/375588-robin-hood-origins",
                R.drawable.poster_robin_hood));

        return movie;
    }

    public static List<FilmEntity> generateDummyTv() {

        ArrayList<FilmEntity> tv = new ArrayList<>();

        tv.add(new FilmEntity("t1",
                "Fairy Tail",
                "Action & Adventure, Animation",
                "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
                "2009",
                "74%",
                "25m",
                "https://www.themoviedb.org/tv/46261-fairy-tail",
                R.drawable.poster_fairytail));

        tv.add(new FilmEntity("t2",
                "Arrow",
                "Crime, Drama, Mystery, Action",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "2012",
                "64%",
                "42m",
                "https://www.themoviedb.org/tv/1412-arrow",
                R.drawable.poster_arrow));

        tv.add(new FilmEntity("t3",
                "Naruto Shippūden",
                "Animation, Comedy, Drama",
                "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
                "2007",
                "87%",
                "25m",
                "https://www.themoviedb.org/tv/31910-naruto-shipp-den",
                R.drawable.poster_naruto_shipudden));

        tv.add(new FilmEntity("t4",
                "Family Guy",
                "Animation, Comedy",
                "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                "1999",
                "68%",
                "22m",
                "https://www.themoviedb.org/tv/1434-family-guy",
                R.drawable.poster_family_guy));

        tv.add(new FilmEntity("t5",
                "Gotham",
                "Drama, Fantasy, Crime",
                "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker.",
                "2014",
                "74%",
                "43m",
                "https://www.themoviedb.org/tv/60708-gotham",
                R.drawable.poster_gotham));

        tv.add(new FilmEntity("t6",
                "The Flash",
                "Drama, Sci-Fi & Fantasy",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "2014",
                "75%",
                "44m",
                "https://www.themoviedb.org/tv/60735-the-flash",
                R.drawable.poster_flash));

        tv.add(new FilmEntity("t7",
                "The Simpsons",
                "Animation, Comedy, Family",
                "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                "1989",
                "77%",
                "22m",
                "https://www.themoviedb.org/tv/456-the-simpsons",
                R.drawable.poster_the_simpson));

        tv.add(new FilmEntity("t8",
                "The Walking Dead",
                "Action & Adventure, Drama",
                "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                "2010",
                "78%",
                "42m",
                "https://www.themoviedb.org/tv/1402-the-walking-dead",
                R.drawable.poster_the_walking_dead));

        tv.add(new FilmEntity("t9",
                "Supergirl",
                "Action, Adventure, Drama",
                "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
                "2015",
                "70%",
                "42m",
                "https://www.themoviedb.org/tv/62688-supergirl",
                R.drawable.poster_supergirl));

        tv.add(new FilmEntity("t10",
                "Riverdale",
                "Drama, Mystery",
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                "2017",
                "86%",
                "45m",
                "https://www.themoviedb.org/tv/69050-riverdale",
                R.drawable.poster_riverdale));

        return tv;
    }
}
