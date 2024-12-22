public class Main {
    public static void main(String[] args) {
        QuizStack quizstack = new QuizStack();
        quizstack.push("Merkurius");
        quizstack.push("Venus");
        quizstack.view();
        quizstack.push("Bumi");
        quizstack.push("Mars");
        quizstack.view();
        quizstack.pop();
        quizstack.view();
    }
}

        