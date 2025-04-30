Quando quiserem autenticar contas, use:
```java
	public boolean autenticar (int idConta) {
		boolean resp = false;
		ContaDAO dao = new ContaDAO();
		Conta conta = dao.getContaById(idConta);
		
		// autenticação acontece aqui
		
		return resp;
	}
```

Exemplo do diagrama do Mermaid

```mermaid
graph TD
    A[Enter Chart Definition] --> B(Preview)
    B --> C{decide}
    C --> D[Keep]
    C --> E[Edit Definition]
    E --> B
    D --> F[Save Image and Code]
    F --> B
```

