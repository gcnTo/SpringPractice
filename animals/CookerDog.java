package com.luv2code.animals;

public class CookerDog extends Dog {

	private BreedService breedService;
	
	public CookerDog(BreedService breedService) {
		this.breedService = breedService;
	}

	@Override
	public String getBreed() {
		
		return breedService.getBreed();
	}

}
