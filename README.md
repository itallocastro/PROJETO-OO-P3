# Projeto-Refatorado
Projeto de refatoramento da matéria de projeto de software

### 1° Problema:
- Duas classes, ListaMetas e ListaTarefas no pacote 'módulos', apresentam código com muita semelhança,desde os métodos até os atributos utilizados.Logo, fez-se necessário a utilização do padrão "Extract methods".Com isso, criei uma classe chamaada 'DadosLista' que irá ter esse metódos e atributos comuns entre as duas classes, evitando assim a duplicação de código.

### 2° Problema:
- Ainda nas duas classes anteriores, ListaMetas e ListaTarefas no pacote 'módulos', tínhamos uma responsabilidade que era dada as duas classes, que não deveria existir ali, porque fazia com que a coesão do código fosse baixa.O problema era uma função que formatava as horas, a solução foi criar uma classe específica("FormatarHoras") para tratar as horas.Aplicamos ,então, a extract class.

### 3° Problema:
- Nas classes listarMetas,listarTarefas,FrameBusca havia muito código duplicado nos construtores da aplicação.Com isso, utilizei do padrão "Chain constructor" para evitar essa duplicação de código.

## Obsevação:
- O projeto antes da refatoração encontra-se na branch 'nao-refatorado'
