package web.model;

public class CarModel {

    private Long id;
    private String model;
    private int releaseYear;

     public CarModel() {
    }

    public CarModel(Long id, String model, int releaseYear) {
        this.id = id;
        this.model = model;
        this.releaseYear = releaseYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "CarModel{" +
               "id=" + id +
               ", model='" + model + '\'' +
               ", releaseYear=" + releaseYear +
               '}';
    }
}
