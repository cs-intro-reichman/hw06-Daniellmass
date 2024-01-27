import java.awt.Color;

public class Editor4 {

    public static void main(String[] args) {
        String sourceFileName = args[0];
        int n = Integer.parseInt(args[1]);
        Color[][] sourceImage = Runigram.read(sourceFileName);

        // create the grayscale version of the source image
        Color[][] grayscaleImage = Runigram.grayScaled(sourceImage);

        Runigram.setCanvas(sourceImage);
        Runigram.morph(sourceImage, grayscaleImage, n);
    }
}
