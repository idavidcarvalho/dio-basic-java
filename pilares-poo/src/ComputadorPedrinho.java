public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smsg = null;
		
		
		String apilactivoEscolhido="wtp";

		if(apilactivoEscolhido.equals("msn")){
			smsg = new MSNMessenger();
		}
		else if(apilactivoEscolhido.equals("tlg")){
			smsg = new Telegram();
		}
		else if(apilactivoEscolhido.equals("wtp")){
			smsg = new Whatsapp();
		}

		smsg.enviarMensagem();
		smsg.receberMensagem();


	}
}	