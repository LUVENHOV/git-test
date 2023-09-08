package com.ssafy.ws.step2.dto;

public class Movie {
	// 코드를 작성하세요
	private String title;
	private String director;
	private String genre;
	private int runningTime;

	public Movie() {
	}

	public Movie(String title, String director, String genre, int runningTime) {
		super();
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.runningTime = runningTime;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", director=" + director + ", genre=" + genre + ", runningTime="
				+ runningTime + "]";
	}
	
	

}
