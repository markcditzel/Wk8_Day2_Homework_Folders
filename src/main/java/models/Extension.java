package models;
// this is to enhance the File class - provides a dropdown of file extensions (.jpeg, .txt etc)
public enum Extension {
    TXT("txt"),
    JPEG("jpeg"),
    MP3("mp3"),
    MP4("mp4");

    private String extName;

    Extension(String extName){
        this.extName = extName;
    }

    public String getExtName(){
        return extName;
    }
}
