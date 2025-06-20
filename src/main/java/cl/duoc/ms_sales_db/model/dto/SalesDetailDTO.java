package cl.duoc.ms_sales_db.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SalesDetailDTO {

    private Long idSalesDetail;
    private UsuarioDTO usuario;
    private ProductDTO product;
    private Long cantidad;
}
