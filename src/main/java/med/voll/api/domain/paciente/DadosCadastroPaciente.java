package med.voll.api.domain.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroPaciente(
        @NotBlank(message = "O nome do paciente é obrigatório")
        String nome,

        @NotBlank(message = "O e-mail do paciente é obrigatório")
        @Email(message = "Formato do e-mail do paciente está inválido")
        String email,

        @NotBlank(message = "O telefone do paciente é obrigatório")
        String telefone,

        @NotBlank(message = "O CPF do paciente é obrigatório")
        @Pattern(regexp = "\\d{11}", message = "Formato do CPF do paciente está inválido")
        String cpf,

        @NotNull(message = "Preencha os campos obrigatórios do endereço")
        @Valid
        DadosEndereco endereco
) {
}
