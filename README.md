# 🏦 SGRAdmin — Administración de una Sociedad de Garantía Recíproca

[🇦🇷 Español](#-español) · [🇬🇧 English](#-english)

![Java](https://img.shields.io/badge/Java-8-orange?logo=openjdk)
![Swing](https://img.shields.io/badge/UI-Java%20Swing-blue)
![Maven](https://img.shields.io/badge/Build-Maven-C71A36?logo=apachemaven)
![UADE](https://img.shields.io/badge/UADE-Trabajo%20pr%C3%A1ctico-lightgrey)

---

## 🇦🇷 Español

Aplicación de escritorio para administrar una **Sociedad de Garantía Recíproca (SGR)**: socios, documentación, líneas de crédito y operaciones. Es el trabajo práctico obligatorio de la materia *Introducción a la Orientación a Objetos* de la **UADE** y lo hicimos en equipo.

### Funcionalidades
- **Socios partícipes y protectores**, accionistas, aportes y estado de la documentación.
- **Líneas de crédito** por socio.
- **Operaciones**: cheques, préstamos y cuenta corriente, con sus comisiones y estados.
- **Usuarios** con registro e historial de acciones.
- **Interfaz gráfica** en Java Swing: menú principal, administración de socios y registro de log.

### Arquitectura
Patrón **MVC**:
```
src/main/java/edu/uade/ioo
├── Controller/        # Controladores (ControladorSGR, ControladorRegistro)
├── vista/             # Formularios Swing
├── socio/dominio/     # Socios, accionistas, documentación
├── operacion/dominio/ # Operaciones, cheques, préstamos, comisiones
├── lineaDeCredito/    # Líneas de crédito
├── usuario/dominio/   # Usuarios e historial
└── utils/             # Modelos de tabla para Swing
```

### Cómo ejecutarlo
Abrí el proyecto como proyecto Maven (IntelliJ, Eclipse o NetBeans) y ejecutá la clase `edu.uade.ioo.testing.testing`.

### Equipo
- Sebastián Ariel Vera ([@sveradev](https://github.com/sveradev))
- Julián Vera ([@juliannvera](https://github.com/juliannvera))

---

## 🇬🇧 English

Desktop application to manage a **Reciprocal Guarantee Company** (*Sociedad de Garantía Recíproca*, an Argentine type of company that backs SME credit): members, documentation, credit lines and operations. It was the final team project for the *Introduction to Object-Oriented Programming* course at **UADE** (Buenos Aires).

### Features
- **Participant and protector members**, shareholders, contributions and documentation status.
- **Credit lines** per member.
- **Operations**: cheques, loans and current accounts, with fees and statuses.
- **Users** with registration and an action log.
- **Java Swing GUI**: main menu, member management and log viewer.

### Architecture
**MVC** pattern (see the structure in the Spanish section).

### Running it
Open it as a Maven project in your IDE and run `edu.uade.ioo.testing.testing`.

---

👤 **Sebastián Ariel Vera** · [LinkedIn](https://www.linkedin.com/in/sebastian-ariel-vera-9b240735)
