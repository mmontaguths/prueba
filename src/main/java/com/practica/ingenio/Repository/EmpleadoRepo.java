package com.practica.ingenio.Repository;

import com.practica.ingenio.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepo extends JpaRepository <Empleado, Integer> {


}
