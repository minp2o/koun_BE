package com.example.koun.repository;

import com.example.koun.domain.Item;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item,Long> {
    // 이름으로 아이템 검색
    Optional<Item> findByItemName(String itemName);
}
