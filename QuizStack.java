
public class QuizStack{
    String ar[] = new String[5];
    int top =-1;

    boolean isEmpty() {
        return top==-1;
    }
    boolean isFull() {
        return top==ar.length;
    }
    public void push(String Judul) {
        if(!isFull()){
            top++;
            ar[top] = Judul;
            System.out.println("Nama Planet "+Judul+" Berhasil Di Push");
        }else {
            System.out.println("Stack Penuh");
        }
    }
    public void pop() {
        if(!isEmpty()) {
            int indextPop = top;
            top--;
            System.out.println("Stack Indext "+indextPop+" Berhasil dipop ");
        }else{
            System.out.println("Stack Kosong");
        }
    }
    public void view() {
        if(!isEmpty()) {
            System.out.print("Isi Stack Sekarang : ");
            for (int i=0; i<=top; i++){
                System.out.print(ar[i]+" ");
            }
            System.out.println(" ");
        }else{
            System.out.println("Stack Kosong");
        }
    }
}

