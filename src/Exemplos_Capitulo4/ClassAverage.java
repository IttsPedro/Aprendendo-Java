package Exemplos_Capitulo4;
// Figura 4.8: ClassAverage.java
// Resolvendo o problema da média da classe usando a repetição controlada por contador.
import java.util.Scanner; // Programa utiliza a classe Scanner

public class ClassAverage
{
    public static void main(String[] args)
        {
            // cria Scanner para obter entrada a partir da janela de comando
            Scanner input = new Scanner(System.in);

            // fase de inicialização
            int total = 0; // inicializa a soma das notas inseridas pelo usuário
            int gradeCounter = 1; // inicializa n° da nota a ser inserido em seguida

            // fase de processamento utiliza repetição controlada por contador
            while (gradeCounter <= 10) // faz o loop 10 vezes
            {
                System.out.print("Enter grade: "); // prompt
                int grade = input.nextInt(); // insere a próxima nota
                total = total + grade; // adiciona grade a total
                gradeCounter = gradeCounter + 1; // incrementa o contador por 1
            }

            // fase de término
            int average = total / 10; // divisão de inteiros produz um resultado inteiro

            // exibe o total e a média das notas
            System.out.printf("%nTotal of all 10 grades is %d%n", total);
            System.out.printf("Class average is %d%n", average);
        }
    } // fim da classe ClassAverage
