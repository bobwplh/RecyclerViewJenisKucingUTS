package com.bob.recyclerviewjeniskucinguts

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

    @Parcelize
    data class JenisKucing(
        val GambarKucings: Int,
        val JenisKucings: String,
        val DeskripsiJenisKucings: String
    ) : Parcelable
