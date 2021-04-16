package com.cda.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JoueurDto {
	private int idJoueur;
	private String nom;
	private String prenom;
	private String postePrefere;
	private RoleDto role;
	private StatistiqueDto statistique;
}