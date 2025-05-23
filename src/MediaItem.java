public interface MediaItem {
    static String LIBRARY_NAME = "Digital Commons Library";

    String getTitle();
    int getYear();
    void getDisplayString(){
        System.out.println(getTitle());

    };
}
