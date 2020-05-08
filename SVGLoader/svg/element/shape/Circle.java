package svg.element.shape;

import svg.SVGParser;
import svg.element.Element;

public class Circle extends Shapes {
    private double cx;
    private double cy;
    private double r;
    private String label = "circle";

    public Circle(String label) {
        super(label);
    }

    @Override
    public Element newInstance() {
        return null;
    }

    @Override
    public boolean load(String expr) {
        if (expr.contains(" cx=")) {
            final Double result = SVGParser.extractDouble(expr, " cx=")[0];
            if (result != null)
                cx = result.doubleValue();
        }
        if (expr.contains(" cy=")) {
            final Double result = SVGParser.extractDouble(expr, " cy=")[0];
            if (result != null)
                cy = result.doubleValue();
        }
        if (expr.contains(" r=")) {
            final Double result = SVGParser.extractDouble(expr, " r=")[0];
            if (result != null)
                r = result.doubleValue();
        }
        return false;
    }
    public String toString(){
        return label+": cx="+cx+", cy="+cy+", r="+r;
    }
}
