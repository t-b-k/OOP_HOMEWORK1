package OOP_HOMEWORK4;

import org.w3c.dom.ls.LSOutput;

import java.io.File;

public class FileRepository<IND_TYPE, OBJ_TYPE> {
    private File txtFile;
    private String classNameOfStoredObjects;

    public FileRepository (String className) {
        this.classNameOfStoredObjects = className;
        this.txtFile = new File(classNameOfStoredObjects.concat(".txt"));
    }
    public File getTxtFile() {
        return this.txtFile;
    }
    public String getClassOfStoredObjects() {
        return this.classNameOfStoredObjects;
    }



}
