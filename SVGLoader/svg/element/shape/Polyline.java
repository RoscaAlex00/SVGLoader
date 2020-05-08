package svg.element.shape;

import svg.SVGParser;
import svg.element.Element;

import java.util.ArrayList;
import java.util.List;

public class Polyline extends Shapes {
    private final String label = "polyline";
    private final List<Point2D> polyline = new ArrayList<>();

    public Polyline(String label) {
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
                    polyline.add(new Point2D(result[i].doubleValue(),result[i+1].doubleValue())) ;
                }
        }
        return true;
    }
    public String toString(){
        String toReturn =  label+": ";
        for(Point2D a:polyline){
            toReturn+="("+a.getX()+","+a.getY()+") ";
        }
        return toReturn;
    }
}
