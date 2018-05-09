package com.example.songsapi.models;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
@Entity @Table(name = "SONGS")
public class Song {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "ARTIST")
    private String artist;

    @Column(name = "LENGTH")
    private Long length;

}