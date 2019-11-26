package com.sserdiuk.topreddit.data.local.entity

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity(primaryKeys = ["id"])
data class PostEntity(
    @SerializedName("id")
    val id: String,

    @SerializedName(value = "header", alternate = ["title", "name"])
    val title: String,

    @SerializedName(value = "author", alternate = ["creator", "owner"])
    val author: String,

    @SerializedName(value = "thumbnail", alternate = ["thumb"])
    val thumbnail: String,

    @SerializedName(value = "num_comments", alternate = ["comments_count"])
    val commentsCount: Int,

    @SerializedName(value = "created", alternate = ["date_creation"])
    val created: Double
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readDouble()
    )

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeString(id)
        writeString(title)
        writeString(author)
        writeString(thumbnail)
        writeInt(commentsCount)
        writeDouble(created)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PostEntity> {
        override fun createFromParcel(parcel: Parcel): PostEntity = PostEntity(parcel)
        override fun newArray(size: Int): Array<PostEntity?> = arrayOfNulls(size)
    }
}