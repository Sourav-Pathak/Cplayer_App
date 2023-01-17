package com.stackroute.favourites.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Favourites {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int primaryKey;
	private String id;               //Getting player id to be stored as private
	@Column(name = "name")
	private String name;           //Getting player name to be stored as private
	private Date dateOfBirth;		//Getting player dob to be stored as private
	private String role;			//Getting player role to be stored as private
	private String battingStyle;   //Getting player battingstyle to be stored as private
	private String bowlingStyle;     //Getting player bowlingStyle to be stored as private
	private String placeOfBirth;     //Getting player placeOfBirth to be stored as private
	private String country;        //Getting player country to be stored as private
	private String playerImg;       //Getting player imageURL to be stored as private
	private boolean status;
	@Column(name = "username")
	private String username;
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPrimaryKey() {
		return primaryKey;
	}
	public void setPrimaryKey(int primaryKey) {
		this.primaryKey = primaryKey;
	}
	public String getPlayerImg() {
		return playerImg;
	}
	public void setPlayerImg(String playerImg) {
		this.playerImg = playerImg;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getBattingStyle() {
		return battingStyle;
	}
	public void setBattingStyle(String battingStyle) {
		this.battingStyle = battingStyle;
	}
	public String getBowlingStyle() {
		return bowlingStyle;
	}
	public void setBowlingStyle(String bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getPlayingRole() {
		return role;
	}
	public void setPlayingRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Favourites [primaryKey=" + primaryKey + ", id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth
				+ ", role=" + role + ", battingStyle=" + battingStyle + ", bowlingStyle=" + bowlingStyle
				+ ", placeOfBirth=" + placeOfBirth + ", country=" + country + ", playerImg=" + playerImg + ", status="
				+ status + ", username=" + username + "]";
	}
	
	

}
