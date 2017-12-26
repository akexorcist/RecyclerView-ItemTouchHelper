package com.akexorcist.recyclerviewwithitemtouchhelper

/**
 * Created by Akexorcist on 26/12/2017 AD.
 */

object InfoGenerator {
    fun createAndroidVersionInfo(): MutableList<Android> {
        return arrayListOf(
                Android(codeName = "Cupcake", version = "1.5", apiLevel = 3, releaseDate = "27 April 2009"),
                Android(codeName = "Donut", version = "1.6", apiLevel = 4, releaseDate = "15 September 2009"),
                Android(codeName = "Eclair", version = "2.0", apiLevel = 5, releaseDate = "26 October 2009"),
                Android(codeName = "Eclair", version = "2.0.1", apiLevel = 6, releaseDate = "3 December 2009"),
                Android(codeName = "Eclair", version = "2.1", apiLevel = 7, releaseDate = "12 January 2010"),
                Android(codeName = "Froyo", version = "2.2", apiLevel = 8, releaseDate = "20 May 2010"),
                Android(codeName = "Gingerbread", version = "2.3", apiLevel = 9, releaseDate = "6 December 2010"),
                Android(codeName = "Gingerbread", version = "2.3.3", apiLevel = 10, releaseDate = "9 February 2011"),
                Android(codeName = "Honeycomb", version = "3.0", apiLevel = 11, releaseDate = "22 February 2011"),
                Android(codeName = "Honeycomb", version = "3.1", apiLevel = 12, releaseDate = "10 May 2011"),
                Android(codeName = "Honeycomb", version = "3.2", apiLevel = 13, releaseDate = "15 July 2011"),
                Android(codeName = "Ice Cream Sandwich", version = "4.0", apiLevel = 14, releaseDate = "18 October 2011"),
                Android(codeName = "Ice Cream Sandwich", version = "4.0.3", apiLevel = 15, releaseDate = "16 December 2011"),
                Android(codeName = "Jelly Bean", version = "4.1", apiLevel = 16, releaseDate = "9 July 2012"),
                Android(codeName = "Jelly Bean", version = "4.2", apiLevel = 17, releaseDate = "13 November 2012"),
                Android(codeName = "Jelly Bean", version = "4.3", apiLevel = 18, releaseDate = "24 July 2013"),
                Android(codeName = "Kitkat", version = "4.4", apiLevel = 19, releaseDate = "31 October 2013"),
                Android(codeName = "Kitkat Wear", version = "4.4W", apiLevel = 20, releaseDate = "25 June 2014"),
                Android(codeName = "Lollipop", version = "5.0", apiLevel = 21, releaseDate = "12 November 2014"),
                Android(codeName = "Lollipop", version = "5.1", apiLevel = 22, releaseDate = "9 March 2015"),
                Android(codeName = "Marshmallow", version = "6.0", apiLevel = 23, releaseDate = "5 October 2015"),
                Android(codeName = "Nougat", version = "7.0", apiLevel = 24, releaseDate = "22 August 2016"),
                Android(codeName = "Nougat", version = "7.1", apiLevel = 25, releaseDate = "4 October 2016"),
                Android(codeName = "Oreo", version = "8.0", apiLevel = 26, releaseDate = "21 August 2017"),
                Android(codeName = "Oreo", version = "8.1", apiLevel = 27, releaseDate = "5 December 2017")
        )
    }
}