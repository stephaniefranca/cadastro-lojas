  <h1>Cadastro de Lojas</h1>
    <p>Este projeto foi desenvolvido em <strong>Java</strong> com o objetivo de criar um sistema simples para gerenciar o cadastro de lojas, permitindo as seguintes operações:</p>
    <ul>
        <li>Cadastrar novas lojas (até 10)</li>
        <li>Listar as lojas cadastradas</li>
        <li>Excluir todas as lojas cadastradas</li>
        <li>Sair do programa</li>
    </ul>

   <h2>Como funciona o programa</h2>
    <p>O programa apresenta um menu interativo no terminal para que o usuário escolha a ação desejada.<br>
    Ele armazena os nomes das lojas em um array fixo e controla o número de lojas cadastradas.</p>

  <h2>O que aprendi com este projeto</h2>

   <h3>1. Estruturas Condicionais (<code>switch</code> e <code>if</code>)</h3>
    <ul>
        <li>Utilizei o <code>switch</code> para tratar as diferentes opções do menu.</li>
        <li>Usei <code>if</code> para verificar condições como o limite de cadastro e se há lojas para listar.</li>
    </ul>

  <h3>2. Tratamento de Exceções (<code>try-catch</code>)</h3>
    <ul>
        <li>Utilizei <code>try-catch</code> para capturar entradas inválidas do usuário (como letras no lugar de números).</li>
        <li>Isso evita que o programa quebre e melhora a experiência do usuário.</li>
    </ul>

  <h3>3. Loops (<code>while</code> e <code>for</code>)</h3>
    <ul>
        <li>Utilizei <code>while</code> para manter o programa em execução até que o usuário escolha sair.</li>
        <li>Usei <code>for</code> para percorrer o array de lojas ao listar ou excluir registros.</li>
    </ul>

  <h3>4. Entrada e Saída de Dados (<code>Scanner</code> e <code>System.out</code>)</h3>
    <ul>
        <li>Usei a classe <code>Scanner</code> para capturar informações digitadas no terminal.</li>
        <li>Usei <code>System.out.println</code> para exibir menus e mensagens para o usuário.</li>
    </ul>

  <h3>5. Manipulação de Arrays</h3>
    <ul>
        <li>Trabalhei com um array de tamanho fixo para armazenar nomes de lojas.</li>
        <li>Controlei a quantidade de lojas cadastradas e limpei o array quando necessário.</li>
    </ul>
