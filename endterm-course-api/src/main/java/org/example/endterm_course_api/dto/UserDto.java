package org.example.endterm_course_api.dto;

public class UserDto {

    private int id;
    private String username;
    private String role;

    public UserDto(int id, String username, String role) {
        this.id = id;
        this.username = username;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }
}
