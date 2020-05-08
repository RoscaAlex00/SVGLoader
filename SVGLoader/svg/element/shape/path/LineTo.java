package svg.element.shape.path;

import svg.SVGParser;
import svg.element.Element;

public class LineTo extends PathOp {
    private double x1;
    private double y1;

    protected String label = "L";
    protected boolean absolute;

    public LineTo(String label) {
        super(label);
    }

    @Override
    public Element newInstance() {
        return null;
    }

    public boolean load(String expr) {
        if (expr.contains("L")) {
            int start = expr.indexOf("L") + 1;
            int end = expr.substring(start).indexOf(" ")+start;
            int middle = expr.substring(start, end).indexOf(",")+start;
            final Double result = Double.valueOf(expr.substring(start, middle));
            if (result != null)
                x1 = result;
            final Double result1 = Double.valueOf(expr.substring(middle + 1, end));
            if (result1 != null) {
                y1 = result1;
            }
        }
        return false;
    }
    public String toString(){
        return label + ": [ x1 =" + x1 + ", y1=" + y1 + "]";
    }
}