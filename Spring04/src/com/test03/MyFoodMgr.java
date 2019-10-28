package com.test03;

public class MyFoodMgr {
	
	private Food favoriteFood;
	private Food unFavoriteFood;
	
//	public MyFoodMgr() {
//		favoriteFood = new Food();
//		favoriteFood.setName("고기");
//		favoriteFood.setPrice(15000);
//		System.out.println("기본생성자 실행");
//	}
	
	public MyFoodMgr(Food favoriteFood, Food unFavoriteFood) {
		this.favoriteFood = favoriteFood;
		this.unFavoriteFood = unFavoriteFood;
		System.out.println("파라미터두개 생성자 실행");
	}

	public Food getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(Food favoriteFood) {
		this.favoriteFood = favoriteFood;
		System.out.println("setFavoriteFood 실행");
	}

	public Food getUnFavoriteFood() {
		return unFavoriteFood;
	}

	public void setUnFavoriteFood(Food unFavoriteFood) {
		this.unFavoriteFood = unFavoriteFood;
		System.out.println("setUnFavoriteFood실행");
	}

	@Override
	public String toString() {
		return "favoriteFood : " + favoriteFood + ", unFavoriteFood : " + unFavoriteFood;
	}
	
	

}
