package br.com.beecrowd.uri2621.dto;

import br.com.beecrowd.uri2621.projections.ProductMinProjection;

public class ProductMinDTO {

	private String name;
	
	public ProductMinDTO() {
		
	}

	public ProductMinDTO(String name) {
		this.name = name;
	}
		
	public ProductMinDTO(ProductMinProjection projections) {
		name = projections.getName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ProductMinDTO [name=" + name + "]";
	}
	
}
