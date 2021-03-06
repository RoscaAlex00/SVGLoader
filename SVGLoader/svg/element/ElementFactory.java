package svg.element;

import svg.element.Element;
import svg.element.BaseElement;
import svg.element.shape.*;
import svg.element.shape.path.Path;

import java.util.ArrayList;
import java.util.List;

//-----------------------------------------------------------------------------

/**
 * Class for parsing SVG files.
 * @author M1v1savva
 */
public class ElementFactory 
{
	private List<Element> prototypes = new ArrayList<>();

	//-------------------------------------------------------------------------

	/** 
	 * Default constructor
	 */
	public ElementFactory() 
	{
		prototypes.add(new Circle("circle"));
		prototypes.add(new Ellipse("ellipse"));
		prototypes.add(new Rect("rect"));
		prototypes.add(new Line("line"));
		prototypes.add(new Polyline("polyline"));
		prototypes.add(new Polygon("polygon"));
		prototypes.add(new Path("path"));
	}

	//-------------------------------------------------------------------------

	/**
	 * Returns all Element prototypes
	 */
	public List<Element> prototypes()
	{
		return prototypes;
	}

	//-------------------------------------------------------------------------

	/**
	 * Determines the Element type depending on the passed label
	 * and returns the object of the corresponding class.
	 * @param label
	 */
	public Element makeElement(final String label) throws Exception {

		switch (label) 
		{
			case "circle"   : return new Circle(label);
			case "ellipse"  : return new Ellipse(label);
			case "rect"     : return new Rect(label);
			case "line"     : return new Line(label);
			case "polyline" : return new Polyline(label);
			case "polygon"  : return new Polygon(label);
			case "path"     : return new Path(label);
			default: throw new Exception("invalid argument");
		}

	}

	//-------------------------------------------------------------------------


}