package roomescape.reservation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    Reservation save(ReservationRequest request);

    List<Reservation> findByDateAndThemeId(String date, Long themeId);

    List<Reservation> findByName(String name);

    List<Reservation> findByMemberId(Long id);

    Optional<Reservation> findByDateAndThemeIdAndTimeId(String date, Long themeId, Long timeId);
}
