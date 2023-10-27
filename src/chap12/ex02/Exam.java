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
		
		replaceImage(ImageUtilities.getScaledImaged(image, scalingFactor, scalingFactor));
	}
	
	synchronized void rotate(int degrees) {
		replaceImage(ImageUtilities.getRotatedImage(image, degrees));
	}
	
	private void replaceImage(RenderedOp newImage) {
		image.dispose();
		System.gc();
		image = newImage;
	}
}
