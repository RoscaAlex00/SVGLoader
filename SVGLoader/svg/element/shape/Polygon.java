package svg.element.shape;

import svg.SVGParser;
import svg.element.Element;

import java.util.ArrayList;
import java.util.List;

public class Polygon extends Polyline {
    private final String label = "polygon";
    private final List<Point2D> polygon = new ArrayList<>();

    public Polygon(String label) {
        super(label);
    }

    @Override
    public Element newInstance() {
        return null;
    }

    @Override
    public boolean load(String expr) {
        if (expr.contains(" points=")) {
            final Double[] result = SVGParser.extractDouble(expr, " points=");
            if (result != null)
                for (int i = 0; i < result.length-1; i++) {
                    polygon.add(new Point2D(result[i].doubleValue(),result[i+1].doubleValue())) ;
                }
        }
        return true;
    }
    public String toString(){
        String toReturn =  label+": ";
        for(Point2D a:polygon){
            toReturn+="("+a.getX()+","+a.getY()+") ";
        }
        return toReturn;
    }
}
