package svg.element.shape;

import svg.SVGParser;
import svg.element.Element;

public class Ellipse extends Shapes {
    private double cx;
    private double cy;
    private double rx;
    private double ry;
    private final String label = "ellipse";

    public Ellipse(String label) {
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
        if (expr.contains(" rx=")) {
            final Double result = SVGParser.extractDouble(expr, " rx=")[0];
            if (result != null)
                rx = result.doubleValue();
        }
        if (expr.contains(" ry=")) {
            final Double result = SVGParser.extractDouble(expr, " ry=")[0];
            if (result != null)
                ry = result.doubleValue();
        }
        return true;
    }
    public String toString(){
        return label+": cx="+cx+", cy="+cy+", rx="+rx+", ry="+ry;
    }
}
