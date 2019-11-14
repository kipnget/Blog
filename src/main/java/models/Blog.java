package models;

import java.util.ArrayList;
import java.time.LocalDateTime;

public class Blog {
    private LocalDateTime createdAt;
    private String description;
    private String title;
    private static ArrayList<Blog> BlogInstances = new ArrayList<>();
    private int id;


    public Blog(String description,String title){
        this.description = description;
        this.title = title;
        this.createdAt = LocalDateTime.now();
        BlogInstances.add(this);
        this.id = BlogInstances.size();
    }

    public String getDescription() {

        return description;

    }

    public static ArrayList<Blog> getAll(){

        return BlogInstances;
    }
    public static void clearAllBlogs(){
        BlogInstances.clear();
    }
    public String getTitle(){
        return this.title;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public int getId() {
        return id;
    }
    //finding blog by ID
    public static Blog fetchById(int id){
        return BlogInstances.get(id-1);
    }
    //delete blog by id
    public void deleteById(){
        BlogInstances.remove(id-1);

    }
    //update blog by id
    public void updateById(String description){
        this.description=description;
    }
}
