package svg.element.shape.path;

import svg.SVGParser;
import svg.element.Element;
import svg.element.shape.path.PathOp;

public class QuadTo extends PathOp {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    protected String label = "QuadTo";
    protected boolean absolute;

    public QuadTo(String label) {
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

        return false;
    }
}