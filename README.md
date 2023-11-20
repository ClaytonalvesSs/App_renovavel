# App_renovavel
## Repositório com arquivo do app sobre energia renovável e pokémon

Feito por: Clayton Alves e Evelyn Karina


O app desenvolvido cujo seu tema é sobre energia renovável mesclado com o tema de pokemon.
Primeiramente utilizamos o canva para elaborar a interface do projeto.
Após isso, utilizamos o Android Studio para fazer o layout e definir a funcionalidade para cada elemento.

O app possui 5 activities:

A primeira seria onde você irá escolher o tipo de energia, para isso utilizamos 4 ImageButtons, em cada um tem uma imagem de cada energia, que são: Solar, Eólica, Hidrelétrica e Oceânica. Nesta primeira activity terá os quatro ImageButtons que irá te direcionar para a activity correspondente a energia renovável.

As outras 4 activities irão apresentar informações sobre a energia que você escolheu no menu inicial.

Assim que você escolher a energia, você será direcionado a outra activity, onde nela vai mostrar informações sobre a energia escolhida, onde utilizamos TextView para apresentar as informações e ImageView para colocar a imagem da fonte de energia, o pokemon representado e o "rank" de cada energia (como se fosse uma nota), e também terá um ImageButton que tem a função de te levar de volta ao menu inicial.

# Atualizações:

Mudança na dupla, a partir de agora, as pessoas que darão continuidade ao app será Clayton Alves e Evelyn Karina.

Após uma breve discussão, pensamos em adicionar tais elementos ao nosso aplicativo.

Começando por pequenos ajustes no layout (por questão estética).

Ao clicar no app, iremos fazer uma "intro" de 3 segundos mais ou menos, exibindo uma ImageView da logo e uma TextView com o nome, que no caso seria PokeEnergy.

Após essa intro, iria aparecer uma activity, com um campo de login, que seria Nome de usuário e Senha que iremos utilizar duas TextViews para indicar ao usuário onde inserir os dados e duas EditTexts que são campos para o usuário inserir o nome de usuário e senha. Ainda nesta activity iremos colocar um Button enviar e ao clicar ele te  redirecionaria para a activity das 4 energias renováveis, aparecendo uma mensagem escrita "login efetudo com sucesso!".

# Ideia do menu lateral (cancelada)
Na activity das energias, vamos adicionar um button que vai chamar um menu lateral, no qual ele exibirá algumas opções, como por exemplo, "Sair" que ao clicar,  vai sair do usuário cadastrado, redirecionando de volta para a tela de login e o "Suporte" no qual iria redirecionar para uma nova activity com algumas dúvidas frequentes já respondidas (conjunto de TextViews) sobre energia renovável.

# Ideia que vamos por no lugar do menu
Na Main, iremos adicionar um button que fara uma busca no navegador de sua preferencia sobre "O que são Pokemons?" para aquelas pessoas que não sabem o qwe são e possam entender um pouco mais sobre o tema do desenho escolhido pra mesclar com energias renováveis. Também iremos adicionar um Button na Main que levará a activity suporte, no qual terá 5 buttons, que levarão a 5 sites (cada um falando sobre um tipo de energia), em cada activity das energias, terá um button levando a uma localização, exemplo, na activity da energia solar, terá um button que mostrará uma localização que tem esse tipo de energia (nessa ideia, possui 3 tipos de Intent Implicita, de busca, de localização e de abrir site na web).

Atualização:
Adicionamos a imagem do Diagrama de Classes e sua explicação logo abaixo:

![image](https://github.com/ClaytonalvesSs/Clayton-e-Guilherme-PAMI/assets/128047894/03b8c823-3109-448d-8dcf-598121899b4d)

Contexto da imagem:

Temos as classes Login, TpEnergias e Suporte. 

A classe login, seria o login do usuário no aplicativo e sem ele não seria possível o usuário entrar nas outras activitys.  

A classe TpEnergias, seria as informações colocadas no aplicativo sobre o tema Energias Renováveis, ou seja, o nome da energia, a imagem e a descrição. 

A classe Suporte, representaria a activity suporte que será inserida com o intuito de deixar perguntas frequentes sobre Energias Renováveis e junto as perguntas, as respostas. 

Ou seja, na classe Login podemos cadastrar e atualizar os dados do usuário. 

Na classe TpEnergias iriamos cadastrar, atualizar e consultar as informações. 

E na classe Suporte seria uma forma de consulta para o usuário.

# VIDEO DO APP FUNCIONANDO

https://youtu.be/fdxlIurX24U?si=kudCnNpx3CmZI2MX

# Implementação de sensor no aplicativo
Após uma breve discussão sobre qual sensor utilizar, a Evelyn sugeriu que usassemos um sensor de movimento, no qual ao balançar o celular, o pokémon mudaria de imagem para a de uma versão superior de si, dando a impressão de que ele estivesse "evoluído". E também adicionamos uma mensagem Toast para avisar o usuário que se ele balançar o celular, a imagem mudaria. decidimos fazer esses códigos nas quatro Activities de energia e Com isso, iniciamos a elaboração do codigo nessa sexta-feira (17 de novembro) e ele foi finalizado na tarde do dia seguinte, agora, veja a explicação do código logo abaixo:

# Declaração de variáveis 
![image](https://github.com/ClaytonalvesSs/App_renovavel/assets/128047894/99666f7e-2608-4077-af1a-76753a43eaf5)

Declaramos algumas variáveis para o sensor uma para a mensagem toast e tambem uma para mudar a image view.

# Método OnCreate
![image](https://github.com/ClaytonalvesSs/App_renovavel/assets/128047894/e4648e84-88a7-4d31-ac38-35a627a471a8)

Iniciamos oSensorManager no qual gerecia o sensor, o acelerometro em si e o ouvinte, que seria a parte que gerencia o tempo de resposta da ação que o sensor realiza.

# Método onSensorChanged
![image](https://github.com/ClaytonalvesSs/App_renovavel/assets/128047894/2af6969b-a6e9-4da3-a240-70fd5fb4ecfe)

Esse método se baseia no eixo x, no caso se o valor de aceleração for maior que 15, ele trocará a imagem básica pela imagem do pokémon evoluído.

# Método onAccuracyChanged
![image](https://github.com/ClaytonalvesSs/App_renovavel/assets/128047894/47df1d59-33d2-446d-a1e8-53a32d2819a0)

Esse método define uma ação que será feita caso a precisão do sensor mude, porém como o nosso está vazio, ele não realizará nada.

# Método exibirToast
![image](https://github.com/ClaytonalvesSs/App_renovavel/assets/128047894/652956f8-ba9d-42b1-844b-0f80f4c8fbc9)

Ele apresenta uma mensagem toast, no qual aparecerá quando o usuário entrar na activity de uma das energias, indicando que ele balançe o celular para que a imagem mude.

# VIDEO DO TESTE DO SENSOR

https://youtube.com/shorts/qe_KgErr3BU?si=NSo7g0JR7N4JAiCR
