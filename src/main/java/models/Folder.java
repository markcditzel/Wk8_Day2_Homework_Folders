package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {

    private int id;
    private String name;
    private Extension extension;
    private List<File> files;

    public Folder(){
    }

    public Folder(String name, Extension extension) {
        this.name = name;
        this.extension = extension;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")
    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Enumerated(value = EnumType.STRING)
    Extension getExtension() {
        return extension;
    }

    public void setExtension(Extension extension) {
        this.extension = extension;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}
