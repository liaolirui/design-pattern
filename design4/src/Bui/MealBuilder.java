package Bui;

public abstract class MealBuilder {
	
    protected Meal meal=new Meal();

    abstract void buildFood();

    abstract void buildDrink();

    public Meal getMeal(){
        return meal;
    }

}
