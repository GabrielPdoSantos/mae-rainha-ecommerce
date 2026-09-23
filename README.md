# Projeto Mãe Rainha - E-commerce API

## Visão Geral
Sistema de e-commerce (backend e frontend) desenvolvido para a loja católica de terços Mãe Rainha. O objetivo é fornecer uma plataforma própria para venda de produtos, gerenciamento de estoque e acompanhamento de pedidos.

## Escopo do MVP (Fase 1)
O Produto Mínimo Viável foca em permitir que um cliente se cadastre, adicione produtos ao carrinho e finalize a compra pagando via PIX, com o administrador gerenciando os envios.

### Requisitos Funcionais
- **RF01:** Cadastro e autenticação de clientes.
- **RF02:** Gestão de perfil e endereços de entrega.
- **RF03:** Catálogo de produtos (busca e listagem).
- **RF04:** Visualização de detalhes e estoque do produto.
- **RF05:** Carrinho de compras autênticado.
- **RF06:** Checkout com cálculo de frete fixo por bairro.
- **RF07:** Integração de pagamento via PIX (Geração e Webhook).
- **RF08:** Acompanhamento de status de pedidos pelo cliente.
- **RF09:** Painel Admin: Gestão de catálogo (CRUD de produtos).
- **RF10:** Painel Admin: Gestão e atualização de pedidos.

### Regras de Negócio Principais
- O Checkout exige que o usuário possua uma conta e esteja logado.
- O estoque do produto é reservado no momento da criação do pedido (`AGUARDANDO_PAGAMENTO`).
- Pedidos não pagos dentro do tempo limite do PIX são cancelados e o estoque é devolvido.
- Apenas usuários com a *role* `ADMIN` têm acesso às rotas de gerenciamento da loja.

  ### Requisitos Não Funcionais
- **RNF01 (Segurança):** Senhas criptografadas via BCrypt; autenticação stateless com JWT; proteção contra injeção de SQL e dados sensíveis via variáveis de ambiente.
- **RNF02 (Usabilidade):** Interface web (Frontend) primariamente responsiva (*Mobile First*), otimizada para o fluxo de compra via redes sociais.
- **RNF03 (Confiabilidade):** Persistência em banco de dados relacional (PostgreSQL) com controle transacional rígido (ACID) para consistência de estoque e pedidos.
- **RNF04 (Manutenibilidade):** API RESTful documentada via Swagger/OpenAPI, com tratamento global de exceções e padronização de respostas de erro.

## Tecnologias
- **Backend:** Java 21, Spring Boot 3, Spring Data JPA, Spring Security, JWT
- **Banco de Dados:** PostgreSQL
- **Frontend:** JavaScript / React (a definir)
