package br.com.mv.estagio.cubo.crudpaciente.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.mv.estagio.cubo.crudpaciente.enums.RoleEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "TB_ROLE")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@Column(nullable = false, length = 100)
	@Enumerated(EnumType.STRING)
	private RoleEnum descricao;
}
