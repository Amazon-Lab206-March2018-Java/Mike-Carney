package com.micarney.Countries.models;

@Entitiy
@Table(name="cities")
public enum CityMod {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@Size(max = 35)
	private String name;
	
	@Column
	@Size(max = 3)
	private String countryCode;
	
	
	

}
