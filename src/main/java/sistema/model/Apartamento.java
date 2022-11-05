package sistema.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Apartamento {
    private int id_apartamento;
    private int nro_porta, qtd_quarto;
    private String tipo;


}
