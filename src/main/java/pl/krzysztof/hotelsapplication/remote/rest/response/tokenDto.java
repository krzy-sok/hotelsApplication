package pl.krzysztof.hotelsapplication.remote.rest.response;

public class tokenDto {
    private String token;

    public tokenDto() {
    }

    public tokenDto(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
