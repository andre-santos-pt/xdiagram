package org.eclipselabs.xdiagram.provider.internal;

import java.awt.geom.Dimension2D;

public class DimensionFactor extends Dimension2D {
	
	public double width;
    public double height;

	public DimensionFactor() {
		this(0, 0);
	}
	
	public DimensionFactor(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getHeight() {
		return this.height;
	}

	@Override
	public double getWidth() {
		return this.width;
	}

	@Override
	public void setSize(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public DimensionFactor getSize() {
		return new DimensionFactor(width, height);
	}
	
    public boolean equals(Object obj) {
        if (obj instanceof DimensionFactor) {
        	DimensionFactor d = (DimensionFactor)obj;
            return (width == d.width) && (height == d.height);
        }
        return false;
    }
    
    
    public int hashCode() {
    	return super.hashCode();
    }

    public String toString() {
    	return getClass().getName() + "[width=" + width + ",height=" + height + "]";
    }

}
