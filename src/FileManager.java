package FileManagerApp;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
	private String currentDirectory;
	
	public FileManager(String initialDirectory) {
		this.currentDirectory = initialDirectory;
	}
	
	public List<FileItem> listFiles() {
		List<FileItem> fileItems = new ArrayList<>();
		File directory = new File(currentDirectory);
		
		if (directory.exists() && directory.isDirectory()) {
			File[] files = directory.listFiles();
			
			if (files != null) {
				for (File file : files) {
					fileItems.add(new FileItem(file.getName(), file.getAbsolutePath(), file.isDirectory()));
				}
			}
		}
		
		return fileItems;
	}
	
	public boolean changeDirectory(String newDirectory) {
		File directory = new FIle(newDirectory);
		
		if (directory.exists() && directory.isDirectory()) {
			currentDirectory = newDirectory;
			return true;
		}
		
		return false;
	}
}
