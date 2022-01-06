package figuren;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {
    private ArrayList<Figure> figure;

    public FigureManager() {
        this.figure = figure;
    }

    public ArrayList<Figure> getFigure() {
        return figure;
    }

    public void add(Figure f){
        figure.add(f);
    }

    public double getMaxPerimeter(){
        for(Figure f : figure){
            for(double maxumf = 0; maxumf < f.getPerimeter(); maxumf = f.getPerimeter()){
                return maxumf;
            }
        }
        return 0.0;
    }

    public double getAverageAreaSize(){
        double arsum = 0;
        int count = 1;

        for(Figure f : figure){
            arsum += f.getArea();
            count++;
        }
        return arsum / count;
    }

    public HashMap<String, Double> getAreaBySizeCategories(){
        HashMap<String, Double> result = new HashMap<>();
        result.put("klein", 0.0);
        result.put("mittel", 0.0);
        result.put("groß", 0.0);

        for(Figure f : figure){
            if(f.getArea() < 1000){
                double sum = result.get("klein");
                sum += f.getArea();
                result.put("klein", sum);
            }
            else if(f.getArea() < 5000){
                double sum = result.get("mittel");
                sum += f.getArea();
                result.put("mittel", sum);
            }
            else{
                double sum = result.get("groß");
                sum += f.getArea();
                result.put("groß", sum);
            }
        }
        return result;

    }








}
