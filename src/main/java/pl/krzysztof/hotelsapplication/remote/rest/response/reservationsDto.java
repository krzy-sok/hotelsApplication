package pl.krzysztof.hotelsapplication.remote.rest.response;

import pl.krzysztof.hotelsapplication.domain.models.reservationStatus;
import pl.krzysztof.hotelsapplication.remote.rest.request.reservationDto;

public class reservationsDto {
    private Integer id;
    private reservationStatus status;
    private reservationDto reservation;

    public reservationsDto() {
    }

    public reservationsDto(Integer id, reservationStatus status, reservationDto reservation) {
        this.id = id;
        this.status = status;
        this.reservation = reservation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public reservationStatus getStatus() {
        return status;
    }

    public void setStatus(reservationStatus status) {
        this.status = status;
    }

    public reservationDto getReservation() {
        return reservation;
    }

    public void setReservation(reservationDto reservation) {
        this.reservation = reservation;
    }
}
