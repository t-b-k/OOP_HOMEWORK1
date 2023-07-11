package OOP_HOMEWORK4_Task2;

//Cоздать класс FileRepository (аналог кастомной БД) который будет уметь создавать базу данных в виде файла
// с расширением .txt и именем по имени ЛЮБОГО сохраняемого класса. Должны быть методы получения объекта по id,
// удаления объекта по id, обновления по id, сохранения нового объекта в БД.
//Формат сдачи: ссылка на гитхаб проект

import java.io.*;
import java.util.*;

public class FileRepository<ID_TYPE, OBJ_TYPE> {
    private String classNameOfStoredObjects;
    private File txtFileName;
    private FileWriter fw;
    private FileReader fr;


    public FileRepository<OBJ_TYPE> () throws IOException {
        this.classNameOfStoredObjects = OBJ_TYPE.getClass().toString();
        this.txtFileName = new File(classNameOfStoredObjects.concat(".txt"));
        this.fw = new FileWriter(txtFileName,false);
        this.fr = new FileReader(txtFileName);
    }
//    public FileRepository (String className) {
//        this.classNameOfStoredObjects = className;
//        this.txtFile = new File(classNameOfStoredObjects.concat(".txt"));
//    }
    public File getTxtFileName() {
        return this.txtFileName;
    }
    public String getClassOfStoredObjects() {
        return this.classNameOfStoredObjects;
    }
    public boolean putObjectToFileRepository (OBJ_TYPE obj) throws IOException {
        return addString(obj.toString());
    }

    public boolean addString(String line) throws IOException {
        int i = 0;
        boolean result;
        if (line == null || line == "") {
            result = false;
        } else {
            fw.write(line);
            result = true;
        }
        return result;
    }
    public boolean writeListOfStrings(ArrayList<String> list) throws IOException {
            int i = 0;
            boolean result;
            if (list == null || list.size() == 0) {
                result = false;
            } else {
               for (i = 0; i < list.size(); i++) {
                  this.fw.write(list.get(i));
               }
               result = true;
            }
            return result;
    }
    public ArrayList<String> getListOfAllStrings () throws FileNotFoundException {
        ArrayList<String> lines = new ArrayList<>();
        try {
            FileReader fr = new FileReader(txtFileName);
            Scanner scanner = new Scanner(fr);
            int i = 0;
            while (scanner.hasNext()) {
                lines.add(scanner.next());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }
    public String findStringById (ArrayList<String> list, ID_TYPE id) {
        String result = "";
        String idAsString = id.toString();
        for (String elem : list) {
            if (elem.startsWith(idAsString)) result = elem;
        }
        return result;
    }
//    public OBJ_TYPE getObjectFromListById (ID_TYPE id, ArrayList<OBJ_TYPE> list) {
//        return list.get()
//    }


}
