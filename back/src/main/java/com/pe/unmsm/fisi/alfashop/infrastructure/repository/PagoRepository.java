package com.pe.unmsm.fisi.alfashop.infrastructure.repository;

import com.pe.unmsm.fisi.alfashop.model.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PagoRepository extends JpaRepository<Pago,Long> {
    List<Pago> findPagosByPedido_IdPedido (Integer idPedido);
}
