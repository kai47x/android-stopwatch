package com.danielbostwick.stopwatch.ext

import org.joda.time.Duration

fun Duration.toTimeElapsedString(): String {
    val seconds = this.standardSeconds % 60
    val minutes = this.standardSeconds / 60
    val hours = this.standardSeconds / 3600

    val minuteStr = if (minutes > 9) "${minutes}" else "0${minutes}"
    val secondStr = if (seconds > 9) "${seconds}" else "0${seconds}"

    return if (hours > 0) "${hours}:${minuteStr}:${secondStr}"
    else "E ${minuteStr}:${secondStr}"
}
