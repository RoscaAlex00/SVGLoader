package svg.element.shape.path;

import svg.SVGParser;
import svg.element.Element;
import svg.element.shape.path.PathOp;


public class MoveTo extends PathOp {
    private double x;
    private double y;

    protected String label = "M";
    protected boolean absolute;

    public MoveTo(String label) {
        super(label);
    }

    @Override
    public Element newInstance() {
        return null;
    }

    public boolean load(String expr) {
        if (expr.contains(" d=")) {
            final Double result = SVGParser.extractDouble(expr, "M")[0];
            if (result != null)
                x = result;
        }
        if (expr.contains(" y=")) {
            final Double result = SVGParser.extractDouble(expr, " y=")[0];
            if (result != null)
                y = result;
        }

        return false;
    }
    public String toString(){
        return label + ": [ x =" + x + ", y=" + y +" ]";
    }
}