package pl.krzysztof.hotelsapplication.remote.rest.response;

import java.util.List;

public class hotelsDto {
    private List<hotelDto> hotels;

    public hotelsDto() {
    }

    public hotelsDto(List<hotelDto> hotels) {
        this.hotels = hotels;
    }

    public List<hotelDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<hotelDto> hotels) {
        this.hotels = hotels;
    }
}
