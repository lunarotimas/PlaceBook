package com.raywenderlich.placebook.model

import androidx.room.Entity
import androidx.room.PrimaryKey

    // makes database
    @Entity
    // constructor
    data class Bookmark(
        //required for entity at least once
        @PrimaryKey(autoGenerate = true) var id: Long? = null,
        // fields with default values
        var placeId: String? = null,
        var name: String = "",
        var address: String = "",
        var latitude: Double = 0.0,
        var longitude: Double = 0.0,
        var phone: String = ""
    )
