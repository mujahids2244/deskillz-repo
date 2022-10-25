package com.arhamsoft.deskilz.networking.networkModels

import java.io.Serializable

data class GetTournamentsListData(
    val isPractice: Boolean? = null,
    val gamePlay: Int,
    val tournamentID: String,
    val tournamentName: String,
    val winningPrize: String,
    val tournamentImage: String,
    val entryFee: String,
    val playerCount: Long,
    val currencyLabel: String,
    val currencyType: String,
    val gamePromoCode: String,
    val prizes: List<PrizesModel>

):Serializable