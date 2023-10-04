package org.tech.repository;

import org.tech.entity.NewMobile;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MobileRepo implements PanacheRepository<NewMobile> {

}