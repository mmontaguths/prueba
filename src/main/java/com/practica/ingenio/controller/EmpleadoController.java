package com.practica.ingenio.controller;

import com.practica.ingenio.entity.Empleado;
import com.practica.ingenio.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
@RequestMapping("/productos")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoservice;

    @GetMapping // con get vamos a devolver un listado de todos los empleados
    public List<Empleado> listar()
    {
        return empleadoservice.listar();
    }
    @PostMapping
    public Empleado insertar (@RequestBody Empleado emp)
    {
     return empleadoservice.insertar(emp);
    }

    @PutMapping
    public Empleado actualizar (@RequestBody Empleado emp)
    {
        return empleadoservice.actualizar(emp);
    }

    @DeleteMapping
    public void eliminar (@RequestBody Empleado emp)
    {
        empleadoservice.eliminar(emp);
    }


}
