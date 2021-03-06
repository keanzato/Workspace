package cl.curso.java.Login_app.conexion;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;

public class WebCamServices {

	public static void tomarFoto() throws IOException
	{
		Webcam webcam = Webcam.getDefault();
		webcam.setViewSize(new Dimension(640, 480));
        webcam.open();
        ImageIO.write(webcam.getImage(), "PNG",
        		new File("/Users/Kevin Zambrano/Pictures/"+new Date().getTime()+".png"));
        webcam.close();
        
	}
	
	public static void tomarFoto2(int cantidadFotos) throws IOException
	{
		Webcam webcam = Webcam.getDefault();
		webcam.setViewSize(new Dimension(640, 480));
        
		webcam.open();
        for (int i = 0; i < cantidadFotos; i++) {
        	
        	 ImageIO.write(webcam.getImage(), "PNG",
             		new File("/Users/Kevin Zambrano/Pictures/"+new Date().getTime()+".png"));
             
		}
        webcam.close();
        
	}
	
}
