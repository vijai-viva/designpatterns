package com.viva.dev.patterns.creational.builder;

//product Class
public class TravelPackage {

	private String destination;
	private boolean includesFlight;
	private boolean includesSuite;
	private boolean includesSiteSeeingCharges;
	private String mealPlan;

	private TravelPackage(com.viva.dev.patterns.creational.builder.TravelPackage.Builder builder) {
		this.destination = builder.destination;
		this.includesFlight = builder.includesFlight;
		this.includesSuite = builder.includesSuite;
		this.includesSiteSeeingCharges = builder.includesSiteSeeingCharges;
		this.mealPlan = builder.mealPlan;
	}

	public static class Builder {
		private String destination;
		private boolean includesFlight;
		private boolean includesSuite;
		private boolean includesSiteSeeingCharges;
		private String mealPlan;

		public Builder(String dest) {
			this.destination = dest;
		}

		public Builder withFlight() {
			this.includesFlight = true;
			return this;
		}

		public Builder withSuite() {
			this.includesSuite = true;
			return this;
		}

		public Builder withSiteSeeingCharges() {
			this.includesSiteSeeingCharges = true;
			return this;
		}

		public Builder withMeals(String mealPlan) {
			this.mealPlan = mealPlan;
			return this;
		}
		
		public TravelPackage build() { 
			return new TravelPackage(this);
		}

	}
}
