package org.tech.repository;

import org.tech.entity.Aadhar;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AadharRepo implements PanacheRepository<Aadhar> {

}
