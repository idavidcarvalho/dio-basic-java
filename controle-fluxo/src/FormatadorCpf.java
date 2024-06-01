public class FormatadorCpf {
    public static void main(String[] args) {
        try {
            String cpfFormatado = formatarCpf("1111111111");
            System.out.println(cpfFormatado);
        } catch (CpfInvalidoException e) {
            System.out.println("O cpf digitado não possui 11 digitos");
        }
    }


    static  String formatarCpf (String cpf) throws CpfInvalidoException {
        if(cpf.length() !=11) 
            throw new CpfInvalidoException();
        
        //Simulção de cpf formatado
        return "123.456.789-00";
    }
}
