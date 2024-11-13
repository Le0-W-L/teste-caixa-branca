# Teste Caixa Branca
Repositório criado para a realização de uma atividade da matéria de UX/UI e Testes de Software.

## ETAPA 01 - ERROS ENCONTRADOS E EXPLICAÇÃO.
**Erro 01 na Linha 08:**
- Erro: Could not find or load main class User.
- Explicação: O código fornecido não possue uma classe *Main*.

**Erro 02 na Linha 12:**
- Erro: O método *newInstace()* ficou obsoleto.
- Explicação: Desde a versão do Java 9, o método *newInstace()* não é mais utilizado.

**Erro 03 na Linha 13:**
- Erro: String de conexão inclui user e password diretamente na URL.
- Explicação: A URL não está exatamente errada, porém, é uma forma ultrapassada de fazer a conexão com o banco de dados. A forma mais atual utiliza o método getConnection() da classe DriverManager.

**Erro 04 na Linha 16:**
- Erro: Exceção não tratada.
- Explicação: O bloco *catch* na linha 16 não trata nenhuma exceção.

**Erro 05 na Linha 28:**
- Erro: Consulta resultando em SQLException.
- Explicação: A query tenta buscar uma coluna chamada "none", porém esta coluna é inexistente. 

**Erro 06 na Linha 29:**
- Erro: Consulta possui espaços extras.
- Explicação: A cosulta *sql += "where login = " + " ' " + login + " ' ";* possui espaços extras dentro das aspas simples, o que pode resultar em uma consulta inválida resultando em um SQLException.

**Erro 07 na Linha 30:**
- Erro: Consulta possui espaços extras.
- Explicação: A cosulta *sql += " and senha = " + " ' " + senha + " '; ";* possui espaços extras dentro das aspas simples, o que pode resultar em uma consulta inválida resultando em um SQLException.

**Erro 08 na Linha 31:**
- Erro: Exceção não tratada.
- Explicação: O bloco *catch* na linha 16 não trata nenhuma exceção.

## ETAPA 02 - COMMIT DO ARQUIVO DO PLANO DE TESTE DE CAIXA BRANCA NO REPOSITÓRIO.
**Arquivo do Plano de Teste já foi realizado e publico na *Branch: Main***

## ETAPA 03 - GRAFO DE FLUXO, COMPLECIDADE CICLOMÁTICA E BASE DE CAMINHO
**Para visualizar a *ETAPA 03*, entre na *Branch: ETAPA_03*. Após isso, clique no *link* para visualizar o Grafo de Fluxo. As outras atividades da *ETAPA 03* estarão disponíveis no corpo do *README*.**
