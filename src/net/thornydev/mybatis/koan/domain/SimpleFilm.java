package net.thornydev.mybatis.koan.domain;

import java.util.Date;

public class SimpleFilm {
	private int id;
	private String title;
	private String description;
//	private Year releaseYear;  // FIXME change to Year object later ...
	private String releaseYear;
	private int rentalDuration;
	private float rentalRate;  // FIXME change to BigDecimal later
	private int length;
	private float replacementCost;  // FIXME change to BigDecimal later
	private String rating;
	private Date lastUpdate;
	private String specialFeatures;

	// skipping "full text" column (or table) since it is treated differently
	// in the different databases

	public SimpleFilm() {}

	public SimpleFilm(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	public int getRentalDuration() {
		return rentalDuration;
	}

	public void setRentalDuration(int rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	public float getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(float rentalRate) {
		this.rentalRate = rentalRate;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public float getReplacementCost() {
		return replacementCost;
	}

	public void setReplacementCost(float replacementCost) {
		this.replacementCost = replacementCost;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getSpecialFeatures() {
		return specialFeatures;
	}

	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}
}