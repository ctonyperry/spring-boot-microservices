package com.example.songsapi.repositories;

import com.example.songsapi.models.Song;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SongRepository extends CrudRepository<Song, Long> {

}