package med.voll.api.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroMedico(
        @NotBlank(message = "O nome do profissional é obrigatório")
        String nome,

        @NotBlank(message = "O e-mail do profissional é obrigatório")
        @Email(message = "O e-mail do profissional foi escrita de maneira incorreta")
        String email,

        @NotBlank(message = "O CRM do profissional é obrigatório")
        @Pattern(regexp = "\\d{4,6}", message = "O CRM do profissional foi digitado de forma errada.")
        String crm,

        @NotBlank(message = "O telefone do profissional é obrigatório")
        String telefone,

        @NotNull(message = "A especialidade do profissional é obrigatório")
        Especialidade especialidade,

        @NotNull(message = "É necessário preencher os campos obrigatórios do endereço")
        @Valid
        DadosEndereco endereco) {
}
