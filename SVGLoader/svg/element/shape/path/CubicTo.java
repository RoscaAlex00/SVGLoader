package svg.element.shape.path;

import svg.SVGParser;
import svg.element.Element;

public class CubicTo extends PathOp {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    protected String label = "CubicTo";
    protected boolean absolute;

    public CubicTo(String label) {
        super(label);
    }


    @Override
    public Element newInstance() {
        return null;
    }

    public boolean load(String expr) {
        if (expr.contains(" x1=")) {
            final Double result = SVGParser.extractDouble(expr, " x1=")[0];
            if (result != null)
                x1 = result;
        }
        if (expr.contains(" y1=")) {
            final Double result = SVGParser.extractDouble(expr, " y1=")[0];
            if (result != null)
                y1 = result;
        }
        if (expr.contains(" x2=")) {
            final Double result = SVGParser.extractDouble(expr, " x2=")[0];
            if (result != null)
                x2 = result;
        }
        if (expr.contains(" y2=")) {
            final Double result = SVGParser.extractDouble(expr, " y2=")[0];
            if (result != null)
                y2 = result;
        }

        if (expr.contains(" x3=")) {
            final Double result = SVGParser.extractDouble(expr, " x3=")[0];
            if (result != null)
                x3 = result;
        }

        if (expr.contains(" y3=")) {
            final Double result = SVGParser.extractDouble(expr, " y3=")[0];
            if (result != null)
                y3 = result;
        }
        return true;
    }
    public String toString(){
        return "["+label+": x1="+x1+", y1="+y1+", x2="+x2+", y2="+y2+", x3="+x3+", y3="+y3+"]";
    }
}
