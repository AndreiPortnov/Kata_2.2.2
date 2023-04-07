package web.model;

import java.util.Objects;

public class Car {

    private Long id;
    private String model;
    private int releaseYear;

     public Car() {
    }

    public Car(Long id, String model, int releaseYear) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return releaseYear == car.releaseYear && Objects.equals(id, car.id) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, releaseYear);
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
