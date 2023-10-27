package chap12.ex02;

public class Exam {
	float errorThreshold;
	Image image;
	
	void scaleToOneDimension(float desiredDimension, float imageDimension) {
		if (Math.abs(desiredDimension - imageDimension) < errorThreshold) {
			return;
		}
		float scalingFactor = desiredDimension / imageDimension;
		scalingFactor = (float)(Math.floor(scalingFactor *100) * 0.00f);
		
		RenderedOp newImage = ImageUtilities.getScaledImaged(image, scalingFactor, scalingFactor);
		image.dispose();
		System.gc();
		image = newImage;
	}
	
	synchronized void rotate(int degrees) {
		RenderedOp newImage = ImageUtilities.getRotatedImage(image, degrees);
		image.dispose();
		System.gc();
		image = newImage;
	}
	
}
