# Resumo Git e GitHub 💻

##
Respositório contém um resumo sobre Git e GitHub apresentado durante o Bootcamp Java Back-End Santander na plataforma DIO

## 📚 Documentação

   ``` git
	 git init 
	 git branch -M main
	 git remote add origin https_repositorio_git_hub
	 git add .
	 git status
	 git commit -m "first commit"
	 git push -u origin main
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
	
	
