public static void main(String[] args) {
    zov(5);
}
public static void zov(int h) {
    int Slash = h;
    int BackSlash = Slash + 1;
    for (int stroka = 0; stroka < h; stroka++) {
        for (int simvolVStroke = 1; simvolVStroke < 2*h+1; simvolVStroke++) {
            char ch = ' ';
            if (stroka == h-1){
                ch='_';
            }
            if (simvolVStroke == Slash) {
                ch = '/';
            } else if (simvolVStroke == BackSlash) {
                ch = '\\';
            }
            System.out.print(ch);
        }
        System.out.println("");
        Slash--;
        BackSlash++;
    }
}