package parking.accounting.repo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import parking.accounting.entities.AccountEntity;

public interface AccountRepository extends MongoRepository<AccountEntity, String>,
AccountAggregationRepository {
List<AccountEntity> findByExpirationGreaterThanAndRevokedIsFalse(LocalDateTime ldt);
@Query(value="{roles:{$elemMatch:{$eq: ?0}}}",fields = "{email: 1}")
List<AccountEntity> findByRole(String role);
}
