public class Quiz {

            public static void main(String[] args) {

                int numeroAcertos = 0;
                System.out.println("mensagem inicio do grupo 1");
                numeroAcertos = numeroAcertos + grupo2();
                System.out.println("mensagem fim do grupo 1");
                System.out.println("Fim do Quiz! perguntas vc acertou: " + numeroAcertos);
            }

            public static int grupo2() {
                Resposta r = new Resposta();
                int cont = 0;
                String respostaUsuario;
                Questao questao1 = new Questao();
                questao1.pergunta = "Quem é considerado pai da informática";
                questao1.opcaoA = "A - Elon musk";
                questao1.opcaoB = "B - Steve Jobs";
                questao1.opcaoC = "C - Alan Turing";
                questao1.opcaoD = "D - Stephen Hawking";
                questao1.opcaoE = "E - Bill Gates";
                questao1.correta = "C";
                questao1.escrevaQuestao();
                respostaUsuario = r.leiaResposta();
                if (questao1.isCorreta(respostaUsuario)) {
                    cont++;
                }
                Questao questao2 = new Questao();
                questao2.pergunta = "Quem é o fundador da tesla";
                questao2.opcaoA = "A - Elon musk";
                questao2.opcaoB = "B - Steve Jobs";
                questao2.opcaoC = "C - Alan Turing";
                questao2.opcaoD = "D - Stephen Hawking";
                questao2.opcaoE = "E - Bill Gates";
                questao2.correta = "A";
                questao2.escrevaQuestao();
                respostaUsuario = r.leiaResposta();
                if (questao2.isCorreta(respostaUsuario)) {
                    cont++;
                }
                Questao questao3 = new Questao();
                questao3.pergunta = "Quem é o fundador da microsoft";
                questao3.opcaoA = "A - Elon musk";
                questao3.opcaoB = "B - Steve Jobs";
                questao3.opcaoC = "C - Alan Turing";
                questao3.opcaoD = "D - Stephen Hawking";
                questao3.opcaoE = "E - Bill Gates";
                questao3.correta = "E";
                questao3.escrevaQuestao();
                respostaUsuario = r.leiaResposta();
                if (questao3.isCorreta(respostaUsuario)) {
                    cont++;
                }
                Questao questao4 = new Questao();
                questao4.pergunta = "Quem é O fundador da apple";
                questao4.opcaoA = "A - Elon musk";
                questao4.opcaoB = "B - Steve Jobs";
                questao4.opcaoC = "C - Alan Turing";
                questao4.opcaoD = "D - Stephen Hawking";
                questao4.opcaoE = "E - Bill Gates";
                questao4.correta = "B";
                questao4.escrevaQuestao();
                respostaUsuario = r.leiaResposta();
                if (questao4.isCorreta(respostaUsuario)) {
                    cont++;
                }
                Questao questao5 = new Questao();//parte para inicio
                questao5.pergunta = "primeiro tanque";
                questao5.opcaoA = "A - Renalt-17";
                questao5.opcaoB = "B - mark1";
                questao5.opcaoC = "C - Sherman";
                questao5.opcaoD = "D - Pazer";
                questao5.opcaoE = "E - Bill Gates";
                questao5.correta = "B";
                questao5.escrevaQuestao();
                respostaUsuario = r.leiaResposta();
                if (questao5.isCorreta(respostaUsuario)) {
                    cont++;
                    ;
                }
                Questao questao6 = new Questao();
                questao6.pergunta = "ouve navios mercantes feitos de cimento nas guerras";
                questao6.opcaoA = "A - nao";
                questao6.opcaoB = "B - sim";
                questao6.correta = "B";
                questao6.escrevaQuestao();
                respostaUsuario = r.leiaResposta();
                if (questao6.isCorreta(respostaUsuario)) {
                    cont++;
                }

                Questao questao7 = new Questao();
                questao7.pergunta = "qual foi o primeiro jato criado";
                questao7.opcaoA = "A - BF 110";
                questao7.opcaoB = "B - P-51 mostang";
                questao7.opcaoC = "C - Messerschmitt Me 262";
                questao7.opcaoD = "D - Meteror";
                questao7.opcaoE = "E - P-47 tamderbolt";
                questao7.correta = "C";
                questao7.escrevaQuestao();
                respostaUsuario = r.leiaResposta();
                if (questao7.isCorreta(respostaUsuario)) {
                    cont++;
                }
                Questao questao8 = new Questao();
                questao8.pergunta = "Quem é O fundador da apple";
                questao8.opcaoA = "A - Elon musk";
                questao8.opcaoB = "B - Steve Jobs";
                questao8.opcaoC = "C - Alan Turing";
                questao8.opcaoD = "D - Stephen Hawking";
                questao8.opcaoE = "E - Bill Gates";
                questao8.correta = "B";
                questao8.escrevaQuestao();
                respostaUsuario = r.leiaResposta();
                if (questao8.isCorreta(respostaUsuario)) {
                    cont++;
                }
                Questao questao9 = new Questao();
                questao9.pergunta = "maior navio de guerra do ocidente ja criado";
                questao9.opcaoA = "A -Bismark ";
                questao9.opcaoB = "B - Yamato";
                questao9.correta = "A";
                questao9.escrevaQuestao();
                respostaUsuario = r.leiaResposta();
                if (questao9.isCorreta(respostaUsuario)) {
                    cont++;
                }
                Questao questao10 = new Questao();
                questao10.pergunta = "maior navio de guerra oriental";
                questao10.opcaoA = "A - Bismark";
                questao10.opcaoB = "B - Yamato";
                questao10.correta = "B";
                questao10.escrevaQuestao();
                respostaUsuario = r.leiaResposta();
                if (questao10.isCorreta(respostaUsuario)) {
                    cont++;
                }
                Questao questao11 = new Questao();
                questao11.pergunta = "Em assebly o comando mov eax, 4 mov ebx, 1 faz qual açao";
                questao11.opcaoA = "A - dis por onde a mensagem vai sair";
                questao11.opcaoB = "B - dis por onde a mensagem vai entra";
                questao11.opcaoC = "C - dis o tamanho da mensagem";
                questao11.opcaoD = "D - dis a mensagem";
                questao11.opcaoE = "E - nada";
                questao11.correta = "A";
                questao11.escrevaQuestao();
                respostaUsuario = r.leiaResposta();
                if (questao11.isCorreta(respostaUsuario)) {
                    cont++;
                }
                Questao questao12 =new Questao();
                questao12.pergunta = "no comando comando mov eax,3 mov ebx,0 ";
                questao12.opcaoA = "A - dis por onde a mensagem vai sair";
                questao12.opcaoB = "B - por onde vai entra";
                questao12.opcaoC = "C - dis o tamanho da mensagem";
                questao12.opcaoD = "D - dis a mensagem";
                questao12.opcaoE = "E - nada";
                questao12.correta = "B";
                questao12.escrevaQuestao();
                respostaUsuario = r.leiaResposta();
                if (questao12.isCorreta(respostaUsuario)) {
                    cont++;
                }
                Questao questao13= new Questao();
                questao13.pergunta = "o comando tam equ $-msg";
                questao13.opcaoA = "A - dis por onde entra";
                questao13.opcaoB = "B - por onde sai";
                questao13.opcaoC = "C - mede e fala o tamanho da mensagem";
                questao13.opcaoD = "D - dis a mensagem";
                questao13.opcaoE = "E - Bill Gates";
                questao13.correta = "B";
                questao13.escrevaQuestao();
                respostaUsuario = r.leiaResposta();
                if (questao13.isCorreta(respostaUsuario)) {
                    cont++;
                }
                Questao questao14 = new Questao();
                questao14.pergunta = "Quem é O fundador da apple";
                questao14.opcaoA = "A - Elon musk";
                questao14.opcaoB = "B - Steve Jobs";
                questao14.opcaoC = "C - Alan Turing";
                questao14.opcaoD = "D - Stephen Hawking";
                questao14.opcaoE = "E - Bill Gates";
                questao14.correta = "B";
                questao14.escrevaQuestao();
                respostaUsuario = r.leiaResposta();
                if (questao14.isCorreta(respostaUsuario)) {
                    cont++;
                }
                Questao questao15 = new Questao();
                questao15.pergunta = "Quem é O fundador da apple";
                questao15.opcaoA = "A - Elon musk";
                questao15.opcaoB = "B - Steve Jobs";
                questao15.opcaoC = "C - Alan Turing";
                questao15.opcaoD = "D - Stephen Hawking";
                questao15.opcaoE = "E - Bill Gates";
                questao15.correta = "B";
                questao15.escrevaQuestao();
                respostaUsuario = r.leiaResposta();
                if (questao15.isCorreta(respostaUsuario)) {
                    cont++;
                }

                return cont;
            }
        }

