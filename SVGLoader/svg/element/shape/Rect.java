package svg.element.shape;

import svg.SVGParser;
import svg.element.Element;

public class Rect extends Shapes {
    private double x;
    private double y;
    private double rx;
    private double ry;
    private double width;
    private double height;
    private final String label = "rect";

    public Rect(String label) {
        super(label);
    }

    @Override
    public Element newInstance() {
        return null;
    }

    @Override
    public boolean load(String expr) {
        if (expr.contains(" x=")) {
            final Double result = SVGParser.extractDouble(expr, " x=")[0];
            if (result != null)
                x = result.doubleValue();
        }
        if (expr.contains(" y=")) {
            final Double result = SVGParser.extractDouble(expr, " y=")[0];
            if (result != null)
                y = result.doubleValue();
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
        if (expr.contains(" width=")) {
            final Double result = SVGParser.extractDouble(expr, " width=")[0];
            if (result != null)
                width = result.doubleValue();
        }
        if (expr.contains(" height=")) {
            final Double result = SVGParser.extractDouble(expr, " height=")[0];
            if (result != null)
                height = result.doubleValue();
        }
        return true;
    }
    public String toString(){
        return label+": x="+x+", y="+y+", rx="+rx+", ry="+ry+", width="+width+", height="+height;
    }
}
