package reportHere.util;

import java.util.List;
import java.util.Map;

public class MailJava {
	
	//indica se o formato de texto ser� texto ou html
    public static final String TYPE_TEXT_PLAIN = "text/plain";
    public static final String TYPE_TEXT_HTML = "text/html";
    //indica qual ser� o servidor de email(gmail, hotmail...)         
    private String smtpHostMail;
    //indica a porta de acesso ao servidor
    private String smtpPortMail;
    //indica que a necessidade de autentica��o no servidor(true ou false)
    private String smtpAuth;
    //indica ao servidor que ele est� recebendo uma conex�o segura
    private String smtpStarttls;
    //nome do remetente do email
    private String fromNameMail;
    //email do remetente
    private String userMail;
    //senha do email do remetente
    private String passMail;
    //assunto do email
    private String subjectMail;
    //corpo do email, onde estar� o texto da mensagem
    private String bodyMail;
    //lista com email e nome dos destinat�rios
    private String toMailsUsers;
    
    //lista com email e nome dos destinat�rios da c�pia
    private Map<String, String> toMailsCopia;
    
    //lista contendo os arquivos anexos
    private List<String> fileMails;
    //charset, no caso de html � necess�rio 
    private String charsetMail;
    //tipo do formato da mensagem, texto ou html
    private String typeTextMail;
    
    // campo para o email oculto
    private String emailOculto;
    
    
	public String getSmtpHostMail() {
		return smtpHostMail;
	}
	public void setSmtpHostMail(String smtpHostMail) {
		this.smtpHostMail = smtpHostMail;
	}
	public String getSmtpPortMail() {
		return smtpPortMail;
	}
	public void setSmtpPortMail(String smtpPortMail) {
		this.smtpPortMail = smtpPortMail;
	}
	public String getSmtpAuth() {
		return smtpAuth;
	}
	public void setSmtpAuth(String smtpAuth) {
		this.smtpAuth = smtpAuth;
	}
	public String getSmtpStarttls() {
		return smtpStarttls;
	}
	public void setSmtpStarttls(String smtpStarttls) {
		this.smtpStarttls = smtpStarttls;
	}
	public String getFromNameMail() {
		return fromNameMail;
	}
	public void setFromNameMail(String fromNameMail) {
		this.fromNameMail = fromNameMail;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public String getPassMail() {
		return passMail;
	}
	public void setPassMail(String passMail) {
		this.passMail = passMail;
	}
	public String getSubjectMail() {
		return subjectMail;
	}
	public void setSubjectMail(String subjectMail) {
		this.subjectMail = subjectMail;
	}
	public String getBodyMail() {
		return bodyMail;
	}
	public void setBodyMail(String bodyMail) {
		this.bodyMail = bodyMail;
	}
	public String getToMailsUsers() {
		return toMailsUsers;
	}
	public void setToMailsUsers(String toMailsUsers) {
		this.toMailsUsers = toMailsUsers;
	}
	public List<String> getFileMails() {
		return fileMails;
	}
	public void setFileMails(List<String> fileMails) {
		this.fileMails = fileMails;
	}
	public String getCharsetMail() {
		return charsetMail;
	}
	public void setCharsetMail(String charsetMail) {
		this.charsetMail = charsetMail;
	}
	public String getTypeTextMail() {
		return typeTextMail;
	}
	public void setTypeTextMail(String typeTextMail) {
		this.typeTextMail = typeTextMail;
	}
	public String getEmailOculto() {
		return emailOculto;
	}
	public void setEmailOculto(String emailOculto) {
		this.emailOculto = emailOculto;
	}
	public Map<String, String> getToMailsCopia() {
		return toMailsCopia;
	}
	public void setToMailsCopia(Map<String, String> toMailsCopia) {
		this.toMailsCopia = toMailsCopia;
	}
	
}
