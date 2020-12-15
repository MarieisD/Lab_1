package bsu.rfe.java.group9.lab1.Eismont.var12B;

public class Apple extends Food
{
    private String size;
    private Double calories = null;

    public Apple(String size)
    {
        super("Яблоко");
        this.size = size;
    }
    public void consume()
    {
        System.out.println(this + " съедено");
    }
    public Double calculateCalories()
    {
        if(size.equals("большое"))
        {
            calories = 36.5;
        }
        else if(size.equals("среднее"))
        {
            calories = 19.2;
        }
        else if(size.equals("маленькое"))
        {
            calories = 10.8;
        }
        return calories;
    }
    public String getSize()
    {
        return size;
    }
    public void setSize(String size)
    {
        this.size = size;
    }
    public boolean equals(Object arg0)
    {
        if (super.equals(arg0))
        {
            if (!(arg0 instanceof Apple)) return false;
            return size.equals(((Apple)arg0).size);
        } else
            return false;
    }
    public String toString()
    {
        return super.toString() + "'" + size.toUpperCase() + "'";
    }
}