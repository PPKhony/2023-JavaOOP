package question1;
public class Calculator {
    public float convertFarenheitToCelsius(float farenheit) {
		float celsius = (5.0f/9.0f)*(farenheit-32);
		return celsius;
	}
	
	public float convertKgToPound(float kg) {
		float pound = kg/0.454f;
		return pound;
	}
	
	public float convertPoundToKg(float pound) {
		float kg = pound * 0.454f;
		return kg;
	}
}
