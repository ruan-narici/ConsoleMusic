package br.com.ruannarici.consolemusic.repository;

import br.com.ruannarici.consolemusic.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {

    @Query("SELECT a FROM artists a WHERE a.name ILIKE %:text%")
    Optional<Artist> searchByName(String text);

//    Optional<Artist> findByNameContainingIgnoreCase(String name);
}
