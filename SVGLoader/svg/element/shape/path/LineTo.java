package svg.element.shape.path;

import svg.SVGParser;
import svg.element.Element;

public class LineTo extends PathOp {
    private double x1;
    private double y1;

    protected String label = "LineTo";
    protected boolean absolute;

    public LineTo(String label) {
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

        return false;
    }
}