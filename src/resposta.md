Justificando o padrao escolhido

O padrão escolhido por mim para refatoramento de código 
foi o Template Method pois vi que nas classes de fabricar
bolo as partes fixas e variáveis podiam ser identificadas
facilmente, logo seria mais prático usar esse tipo de padrão
de software devido ao tamanho do código. Dessa forma, passei
as funções que não variavam na fabricação do bolo para a 
classe abstrata FabricaBolo e fiz com que as partes variáveis
fossem classes abstratas, delegando a obrigação de implementa-las
para as classes filhas da clase FabricaBolo (FabricaBoloChocolateComCaramelo
e FabricaBoloBaunilhaComMorango) para que tais funções fossem
feitas de acordo com a especificação de cada classe.
