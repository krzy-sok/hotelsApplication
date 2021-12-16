package pl.krzysztof.hotelsapplication.remote.rest.response;

import java.util.List;

public class hotelDto {
    private Integer id;
    private String name;
    private List<roomDto> rooms;

    public hotelDto() {
    }

    public hotelDto(Integer id, String name, List<roomDto> rooms) {
        this.id = id;
        this.name = name;
        this.rooms = rooms;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<roomDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<roomDto> rooms) {
        this.rooms = rooms;
    }
}
