package com.example.euro24application.model

import com.example.euro24application.R
import com.example.euro24application.model.Resources

class Datasource {
    fun loadResource():List<Resources>{
        return listOf<Resources>(
            Resources(1,R.string.sehic, R.drawable.sehic, 34,R.drawable.sehic_info),
            Resources(2,R.string.vasilj, R.drawable.vasilj, 27,R.drawable.vasilj_info),
            Resources(3,R.string.piric, R.drawable.piric, 28,R.drawable.piric_info),
            Resources(4,R.string.ahmedhodzic, R.drawable.ahmedhodzic, 24,R.drawable.ahmedhodzic_info),
            Resources(5,R.string.hadzikadunic, R.drawable.hadzikadunic, 23,R.drawable.hadzikadunic_info),
            Resources(6,R.string.sanicanin, R.drawable.sanicanin, 28,R.drawable.sanicanin_info),
            Resources(7,R.string.milicevic, R.drawable.milicevic, 30,R.drawable.milicevic_info),
            Resources(8,R.string.kovacevic, R.drawable.kovacevic, 29,R.drawable.kovacevic_info),
            Resources(9,R.string.dedic, R.drawable.dedic, 20,R.drawable.dedic_info),
            Resources(10,R.string.gazibegovic, R.drawable.gazibegovic, 23,R.drawable.gazibegovic_info),
            Resources(11,R.string.hadziahmetovic, R.drawable.hadziahmetovic, 26,R.drawable.hadziahmetovic_info_),
            Resources(12,R.string.krunic, R.drawable.krunic, 29,R.drawable.krunic_info),
            Resources(13,R.string.tahirovic, R.drawable.tahirovic, 20,R.drawable.tahirovic_info),
            Resources(14,R.string.gojak, R.drawable.gojak, 26,R.drawable.gazibegovic_info),
            Resources(15,R.string.cimirot, R.drawable.cimirot, 30,R.drawable.cimirot_info),
            Resources(16,R.string.dzeko, R.drawable.dzeko, 37,R.drawable.sehic_info),
            Resources(17,R.string.demirovic, R.drawable.demirovic, 25,R.drawable.demirovic_info),
            Resources(18,R.string.prevljak, R.drawable.prevljak, 28,R.drawable.prevljak_info),
            Resources(19,R.string.stevanovic, R.drawable.stevanovic, 32,R.drawable.stevanovic_info),
            Resources(20,R.string.bilbija, R.drawable.bilbija, 32,R.drawable.bilbija_info),
            Resources(21,R.string.kodro, R.drawable.kodro, 29,R.drawable.kodro_info),
            Resources(22,R.string.mesanovic, R.drawable.mesanovic, 31,R.drawable.mesanovic_info),
            Resources(23,R.string.duljevic, R.drawable.duljevic, 28,R.drawable.duljevic_info),

        )
    }
}