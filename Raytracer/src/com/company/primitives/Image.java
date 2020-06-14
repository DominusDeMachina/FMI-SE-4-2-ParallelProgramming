package com.company.primitives;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.company.Main;

public class Image {
  public BufferedImage bufferedImage;
  public File imageFile;

  public Image(String fileName) {
    imageFile = new File(fileName);
    bufferedImage = new BufferedImage(Main.scene.canvas.width, Main.scene.canvas.height, BufferedImage.TYPE_INT_RGB);
  }

  public void write(String fileType) {
    try {
      ImageIO.write(bufferedImage, fileType, imageFile);
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    }
  }
}