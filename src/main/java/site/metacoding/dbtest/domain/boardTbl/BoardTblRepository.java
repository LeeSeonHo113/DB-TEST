package site.metacoding.dbtest.domain.boardTbl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BoardTblRepository extends JpaRepository<BoardTbl, Integer> {
    @Query(value = "SELECT * FROM boardTbl WHERE title like %:keyword%", nativeQuery = true)
    List<BoardTbl> mSearch(String keyword);
}