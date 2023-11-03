import java.util.ArrayList;

public class Box<T extends Fruit>
   {
    private ArrayList<T> fruits;  // список фруктов в коробке 
    
    private double weight;  // вес коробки 
    
    public Box() 
    { 
    this.fruits = new ArrayList<>(); 
    }

    // добавление фрукта в коробку
     public void add(T fruit) 
     { 
    fruits.add(fruit); weight += fruitWeight(fruit);
     }

// вычисление веса одного фрукта 

private double fruitWeight(T fruit) 
{ 
if (fruit instanceof Apple)
{ 
    return 1.0; 
} 

else if (fruit instanceof Orange) 
{ 
    return 1.5; 
} else 

{ 
    return 0.0; 
} 

}

// вычисление веса всей коробки 

public double getWeight() 
{ 
    return weight;  
}

// сравнение веса текущей коробки с другой коробкой 

public boolean compare(Box<?> box) 

{ 
    return Double.compare(this.getWeight(), box.getWeight()) == 0; 
}
// пересыпание фруктов из текущей коробки в другую 

public void pourTo(Box<T> box) 
{ for (T fruit : fruits)
    { box.add(fruit); } 
    fruits.clear(); weight = 0;
 } 

}