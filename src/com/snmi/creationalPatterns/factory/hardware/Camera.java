package com.snmi.creationalPatterns.factory.hardware;

/**
 * Camera object that extends Hardware
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Camera extends Hardware {

    /**
     * Constants
     */
    private static final String SHOW_CAMERA_INFO = "Camera %s megapixels is %.0f";

    /**
     * Variables
     */
    private double megaPixels;

    /**
     * Default constructor
     */
    public Camera() {}

    /**
     * Custom constructor
     * @param brand take the Camera's brand
     * @param megaPixels take the Camera's mega pixels
     */
    public Camera(String brand, double megaPixels) {
        super (brand);
        this.megaPixels = megaPixels;
    }

    /**
     * Setters and getters
     */
    public double getMegaPixels() {
        return megaPixels;
    }

    public void setMegaPixels(double megaPixels) {
        this.megaPixels = megaPixels;
    }

    /**
     * Camera implementation of Hardware's show information method
     */
    @Override
    public void showInformation() {
        System.out.printf(SHOW_CAMERA_INFO, super.getBrand(), getMegaPixels());
        System.out.println();
    }
}
