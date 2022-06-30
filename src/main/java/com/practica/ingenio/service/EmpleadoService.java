package com.practica.ingenio.service;


import com.practica.ingenio.Repository.EmpleadoRepo;
import com.practica.ingenio.entity.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {

@Autowired
private EmpleadoRepo empleadoRepo;  //es como importar la clase como haciamos con new

      public Empleado insertar(Empleado emp)
      {
       return empleadoRepo.save(emp);
      }

    public Empleado actualizar(Empleado emp)
    {
        return empleadoRepo.save(emp);
    }
    public List<Empleado> listar()
    {
        return empleadoRepo.findAll();
    }
    public void eliminar(Empleado emp) {
        empleadoRepo.delete(emp);
    }

}
