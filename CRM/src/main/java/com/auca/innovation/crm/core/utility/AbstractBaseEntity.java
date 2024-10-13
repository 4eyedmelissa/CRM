package com.auca.innovation.crm.core.utility;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
public abstract class AbstractBaseEntity {

    @Id
    @GenericGenerator(name="UUID" , strategy = "org.hibernate.id.UUIDGenerate")
    private UUID id;
    @Column(name="state" , nullable = false)
    @Enumerated (EnumType.STRING)
    private EDomainState state;
    @Column(name="createdAt", nullable = false)
    private LocalDateTime createdAt;
    @Column(name="updatedAt", nullable= false)
    private LocalDateTime updatedAt;



}
