
class Bottle {
    String size[];
    float weight[];
    String liquid;
    String color;

    // Default structure of Bottle
    public Bottle(String size[], float weight[], String color) {
        this.size = size;
        this.weight = weight;
        this.color = color;
    }

    // Method to Fill Bottle
    public String fillBottle(String liquid) {
        this.liquid = liquid;
        return this.liquid;
    }
}

// A specific type of bottle: water bottle
public class WaterBottle extends Bottle {

    // 
    public WaterBottle(String size[], float weight[], String color) {
        super(size, weight, color);
    }

    public static void main(String[] args) {
        String[] sizes = {"Small", "Medium", "Large"};
        float[] weights = {5.5f};
        String color = "blue";
        
        WaterBottle myBottle = new WaterBottle(sizes, weights, color);
        String s = myBottle.fillBottle("water");
        
        System.out.println("Filled with: " + s);
        System.out.println("Color: " + myBottle.color);
        System.out.println("Size: " + myBottle.size[0]);
        System.out.println("Weight: " + myBottle.weight[0]);

        // Write logic for input into color size weight from system.in
    }
}