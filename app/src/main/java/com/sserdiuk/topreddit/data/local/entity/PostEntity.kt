package com.sserdiuk.topreddit.data.local.entity

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity(primaryKeys = ["id"])
data class PostEntity(
    @SerializedName("id")
    val id: Long,

    @SerializedName(value = "header", alternate = ["title", "name"])
    val title: String,

    @SerializedName(value = "author", alternate = ["creator", "owner"])
    val author: String,

    @SerializedName(value = "thumbnail", alternate = ["thumb"])
    val thumbnail: String,

    @SerializedName(value = "num_comments", alternate = ["comments_count"])
    val commentsCount: Int,

    @SerializedName(value = "created", alternate = ["date_creation"])
    val created: String,

    @SerializedName(value = "pathToImage", alternate = ["imageUrl", "img"])
    val pathToImage: String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readLong(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
    )

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeLong(id)
        writeString(title)
        writeString(author)
        writeString(thumbnail)
        writeInt(commentsCount)
        writeString(created)
        writeString(pathToImage)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PostEntity> {
        override fun createFromParcel(parcel: Parcel): PostEntity = PostEntity(parcel)
        override fun newArray(size: Int): Array<PostEntity?> = arrayOfNulls(size)
    }
}