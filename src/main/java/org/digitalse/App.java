package org.digitalse;
/**
 * DigitalSE-OCR
 * App.java
 * Propósito: Centralizar uso do OCR.
 *
 * @author Fabio Gomes Rocha
 * @version 0.0.1 12/04/2021
 */
import javax.swing.WindowConstants;

import org.bytedeco.javacv.CanvasFrame;
import org.bytedeco.javacv.Java2DFrameConverter;
import org.bytedeco.javacv.OpenCVFrameConverter;
import org.bytedeco.opencv.opencv_core.Mat;
import org.bytedeco.opencv.opencv_core.Scalar;
import org.digitalse.model.TokenExtract;
import org.digitalse.utils.ConvertInformation;
import org.digitalse.utils.UtilView;
import org.opencv.core.CvType;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import static org.bytedeco.opencv.global.opencv_core.*;
import static org.bytedeco.opencv.opencv_java.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.imread;
import static org.bytedeco.opencv.global.opencv_imgproc.Laplacian;

import org.bytedeco.javacpp.*;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class App 
{

    public static void main( String[] args )
    {
    	/*
        BytePointer outText;
        System.out.println( "Hello World!" );
     // Read an image.
        final Mat src = imread("data/do.jpeg");
        UtilView.display(src, "Input");

        // Apply Laplacian filter
        final Mat dest = new Mat();
        Laplacian(src, dest, src.depth(), 1, 3, 0, BORDER_DEFAULT);
        UtilView.display(dest, "Laplacian");
        Mat teste = new Mat(5, 10, CV_16UC1, new Scalar(0));
        System.out.println("OpenCV Mat: " + src);
        
    
        	*/	
        //BufferedImage imageFile = ConvertInformation.matToBufferedImage(src);
        TokenExtract te = new TokenExtract();
    	File imageFile = new File("data/ocr1.png");
        Tesseract tess4j = new Tesseract();
        tess4j.setTessVariable("user_defined_dpi", "300");
        //tess4j.setTessVariable("debug_file", "/dev/null");
        tess4j.setDatapath("data/")
        tess4j.setLanguage("por");
        try {
            String result = tess4j.doOCR(imageFile);
            List<String> res = Arrays.asList(te.token(result));
            //Identico ao for abaixo
            // String res[] = te.token(result);
            //Arrays.stream(res).forEach(r -> {System.out.println(r);});
            res.forEach(r -> {System.out.println(r);});
            for(String r: res) {
            	System.out.println(r);
            }
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
        
    }
    
    
}
