package com.inti.covidapp

import android.graphics.RectF
import com.robinhood.spark.SparkAdapter

class CovidSparkAdapter(private val dailyData: List<CovidData>) : SparkAdapter() {

    var daysAgo = TimeScale.MAX
    var metric = Metric.POSITIVE

    override fun getCount() = dailyData.size

    override fun getItem(index: Int) = dailyData[index]

    override fun getY(index: Int): Float {
        val chosenDayData = dailyData[index]
        return when (metric) {
            Metric.NEGATIVE -> chosenDayData.negativeIncrease.toFloat()
            Metric.POSITIVE -> chosenDayData.positiveIncrease.toFloat()
            Metric.DEATH -> chosenDayData.deathIncrease.toFloat()
        }
//        return chosenDayData.positiveIncrease.toFloat()
    }

    override fun getDataBounds(): RectF {
        val bounds = super.getDataBounds()
        if(daysAgo != TimeScale.MAX) {
            bounds.left = count - daysAgo.numDays.toFloat()
        }
        return bounds
    }
}
