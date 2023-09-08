package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.ParkingSpotModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VagaRepository extends JpaRepository<ParkingSpotModels, UUID> {

    boolean existsByCarroPlaca(String carroPlaca);

    boolean existsByNumeroVaga(String numeroVaga);

    boolean existsByApartamentoAndBloco(String apartamento, String bloco);
}
