package org.eclipselabs.xdiagram.provider;

import java.awt.Dimension;
import java.io.IOException;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

import org.eclipse.graphiti.ui.platform.AbstractImageProvider;
import org.osgi.framework.Bundle;
	 
	public class ImageProvider extends AbstractImageProvider {
		
		
		public static WeakList INSTANCES = new WeakList();	
		
		
		public ImageProvider() {
			INSTANCES.add(this);
		}
		
		
		public static Dimension addImageFile(String imageId, String imageFilePath, Bundle bundle) throws IOException{

			ImageInputStream in = ImageIO.createImageInputStream(
					bundle.getResource(imageFilePath).openStream());
			try {
				final Iterator<ImageReader> readers = ImageIO.getImageReaders(in);
				if (readers.hasNext()) {
					ImageReader reader = readers.next();
					try {
						reader.setInput(in);
						
						for (int i=0; i<INSTANCES.size(); i++){
							String value = ((ImageProvider)INSTANCES.get(i)).getImageFilePath(imageId);
							if (value==null || value.length()==0)
								//return null;
							//else
								((ImageProvider)INSTANCES.get(i)).addImageFilePath(imageId, 
										bundle.getResource(imageFilePath).toString().replace("\\", "/"));				
						}
						
						return new Dimension(reader.getWidth(0), reader.getHeight(0));
					} finally {
						reader.dispose();
					}
				}
			} finally {
				if (in != null) in.close();
			}
			
			return null;
			
		}
		
	 
	    @Override
	    protected void addAvailableImages() {
	        // register the path for each image identifier
	        //addImageFilePath("pic1", "icons/andro.png");
	    }
	    
	    
	}