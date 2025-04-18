package com.maua.yegestaodesaude.modules.imc.get_imc_by_date.app;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetImcByDateViewmodel {
    private Long id;
    private Double weight;
    private Double height;
    private String imc;
    private String level;
    private String date;
}
