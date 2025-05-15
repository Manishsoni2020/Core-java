package textFiles;

import java.io.File;

public class FolderAction {

	public static void createFolder(String folderPath) {
		File folder = new File(folderPath);
		if (!folder.exists()) {
			folder.mkdir();
			System.out.println("Folder created: " + folderPath);
		}
	}
	public static boolean checkFolder(String folderPath)
	{
		File folder=new File(folderPath);
		return folder.exists();
			
	}
	
	public static void renameFolder(String oldpath,String newPath)
	{
		File oldFolder=new File(oldpath);
		File newFolder=new File(newPath);
		if(oldFolder.exists())
		{
			oldFolder.renameTo(newFolder);
			System.out.println("Folder Rename to: "+newPath);
		}
		
	}
	public static void deleteFolder(String folderPath)
	{
		File folder=new File(folderPath);
		if(folder.exists())
		{
			for(File file:folder.listFiles())
			{
				file.delete();
			}
			folder.delete();
			System.out.println("Folder is deleted: "+folderPath);
		}
	}
	public static void main(String[] args) {
		String folderPath = "C:\\Users\\hp\\Desktop\\Core Java\\myFiles";
		String newFolderPath="C:\\Users\\hp\\Desktop\\Core Java\\myFiles1";
		
		createFolder(folderPath);
		
		System.out.println(checkFolder(folderPath));
		
		renameFolder(folderPath, newFolderPath);
		
		deleteFolder(newFolderPath);
	}
	
}
