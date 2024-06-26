package com.finki.wp.workoutapp.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String image;

    private String description;

    @ManyToOne
    private Category category;

    @ManyToMany
    private List<Repeats> repeats;

    @ManyToMany
    private List<Workouts> workouts;

    public Exercise() {

    }

    public Exercise(String name, String image, String description, Category category) {
        this.name = name;
        this.image = image;
        this.description = description;
        this.category = category;
    }

    public Exercise(String name, String image, String description, Category category, List<Repeats> repeats,
                    List<Workouts> workouts) {
        this.name = name;
        this.image = image;
        this.description = description;
        this.category = category;
        this.repeats = repeats;
        this.workouts = workouts;
    }
}
