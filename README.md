# Sistema de Avaliação de Créditos
   * Este projeto é uma API desenvolvida em Kotlin com o framework Spring Boot
   utilizando o H2 database, Gradle, Flyway Migration, JPA, Validação, Swagger e JUnit. 
   A API foi criada para um Sistema de Avaliação de Créditos.
   
   * A API permite realizar as seguintes operações:
      - Cadastrar avaliações de créditos com os dados do cliente e sua avaliação de crédito.
      - Listar todas as avaliações de créditos cadastradas.
      - Buscar uma avaliação de crédito específica por seu ID.
      - Atualizar apenas alguns campos de uma avaliação de crédito existente.
      - Deletar uma avaliação de crédito.
# Banco de dados
    -O banco de dados H2 já está configurado para ser criado e populado automaticamente com dados de teste ao iniciar a aplicação.
    Não é necessário nenhum tipo de configuração extra.
    
# Swagger
    - A documentação da API foi feita com o Swagger. Para acessar a documentação, acesse http://localhost:8080/swagger-ui.html.
    
# Flyway Migration
    - As migrações do banco de dados são executadas automaticamente ao iniciar a aplicação.
    As migrações estão localizadas na pasta src/main/resources/db/migration.

