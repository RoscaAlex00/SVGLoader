package svg.element.shape.path;

import svg.element.BaseElement;
import svg.element.shape.Shapes;


public abstract class PathOp extends Shapes {
    protected char label;
    protected boolean absolute;

    public PathOp(String label) {
        super(label);
    }
}