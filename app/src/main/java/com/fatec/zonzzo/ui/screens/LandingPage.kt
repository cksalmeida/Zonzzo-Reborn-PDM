package com.fatec.zonzzo.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.fatec.zonzzo.model.Membros
import com.fatec.zonzzo.model.ODS
import com.fatec.zonzzo.model.Paragrafo
import com.fatec.zonzzo.ui.components.MembroItem
import com.fatec.zonzzo.ui.components.ODSItem
import com.fatec.zonzzo.ui.components.SessaoItem
import com.fatec.zonzzo.ui.components.Titulo

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun TelaLadingPage() {

    val primeiraSessao = Paragrafo(
        paragrafo = "Zonzzo é uma plataforma de rastreamento de sono e alarme inteligente que tem como objetivo ajudar a promover a saúde e o bem-estar dos seus usuários."
    )

    val odsList = listOf(
        ODS(3, "Saúde e Bem-Estar")
    )

    val membros = listOf(
        Membros("Davi Mathais", "Dev Full-Stack"),
        Membros("Luiz Capote", "Dev Full-Stack")
    )

    LazyColumn(modifier = Modifier.padding(16.dp)) {

        item {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                AsyncImage(
                    model = "https://static.vecteezy.com/ti/vetor-gratis/p1/10807329-sono-de-galinha-bonito-no-planeta-saturno-com-belo-anel-animal-cartoon-isolado-estilo-plano-adesivo-ilustracao-de-icone-de-design-da-web-personagem-de-mascote-de-logotipo-de-premium-vetor.jpg",
                    contentDescription = "Logo",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape)
                )
            }
        }

        item {
            SessaoItem(sessao = primeiraSessao)
        }

        item {
            Titulo(titulo = "Objetivos de Desenvolvimento Sustentável")
        }

        item { Spacer(modifier = Modifier.height(16.dp)) }

        items(odsList) { ods ->
            ODSItem(ods = ods)
            Spacer(modifier = Modifier.height(16.dp))
        }

        item { Spacer(modifier = Modifier.height(16.dp)) }

        item {
            Titulo(titulo = "Desenvolvedores")
        }

        item { Spacer(modifier = Modifier.height(16.dp)) }

        item {
            FlowRow(
                horizontalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterHorizontally),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                membros.forEach { membro ->
                    MembroItem(membro = membro)
                }
            }
        }
    }}