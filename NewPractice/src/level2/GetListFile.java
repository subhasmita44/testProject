package level2;

import java.io.File;

public class GetListFile {

	public static void main(String[] args) {
		 File dirName = new File("C:\\Users\\chandan.jena\\Desktop\\Documents");
	      File[] listFiles = dirName.listFiles();
	     
	          for (int i = 0; i < listFiles.length; i++)
	          {
	            if (listFiles[i].isFile())
	            {
	              System.out.println("File: " + listFiles[i].getName());
	            }
	            else if (listFiles[i].isDirectory())
	            {
	                System.out.println("Directory: " + listFiles[i].getName());
	            }
	      }

	}

}
