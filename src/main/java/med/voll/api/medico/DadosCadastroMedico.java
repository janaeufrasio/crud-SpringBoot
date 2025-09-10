package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(

        //anotações bean validation
        @NotBlank
        String nome,
        @NotBlank //só para campo String
        @Email
        String email,

       @NotBlank
        String telefone,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}") //padrão do formato
        String crm,
        @NotNull
        Especialidade especialidade, //campo enum
        @NotNull
        @Valid //valida outro DTO dentro de um DTO
        DadosEndereco endereco) {
}
