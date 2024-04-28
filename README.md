
# <center>Git e GitHub 💻<center>

##
Resumo sobre Git e GitHub apresentado durante o Bootcamp Java Back-End Santander na plataforma DIO

## 📚 Documentação

* [Documentação Git](https://git-scm.com/doc)
* [Documentação GitHub](https://docs.github.com/pt)

## ✍ Sumário e Resumo

|Aula|Explicação|
|---|---|
|Aula 1|[Criando um Respositório Local Com Git](https://github.com/apm-cmyk/bootcamp-dio-santander?tab=readme-ov-file#aula-1-criando-um-resposit%C3%B3rio-local-com-git)|
|Aula 2|[Salvando Alteração No Respositório local](https://github.com/apm-cmyk/bootcamp-dio-santander?tab=readme-ov-file#aula-2-salvando-altera%C3%A7%C3%A3o-no-resposit%C3%B3rio-local)|
|Aula 3|[Desfazendo Alterações No Respositório Local](https://github.com/apm-cmyk/bootcamp-dio-santander?tab=readme-ov-file#aula-3-desfazendo-altera%C3%A7%C3%B5es-no-resposit%C3%B3rio-local)|
|Aula 4|[Enviando e Baixando Alterações com Respositório Remoto](https://github.com/apm-cmyk/bootcamp-dio-santander?tab=readme-ov-file#aula-4-enviando-e-baixando-altera%C3%A7%C3%B5es-com-resposit%C3%B3rio-remoto)|
|Aula 5|[Trabalhando com Branches - Criando, Mesclando, Deletando e Tratando Conflitos](https://github.com/apm-cmyk/bootcamp-dio-santander?tab=readme-ov-file#aula-5-trabalhando-com-branches---criando-mesclando-deletando-e-tratando-conflitos)|
|Aula 6|[Trabalhando com Branches - Comandos Úteis no Dia a Dia](https://github.com/apm-cmyk/bootcamp-dio-santander?tab=readme-ov-file#aula-6-trabalhando-com-branches---comandos-%C3%BAteis-no-dia-a-dia)|

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
	 git remote add origin (https ou chave ssh)
	 git branch -M main
	 git push -u origin main
	 git pull
	 git checkout -b nome_nova_branch
	 git checkout main
	 git branch -v
	 git branch
	 git merge nome_nova_branch
	 git branch -d nome_branch
	 git fetch origin main
	 git diff main origin/main
	 git clone (https ou chave SSH) --branch nome_branch --single-branch
	 git stash
	 git stash pop
	 git stash apply
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

Adicionar repositório remoto para o repositório Local

```git
git remote add origin (https ou chave ssh)
```

Colocar como branch main caso esteja usando a branch master

```git
git branch -M main
```

Comando push para coloar os arquivos no repositório remoto

```git
git push -u origin main
```
Para abrir o editor online do github, dentro do repositório apertar a tecla ponto. Vai abrir um editor semelhante ao VSCode.

Para atualizar o repositório local com as alterações feitas no repositório remoto:

```git
git pull
```

## Aula 5: Trabalhando com Branches - Criando, Mesclando, Deletando e Tratando Conflitos

 Branch = Ramo (ramificação do seu projeto).
<p> É um ponteiro móvel para o commit no histórico do repositório.
 Quando você cria uma nova branch a partir de uma branch já existente ela passa apontar para o mesmo commit que estava a branch anterior.
 Se você fizer um novo commit com sua nova branch somente a nova branch irá apontar para esse novo commit
 Para que a branch anterior também aponte para o novo commit da branch nova deverá **mesclar as branches**.
 </p>
 
Criar uma nova branch
 
```git
git checkout -b nome_nova_branch
```

Retornar para a branch anterior (branch main)

```git
git checkout main
```

Listar o último commit de cada branch

```git
git branch -v
```
Listar as branches
```git
git branch 
```
Mesclar banches

```git
git merge nome_nova_branch
```

Excluir branch

```git
git branch -d nome_branch
```

## Aula 6: Trabalhando com Branches - Comandos Úteis no Dia a Dia

Baixar o conteúdo do repositório remoto (sem mesclar com sua branch)

```git
git fetch origin main
```

Ver diferenças entre as Branches

```git
git diff main origin/main
```

Clonar um repositório com várias branches e você queira clonar apenas uma branch:

```git
git clone (https ou chave SSH) --branch nome_branch --single-branch
```

Caso queira criar uma nova branch mas não queira que ela considere uma modificação feita da branch anterior
As modificações da última branch

```git
git stash
```

Ao retornar para a branch antiga, você pode trazer as modificações arquivadas e excluir a modificação recente.

```git
git stash pop
```

Ou pode atualizar para a modificação recente:

```git
git stash apply
```



