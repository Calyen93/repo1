package com.example.repo1.models;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
public class Cars {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private String modelName;

    @NotNull
    private String serialNumber;

    @Nullable
    private double currentPrice;

}
