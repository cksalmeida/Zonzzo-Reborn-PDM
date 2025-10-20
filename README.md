# Zonzzo Reborn - PDM

## 📱 Sobre o Projeto

Zonzzo Reborn é um projeto que consiste em uma única tela em Kotlin e Jetpack Compose que funcione como a landing page do projeto integrador. A atividade foca em aplicar os conceitos de POO e os **fundamentos** de Compose, incluindo LazyColumn.

## 🚀 Tecnologias Utilizadas

- **Kotlin** - Linguagem de programação principal (100%)
- **Jetpack Compose** - Framework moderno para criação de UI declarativa
- **Material Design 3** - Sistema de design para interfaces consistentes
- **Coil** - Carregamento de imagens
- **Android Architecture Components**
  - Lifecycle
  - ViewModel
  - Activity Compose

## 📋 Pré-requisitos

- Android Studio Hedgehog ou superior
- JDK 11
- Android SDK 24 (mínimo) até 36 (target)
- Gradle 8.x

## 🔧 Configuração do Projeto

### Especificações Técnicas

```gradle
- compileSdk: 36
- minSdk: 24
- targetSdk: 36
- versionCode: 1
- versionName: "1.0"
- Kotlin JVM Target: 11
```

### Dependências Principais

- `androidx.core:core-ktx`
- `androidx.lifecycle:lifecycle-runtime-ktx`
- `androidx.activity:activity-compose`
- `androidx.compose.material3`
- `io.coil-kt:coil-compose:2.5.0`

## 🛠️ Instalação

1. Clone o repositório:
```bash
git clone https://github.com/cksalmeida/Zonzzo-Reborn-PDM.git
```

2. Abra o projeto no Android Studio

3. Sincronize as dependências do Gradle:
```bash
./gradlew build
```

4. Execute o aplicativo em um emulador ou dispositivo físico

## 🏗️ Estrutura do Projeto

```
Zonzzo-Reborn-PDM/
├── app/
│   ├── src/
│   │   ├── main/
│   │   └── test/
│   └── build.gradle.kts
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

## 📝 Licença

Este projeto foi desenvolvido para fins acadêmicos na FATEC de Registro.

## 👨‍💻 Autor

**Davi Mathais de Almeida** - [@cksalmeida](https://github.com/cksalmeida)
