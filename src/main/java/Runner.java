import db.DBFolder;
import db.DBHelper;
import models.Extension;
import models.File;
import models.Folder;

public class Runner {

    public static void main(String[] args) { // Universal method to allow it to function as a console

        Folder folder1 = new Folder("Homework");
        DBHelper.save(folder1);
        Folder folder2 = new Folder("Music");
        DBHelper.save(folder2);

        File file1 = new File("My_CV",100,folder1,Extension.TXT);
        DBHelper.save(file1);
        File file3 = new File("My_CV2",101,folder1,Extension.TXT);
        DBHelper.save(file3);
        File file2 = new File("My_Singing",1000,folder2,Extension.MP3);
        DBHelper.save(file2);

        DBFolder.getFilesInFolder(folder1);






    }


}
