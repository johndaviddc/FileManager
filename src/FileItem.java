package FileManagerApp;

import java.io.File;

public class FileItem {
	private String name;
	private String path;
	private boolean isDirectory;
	
	public FileItem(String name, String path, boolean isDirectory) {
		this.name = name;
		this.path = path;
		this.isDirectory = isDirectory;
	}
	
	// Getters and setters
	
	public String getName() {
		return name;
	}
	
	public String getPath() {
		return path;
	}
	
	public boolean isDirectory() {
		return isDirectory;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
