
Java - Estacionamento Inteligente 

Bem-vindo ao projeto de Estacionamento Inteligente em Java! Aqui está uma visão geral do que foi desenvolvido e como você pode instalar e testar o projeto.

🧰 Tecnologias, Linguagens e Ferramentas Utilizadas:

    Linguagem: Java 17
    Framework: Spring Boot 3.1.3
    Arquitetura: MSC (Model-Service-Controller)
    Injeção de Dependências
    Spring Web
    Spring Data JPA
    Spring Validation para criação de APIs com suporte a Pageable
    Banco de Dados: PostgreSQL
    Docker
    Customização Global de Datas

🎯 Funcionalidades Implementadas:

O projeto oferece um sistema de controle de estacionamento com as seguintes funcionalidades:

    Cadastro, leitura, atualização e exclusão de veículos estacionados.
    Integração com banco de dados PostgreSQL para armazenamento persistente dos dados.
    API RESTful com suporte à paginação (Pageable) para consultas.

📝 Instruções para Instalação e Teste do Projeto:

Para executar o projeto, certifique-se de que o Docker esteja instalado em sua máquina. Siga as etapas abaixo:

    Crie um diretório usando o comando mkdir e acesse-o:

bash

mkdir estacionamento-inteligente && cd estacionamento-inteligente

    Clone o repositório com o seguinte comando no terminal:

bash

git clone git@github.com:SeuNome/seu-projeto-java.git

    Acesse o diretório do projeto e instale suas dependências:

bash

cd seu-projeto-java

    Utilize o Docker para executar o banco de dados PostgreSQL:

bash

docker-compose up -d

✅ Teste de Requisições:

Dentro da pasta client_requests, você encontrará um arquivo que pode ser importado em um Cliente REST para testar as requisições. Este arquivo já contém exemplos de requisições preenchidas para facilitar os testes.

As requisições estão divididas em diferentes tipos:

    Requisições do tipo POST
    Requisições do tipo GET
    Requisições do tipo DELETE
    Requisições do tipo PUT
    Requisições do tipo GET PAGEABLE

Aqui está um exemplo de entrada para o cadastro de uma vaga:

json

{
  "placa": "ABC123",
  "modelo": "Sedan",
  "cor": "Prata",
  "dataEntrada": "2023-09-08T10:00:00"
}

Sinta-se à vontade para experimentar e testar o sistema com outros exemplos de requisições. Boa diversão! 🚀
