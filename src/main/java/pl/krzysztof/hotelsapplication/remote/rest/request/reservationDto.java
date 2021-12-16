package pl.krzysztof.hotelsapplication.remote.rest.request;

import java.util.List;

public class reservationDto {
    private List<roomsReservationDto> rooms;
    private personReservationDto person;

    public reservationDto() {
    }

    public reservationDto(List<roomsReservationDto> rooms, personReservationDto person) {
        this.rooms = rooms;
        this.person = person;
    }

    public List<roomsReservationDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<roomsReservationDto> rooms) {
        this.rooms = rooms;
    }

    public personReservationDto getPerson() {
        return person;
    }

    public void setPerson(personReservationDto person) {
        this.person = person;
    }
}
