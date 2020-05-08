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
        if (expr.contains("M")) {
            int start = expr.indexOf("M") + 1;
            int end = expr.substring(start).indexOf(" ")+start;
            int middle = expr.substring(start, end).indexOf(",")+start;
            final Double result = Double.valueOf(expr.substring(start, middle));
            if (result != null)
                x = result;
            final Double result1 = Double.valueOf(expr.substring(middle + 1, end));
            if (result1 != null) {
                y = result;
            }
        }
        return false;
    }
    public String toString(){
        return label + ": [ x =" + x + ", y=" + y +" ]";
    }
}