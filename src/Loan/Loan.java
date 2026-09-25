package Loan;

import lombok.*;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Loan {

    private Long id_loan;
    private Long id_client;
    private Long id_employed;
    private Long id_asset;
    private Date date_begin;
    private Date date_scheduled;
    private Date date_end;
    private Date date_realDevolution;
    private String notes_return;
    private String notes_checkout;
    private String state_loan;


}
