package models;

import javax.persistence.*;

@Entity
@Table(name = "files")
public class File {

    private int id;
    private String name;
    private double size;
    private Folder folder;
    private Extension extension;

    public File(){

    }

    public File(String name, double size, Folder folder, Extension extension){
        this.name = name;
        this.size = size;
        this.folder = folder;
        this.extension = extension;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "size")
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @ManyToOne // a folder can have many files, but a file can have only one folder
    @JoinColumn(name = "folder_id", nullable = false) // a file does have to be in a folder
    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }

    @Enumerated(value = EnumType.STRING)
    public Extension getExtension() {
        return extension;
    }

    public void setExtension(Extension extension) {
        this.extension = extension;
    }
}
