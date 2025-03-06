# Sistema de Avaliação de Estudantes

Este é um projeto simples em Java, utilizando o paradigma de Programação Orientada a Objetos (POO), para calcular a nota final de um estudante e verificar se ele foi aprovado ou reprovado.

## 📌 Descrição

O sistema solicita o nome do estudante e suas notas de três trimestres. Com base nessas informações, ele calcula a nota final e informa se o aluno foi aprovado ou reprovado. Caso reprovado, também informa quantos pontos faltaram para a aprovação.

## 🛠 Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos (POO)

## 📂 Estrutura do Projeto

O projeto possui os seguintes arquivos Java:

- `Estudante.java` - Classe que representa um estudante e seus atributos.
- `Media.java` - Classe responsável por exibir os resultados.
- `Tela.java` - Classe principal que interage com o usuário.

## 🚀 Como Executar o Projeto

1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) instalado.
2. Clone este repositório:
   ```sh
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   ```
3. Acesse o diretório do projeto:
   ```sh
   cd nome-do-repositorio
   ```
4. Compile os arquivos Java:
   ```sh
   javac *.java
   ```
5. Execute o programa:
   ```sh
   java Tela
   ```

## 📌 Exemplo de Entrada e Saída

### Entrada:

```
Nome do Aluno(a): Walter
Nota do primeiro Trimestre: 20.0
Nota do segundo Trimestre: 15.0
Nota do terceiro Trimestre: 10.0
```

### Saída:

```
João
Nota Final = 45.00
Reprovado!
Faltaram 15.00 Pontos
```

---

