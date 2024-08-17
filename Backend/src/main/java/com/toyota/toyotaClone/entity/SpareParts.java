package com.toyota.toyotaClone.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Spare_Parts")
public class SpareParts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sparePartId;
    private String sparePartName;
    @NotNull
    private String model;
    @NotNull
    private float price;


}
