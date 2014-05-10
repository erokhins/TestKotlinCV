package org.hanuna.images.test

import org.hanuna.images.system.loadOpenCV
import org.opencv.core.Mat
import org.opencv.core.CvType

/**
 * Created by smevok on 5/11/14.
 */

fun main(args: Array<String>) {
    loadOpenCV()
    Mat(100, 100, CvType.CV_8UC3)
}