package sample.springweek.week02;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MemoRepository extends JpaRepository<Memo, Long> {

    List<Memo> findByContentContainingOrderByModifiedAt(String keyword);
}
