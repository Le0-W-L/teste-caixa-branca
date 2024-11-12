# Teste Caixa Branca
Repositório criado para a realização de uma atividade da matéria de UX/UI e Testes de Software.

## ETAPA 01 - ERROS ENCONTRADOS E EXPLICAÇÃO.

** Erro 01 na Linha 08: Classe do Driver MySQL **
- Erro: Nome de classe incorreto "com.mysql.Driver.Manager".
- Explicação: O método Class.forName() é usado para carregar o JDBC dinamicamente. Utilizar um nome de classe incorreto pode resultar em uma exceção ClassNotFoundException.

** Erro 02 na Linha 10: URL de Conexão com o Banco de Dados **
- Erro: String de conexão inclui user e password diretamente na URL.
- Explicação: A URL não está exatamente errada, porém, é uma forma ultrapassada de fazer a conexão com o banco de dados. A forma mais atual utiliza o método getConnection() da classe DriverManager.

** Erro 03 na Linha 20: Comando SQL em coluna inexistente. **
- Erro: Consulta resultando em SQLException.
- Explicação: A query tenta buscar uma coluna chamada "none", porém esta coluna é inexistente. 
