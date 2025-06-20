package cl.duoc.ms_sales_db.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "sales")
public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSales;

    @Column(name="sales_date")
    private String salesDate;

    @Column(name = "idusuario")
    private Long idUsuario;

    @Column(name = "idproduct")
    private Long idProduct;

    @Column(name = "estadoventa")
    private String estadoVenta;

    @Column(name = "metododeretiro")
    private String metodoDeRetiro;

    @Column(name = "valortotal")
    private Long valorTotal;

    public void setSalesDate(String salesDate) {
    this.salesDate = salesDate;
}

}
