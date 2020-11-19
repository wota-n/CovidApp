package com.inti.covidapp

import com.robinhood.spark.SparkAdapter

class CovidSparkAdapter(private val dailyData: List<CovidData>) : SparkAdapter() {

    var metric = Metric.POSITIVE
    var daysAgo = TimeScale.MAX

    override fun getCount() = dailyData.size

    override fun getItem(index: Int) = dailyData[index]

    override fun getY(index: Int): Float {
        val chosenDayData = dailyData[index]
        return when (metric) {
            Metric.NEGATIVE -> chosenDayData.negativeIncrease.toFloat()
            Metric.POSITIVE -> chosenDayData.positiveIncrease.toFloat()
            Metric.DEATH -> chosenDayData.positiveIncrease.toFloat()
        }
        return chosenDayData.positiveIncrease.toFloat()
    }

}
