package net.ilyasse.Framework;

public class Image {
    int data [];
    public Image(){
        data=new int[100];
    }
    public int[] getData(){
        return data;
    }
    public void setData(int data[]){
        this.data=data;
    }
}
