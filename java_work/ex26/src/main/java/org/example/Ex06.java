package org.example;

interface Viewable{
    @Deprecated
    public void showIt(String str);
}

class Viewer implements Viewable{


    @Override
    @SuppressWarnings("deprecation")
    public void showIt(String str) {
        System.out.println("str ="+ str);

    }
}


public class Ex06 {
    public static void main(String[] args) {
        Viewer viewer = new Viewer();
        viewer.showIt("경고 문구 나올까...");

        for (int i = 0; i < ; i++) {
            
        }
    }
}
