package model;



public class TanhUnit implements Nonlinearity {

	private static final long serialVersionUID = 1L;

	@Override
	public double forward(double x) {
		return Math.tanh(x);
	}

	/**
	 * Formula of (4 cos^2(x))/(1+cos(2 x))^2 is one of derivative formula for tanh (see wolfframalphs.com for detail)
	 * @param x
	 * @return
     */
	@Override
	public double backward(double x) {
		double coshx = Math.cosh(x);
		double denom = (Math.cosh(2*x) + 1);
		return 4 * coshx * coshx / (denom * denom);
	}
}
