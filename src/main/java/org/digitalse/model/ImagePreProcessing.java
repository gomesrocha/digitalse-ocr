package org.digitalse.model;

import static org.bytedeco.opencv.global.opencv_imgcodecs.IMREAD_GRAYSCALE;
import static org.bytedeco.opencv.global.opencv_imgcodecs.imread;
import static org.bytedeco.opencv.global.opencv_imgcodecs.imwrite;
import static org.bytedeco.opencv.global.opencv_imgproc.THRESH_BINARY;
import static org.bytedeco.opencv.global.opencv_imgproc.threshold;

import org.bytedeco.opencv.opencv_core.Mat;

public class ImagePreProcessing {
	public static String binarization(String fileIn, String fileOut) {
		final Mat src = imread(fileIn, IMREAD_GRAYSCALE);
		final Mat dest = new Mat();
		threshold(src, dest, 150, 255, THRESH_BINARY);
		imwrite(fileOut, dest);
		return fileOut;

	}

}
