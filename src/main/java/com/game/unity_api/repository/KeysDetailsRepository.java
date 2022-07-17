package com.game.unity_api.repository;

import com.game.unity_api.entity.KeysDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KeysDetailsRepository extends JpaRepository<KeysDetails,Long> {
}
