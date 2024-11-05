Nome: Matheus Teixeira Bastos
RGM: 36196231
Instituição: Cruzeiro do Sul, Campus Santo Amaro
Curso: Análise e Desenvolvimento de Sistemas (ADS) - 3º Semestre
Professor: Vinícius Heltai
Matéria: Programação Para Dispositivos Móveis
Projeto: Projeto 1 - App de Cálculo de IMC

Descrição Geral do Projeto

Este projeto consiste em um aplicativo de cálculo de IMC (Índice de Massa Corporal) desenvolvido em duas versões:

	1.	Versão Web: Desenvolvida usando HTML, CSS e JavaScript, esta versão funciona em navegadores e pode ser hospedada diretamente no GitHub Pages, facilitando o acesso a partir de dispositivos móveis e desktops.
	2.	Versão Android: Desenvolvida com o Android Studio usando Java, esta versão é um aplicativo móvel completo que pode ser instalado em dispositivos Android. Nesta versão, o peso e a altura são ajustados com barras deslizantes, oferecendo uma interface amigável para o cálculo do IMC.

Ambas as versões serão mantidas e disponibilizadas no GitHub para fácil acesso e visualização do código.

Parte 1: Versão Web (GitHub Pages)

Passos para Desenvolvimento

	1.	Criação do Repositório: Crie um repositório no GitHub chamado IMC-WebApp.
	2.	Estrutura de Arquivos: Adicione os seguintes arquivos ao repositório:
	•	index.html: Define a estrutura da interface com campos para entrada de peso e altura, um botão para calcular o IMC e um campo para exibir o resultado.
	•	style.css: Contém o estilo visual para manter o app agradável e responsivo.
	•	script.js: Inclui a lógica de cálculo do IMC e manipulação de eventos para atualizar os valores em tempo real.
	3.	Publicação no GitHub Pages:
	•	No repositório do GitHub, vá em Settings > Pages.
	•	Em Source, selecione a branch principal (main) e clique em Save. Isso vai gerar um link do GitHub Pages, onde o aplicativo web estará disponível para uso.

Código

O código HTML, CSS e JavaScript encontra-se no GitHub, permitindo que qualquer usuário acesse o app pelo navegador usando o link do GitHub Pages.

Parte 2: Versão Android (Android Studio)

Passos para Desenvolvimento

	1.	Configuração do Projeto no Android Studio:
	•	Abra o Android Studio e crie um novo projeto chamado IMCApp.
	•	Escolha a opção “Empty Activity” e defina “Java” como linguagem de programação.
	2.	Estrutura do App:
	•	Layout (activity_main.xml): Adicione SeekBars para o peso e a altura, um botão para calcular o IMC e um TextView para exibir o resultado.
	•	Lógica (MainActivity.java): Implemente a lógica de cálculo de IMC e eventos para atualizar o layout com os valores selecionados.
	3.	Geração do APK:
	•	Para gerar o arquivo APK, vá para Build > Build Bundle(s) / APK(s) > Build APK(s).
	•	O APK gerado será armazenado em IMCApp/app/build/outputs/apk/debug/.
	4.	Upload para o GitHub:
	•	Crie um repositório chamado IMC-AndroidApp e faça upload de todo o projeto, incluindo o APK, para o GitHub.
	5.	Documentação e Código no GitHub: O repositório conterá a estrutura completa do projeto Android, incluindo instruções para instalação do APK em dispositivos Android.

Conclusão

Essas duas abordagens proporcionam uma visão completa do desenvolvimento de um aplicativo de cálculo de IMC, tanto para a web quanto para Android, utilizando HTML, CSS, JavaScript e Android Studio com Java. As duas versões estarão disponíveis no GitHub em repositórios distintos:

	•	IMC-WebApp: Para a versão web (GitHub Pages)
	•	IMC-AndroidApp: Para a versão Android
