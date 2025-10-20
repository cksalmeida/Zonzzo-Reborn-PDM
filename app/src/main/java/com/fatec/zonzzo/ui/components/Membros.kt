package com.fatec.zonzzo.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fatec.zonzzo.model.Membros

@Composable
fun MembroItem(
    membro: Membros,
    tamanhoNome: TextUnit = 18.sp,
    tamanhoFuncao: TextUnit = 12.sp,
) {
    Card(
        modifier = Modifier.width(175.dp).height(100.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFBBDEFB)
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        shape = MaterialTheme.shapes.medium
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = membro.nome,
                fontSize = tamanhoNome,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSurface
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = membro.funcao,
                fontSize = tamanhoFuncao,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}