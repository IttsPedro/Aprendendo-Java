package Exemplos_Capitulo4;
    // Figura 4.10: ClassAverage2
    // Resolvendo o problema da média da classe usando a repetição controlada por sentinela.
    import java.util.Scanner; // Programa utiliza a classe Scanner

    public class ClassAverage2
    {
        public static void main(String[] args)
        {
            // cria Scanner para obter entrada a partir da janela de comando
            Scanner input = new Scanner(System.in);

            // fase de inicialização
            int total = 0; // inicializa a soma das notas
            int gradeCounter = 0; // inicializa o n° de notas inseridas até agora

            // fase de processamento
            // solicita entrada e lê a nota do usuário
            System.out.print("Enter grade or -1 to quit: ");
            int grade = input.nextInt();

            // faz um loop até o valor de sentinela inserido pelo usuário
            while (grade != -1)
            {
                total = total + grade; // adiciona grade a total
                gradeCounter = gradeCounter + 1; // incrementa counter

                // solicita entrada e lê a próxima nota fornecida pelo usuário
                System.out.print("Enter grade or -1 to quit: ");
                grade = input.nextInt();
            }

            // fase de término
            // se o usuário inseriu pelo menos uma nota...
            if (gradeCounter != 0)
            {
               // usa número com ponto decimal para calcular média das notas
               double average = (double) total / gradeCounter;

               // exibe o total e média (com dois dígitos de precisão)
                System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter,total);
                System.out.printf("Class average is %.2f%n", average);
            }
            else // nenhuma nota foi inserida, assim gera saída da mensagem apropriada
                System.out.println("No grades were entered");
        }
    } // fim da classe ClasseAverage2
