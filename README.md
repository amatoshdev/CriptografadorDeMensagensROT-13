<h1> Criptografador de Mensagens ROT-13 </h1>

<h2> Descrição do Projeto </h2>

**_O que significa "ROT-13"?_**

*O ROT-13 é um padrão lógico utilizado para criptografar e descriptografar mensagens alternando uma letra específica em 13 posições seguintes sem considerar a própria letra.*

Para que a lógica de criptografia e descriptografia desse padrão fique mais clara e visível, darei um exemplo: vamos pegar as letras "A", "B" e C". 

**Criptografia:** se contarmos 13 letras depois da letra "A" (não inclusa) a nova letra será a "N". Se contarmos 13 letras depois da "B" (não inclusa) a nova será a "O". E se contarmos 13 letras depois da "C" (não inclusa) a nova será a "P". Se juntarmos as primeiras letras tomadas como exemplo, teremos a palavra "ABC". Se juntarmos, agora, as novas letras, criptografadas, seguindo a lógica ROT-13, teremos a palavra "NOP".

**Descriptografia:** agora, para descriptografar a palavra "NOP" (ou seja, as letras "N", "O" e "P"), devemos contar 13 letras depois em cada uma das novas letras criptogradas e considerar que, ao término do alfabeto, ou seja, depois da letra 'z', o alfabeto começará novamente na letra 'a'. Se contarmos 13 letras depois de "N" (não inclusa) a nova será a "A". Se contarmos 13 letras depois de "O" a nova será a "B". E se contarmos 13 letras depois de "P" a nova será a "C". Dessa forma, retorna-se as letras originais "ABC"; ou seja: houve a descriptografia.

___

**Explicação e instruções do programa:**

**Rodando o programa:**

Com a execução do programa, o prompt solicitará ao usuário uma opção correspondente ao número 1, 2 ou 3.

O número 1 tem como função a criptografia. Caso essa opção seja solicitada, o programa exibirá uma mensagem requerendo uma entrada do usuário para que seja criptografada.

Exemplo: 

**Palavra inserida:** *"Ola, mundo."*

**Criptografia da palavra inserida:** *"Byn, zhaqb."*

Já o número 2 tem como função a descriptografia. Caso essa opção seja desejada pelo usuário, o programa solicitará uma mensagem qualquer de sua escolha a ser descriptografada e realizará o processo de decifragem. Se o usuário inserir uma mensagem não-cifrada tendo como objetivo descriptografar uma mensagem, ela será criptografada. Para que o programa decifre uma mensagem, o usuário deverá inserir a mensagem cifrada.

Exemplo:

**Palavra inserida:** *Byn, zhaqb.*

**Descriptografia da palavra inserida:** "Ola, mundo."

E, por fim, o número 3 exibe a mensagem "Saindo..." e finaliza o programa.

*Caso o usuário deseje inserir uma opção que não está listada e não tem função (ou seja, selecione um número menor que 1 e maior que 3) o programa emitirá a mensagem "Opção inválida. Digite novamente" e reiniciará o programa.*

___

**Explicação do código:**

Para capturar as entradas do usuário, foi usada a classe Scanner.

Toda a estrutura do programa está inserida dentro de uma estrutura de repetição do-while, com uma condição do tipo int chamada "opcao", que não é inicializada com algum valor, pois é dependente da opção inserida pelo usuário. Toda a estrutura visual do prompt, bem como a lista de opções, foi criada a partir do método de saída System.out.println() e suas variantes. Após o usuário entrar com um número referente a uma opção, o int "opcao" recebe esse número por meio da leitura da classe Scanner e, em seguida, "consome" a quebra de linha deixada pela leitura do número evitando, assim, possíveis comportamentos inesperados. 

Com o número gravado na variável "opcao", o programa então verifica, por meio de estruturas if-else, se aquele número é compatível com alguma opção da lista. Caso seja, a função referente ao número inserido será executada; do contrário será solicitada uma nova entrada.

Foi criado um método String de nome "rot13" com parâmetro "String texto" para melhor organizar, estruturar e reutilizar o código. Esse método realiza as funções de criptografia e descriptografia.

De ínicio, o método conta com a classe StringBuilder() que auxiliará na construção de uma String mutável e, consequentemente, na modificação da sequência dos caracteres. 

Após isso, é iniciada uma estrutura de repetição for-each com instruções que criam uma variável do tipo char (caractere) de nome "c" e que torna a entrada String do usuário em um array de char (vetor de caracteres).

Em seguida, é verificado, individualmente, se o caractere no array está compreendido na dimensão entre 'a' a 'z' (minúsculo), na dimensão 'A' a 'Z' (maíusculo) ou não está em nenhuma delas (mantém o caractere inalterado e não é aplicada à regra do ROT-13). Tanto para a dimensão 'a' a 'z' quanto para a 'A' a 'Z', o programa executa a mesma regra e cálculos para alternar as letras seguindo o padrão ROT-13 de criptografia e descriptografia. 

Para que as novas letras sejam aderidas à String mutável, criada a partir da classe StringBuilder(), utiliza-se o método append() para que todas os caracteres validados pelas condições sejam aderidos ao final da String.

O cálculo para que seja realizada a alternância e a adesão das novas letras à String é feito por meio da subtração do valor referente a posição guardada no índice do array de caracteres do caractere 'a' (que tem índice 0), pois, naturalmente, os arrays são iniciados pelo índice 0. Caso o índice não seja subtraído é possível que a dimensão do array seja ultrapassada, ocasionando um possível erro de exceção de limites do array. Após esse cálculo, é somado 13 ao resultado dessa subtração para a realização da rotação no alfabeto. Em seguida, é realizado um cálculo de módulo (%) utilizando o resultado dessas operações anteriores por 26 (já que há 26 letras no alfabeto) para caso a nova letra ultrapasse o limite em 'z' o alfabeto possa retornar em 'a', criando assim uma rotação sem possíveis escapes. Em seguida, é somado o resultado dessa operação de módulo ao valor correspondente ao caractere 'a' na tabela ASCII, gerando, assim, a nova letra criptografada ou descriptografada.

Caso a entrada do usuário possua algum caractere especial (como pontuações e símbolos), ele será aderido pelo método append() à String mutável sem nenhuma alteração ou alternância.

Por fim, se o array de caracteres não houver mais caracteres a serem codificados, o método toString() retornará o resultado das codificações à variável que guardará esse resultado no método main() para que, assim, seja impressa no prompt.

___

<h2> Habilidades adquiridas: </h2>

Por meio desse projeto, foi possível compreender a forma de estruturação de um sistema simples de criptografia; no caso, utilizando o padrão de cifragem ROT-13. Reforcei os conhecimentos de estruturação de métodos; estruturas de repetição como o for-each; e tive um primeiro contato com os métodos toCharArray(), append() e toString() e a classe StringBuilder().

<h2> Habilidades requisitadas: </h2>

Para (re)criar esse projeto você necessitará consolidar e aplicar certos conhecimentos específicos:

1. Declaração de variáveis e tipos primitivos (tipos utilizados: int e char)
2. Estruturas de repetição (estruturas utilizadas: do-while e for-each)
3. Estruturas condicionais (estrutura utilizada: if-else)
4. Operadores de igualdade (operadores utilizados: == e !=)
5. Operadores relacionais (operadores utilizados: >= e <=)
6. Aplicação de métodos (métodos utilizados: toCharArray(), append(), toString() System.out.print() e System.out.println())
7. Declaração de Strings
8. Importação e aplicação da classe Scanner
9. Declaração e aplicação da classe StringBuilder()
10. Lógica de criação de métodos e parâmetros.

<h2> Linguagens Utilizadas: </h2>

- <b> Java 17 </b> 

<h2> Ambiente utilizado: </h2>

- <b> Windows 11 </b>
- <b> IntelliJ IDEA </b>

<h2> Ilustrações do programa: </h2>

<p align="center">
Tela inicial solicitando uma opção da lista ao usuário: <br/> <br/>
<img src="https://imgur.com/pCtS39l.png" height="80%" width="80%" alt="Disk Sanitization Steps"/>
<br/>
<br/>
Cenário de criptografia com a entrada da palavra "criptografia123": <br/> <br/>
<img src="https://imgur.com/ov9Ggbv.png" height="80%" width="80%" alt="Disk Sanitization Steps"/>
<br/>
<br/>
Cenário de descriptografia com a entrada da palavra "pevcgbtensvn123" (palavra "criptografia123" criptografada): <br/> <br/>
<img src="https://imgur.com/Hg4zsLR.png" height="80%" width="80%" alt="Disk Sanitization Steps"/>
<br/>
<br/>
Cenário de entrada não correspondente a uma propriedade da lista de opções: <br/> <br/>
<img src="https://imgur.com/wj8oazv.png" height="80%" width="80%" alt="Disk Sanitization Steps"/>
<br/>
<br/>
Cenário de entrada para finalizar o programa: <br/> <br/>
<img src="https://imgur.com/fx6QZyw.png" height="80%" width="80%" alt="Disk Sanitization Steps"/>
<br/>
<br/>
___

*Gostaria de agradecer ao professor Cristóvão José Dias da Cunha, da Faculdade de Tecnologia (FATEC) de Guaratinguetá, por me proporcionar esse exercício desafiador e instigante com base em sua experiência profissional que demandou, em uma situação específica, a criação de um sistema semelhante.*

      Muito obrigado por acompanhar a leitura dessa apresentação até aqui! Desfrute-o como quiser! 😁☕
