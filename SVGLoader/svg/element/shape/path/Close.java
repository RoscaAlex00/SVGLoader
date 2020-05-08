package svg.element.shape.path;

import svg.element.Element;

public class Close extends PathOp {
    protected String label = "Close";
    protected boolean absolute;

    public Close(String label) {
        super(label);
    }

    @Override
    public Element newInstance() {
        return null;
    }

    @Override
    public boolean load(String expr) {
        return false;
    }
}