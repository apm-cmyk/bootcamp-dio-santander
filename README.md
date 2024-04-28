
# <center>Git e GitHub 💻<ceneter>

##
Respositório contém um resumo sobre Git e GitHub apresentado durante o Bootcamp Java Back-End Santander na plataforma DIO

## 📚 Documentação

* [Documentação Git]()
* [Documentação GitHub]()

## ✍ Sumário e Resumo

|Aula|Explicação|
|---|---|
|Aula 1|[Criando um Respositório Local Com Git]()|
|Aula 2|[Salvando Alteração No Respositório local]()|
|Aula 3|[Desfazendo Alterações No Respositório Local]()|
|Aula 4|[Enviando e Baixando Alterações com Respositório Remoto]()|

lista de comandos apresentados:
   ``` git
	 git init 
	 git branch -M main
	 git remote add origin https_repositorio_git_hub
	 git add .
	 git status
	 git commit -m "first commit"
	 git push -u origin main
	 git log
	 rm -rf .git
	 git restore nome_arquivo
	 git commit --amend -m "mensagem modificada"
	 git commit --amend
	 git reset --soft hash_do_commit
	 git reset --mixed hash_do_commit
	 git reset --hard hash_do_commit
	 git ref log
	 git reset nome_arquivo
   ```


![texto](https://tenor.com/tbB3.gif)


## 🐱‍ PARTE II - Primeiros Passos com Git e GitHub

### Aula 1: Criando um Respositório Local Com Git

Criar um repositório local git dentro do diretório que deseja fazer o controle:
	
	
``` git
git init
```
O arquivo config contém as configurações do repositório Git
Você pode visualizar o arquivo config utilizando o comando no bash:
	
```git
cat config
```
	
Para clonar um repositório do github para sua pasta local com o link do https, executar o comando:
	
```git
git clone link_https_diretorio_github
```
	
Para clonar o repositório com um novo nome digite:
	
```git
git clone link_https_diretorio_github novo_nome
```
	
O arquivo config tem por padrão o [core] e após vinculo com um repositório remoto passa a ter os [remoto "origin"] e [branch "main"]
	
Para verificar se seu repositório local tem vínculo com algum repositório remoto utilize:
	
```
git remote -v
```
	
Para criar um vínculo com um repositrório remoto utilize:
	
```git
git remote add origin link_https_diretorio_github
```
	
Agora se você abrir novamente o arquivo config verá que já aparece o [remoto "origin"], porém não aparecerá a [branch "main"] pois ainda não foi feita nenhuma alteração no seu diretório local
	
Para clonar uma branch específica (por exemplo feature-1) você pode utilizar:
	
``git clone URL --branch feature-1 --single-branch
``
	
### Aula 2: Salvando Alteração No Respositório local
	
Comando de status
	
```git
git status
```
	
O arquivo **.gitignore** serve para colocar arquivos que não é desejado que apareça no repositório remoto.
Você pode colocar uma pasta por exemplo chamada *"pasta_ignorada"* em um arquivo **.gitignore** assim:

```git
echo pasta_ignorada > .gitignore
```
O arquivo **.gitkeep** é um arquivo criado pelo git para reconhecer um diretório vazio.
Caso você queira fazer o push de um diretório vazio (por exemplo pasta_vazia) ele não aparecerá para o git então você pode acrescentar esse arquivo .**gitkeep** dentro de seu diretório


```git
touch pasta_vazia\.gitkeep
```

Assim o git passará a reconhecer sua pasta. Veja pelo git status!

### Aula 3: Desfazendo Alterações No Respositório Local

Para remover um repositrório git inicializado com **git init** em uma pasta errada:

```git
rm -rf .git
```

Para restaurar arquivos modificados que já foram salvos:

```git
git restore nome_arquivo
```

Para alterar a mensagem do último commit:

```git
git commit --amend -m "mensagem modificada"
```

Outra forma de fazer a modificação: 
```git
git commit --amend
```

Dessa forma ele abrirá o editor de texto para ser feita a modificação.

Para desfazer o último commit podemos usar um dos três comandos:

```git
git reset --soft hash_do_commit
git reset --mixed hash_do_commit
git reset --hard hash_do_commit
```

Para visualizar o hash do commit utiize o comando git log.

|--|função|
|---|---|
|soft|arquivos posterior ao commit informado vão para a área de preparação|
|mixed| arquivos posterior ao commit informado vão para status untracked files|
|hard| arquivos posterior ao commit informado são completamente apagados|

mixed é o padrão do git para o comando reset 

Para ter os logs mais detalhados

```git
git ref log
```

Para apenas tirar o aquivo da área de preparação:

```git
git reset nome_arquivo
```
## Aula 4: Enviando e Baixando Alterações com Respositório Remoto 
