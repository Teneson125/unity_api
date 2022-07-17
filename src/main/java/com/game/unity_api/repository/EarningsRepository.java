package com.game.unity_api.repository;

import com.game.unity_api.entity.Earnings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EarningsRepository extends JpaRepository<Earnings,Long> {
}
