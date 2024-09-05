package br.com.ruannarici.consolemusic.repository;

import br.com.ruannarici.consolemusic.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {

}
