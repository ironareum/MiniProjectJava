package kr.co.softsoldesk.beans;

import javax.validation.constraints.NotBlank;

import org.springframework.web.multipart.MultipartFile;

public class ContentBean {
	private int content_idx;
	//유효성 검사
	//NotBlank: Notnull이랑 같음 
	
	@NotBlank
	private String content_subject;
	
	//정적데이터 : multipart
	private MultipartFile upload_file; //브라우저가 보낸 실제 데이터 
	
	@NotBlank
	private String content_text; //long?
	private String content_file; //데이터베이스에 파일이름을 담는다 
	private int content_write_idx;
	private int content_board_idx; //게시판 종류 
	private String content_date;
	
	
	public int getContent_idx() {
		return content_idx;
	}
	public void setContent_idx(int content_idx) {
		this.content_idx = content_idx;
	}
	public String getContent_subject() {
		return content_subject;
	}
	public void setContent_subject(String content_subject) {
		this.content_subject = content_subject;
	}
	public String getContent_text() {
		return content_text;
	}
	public void setContent_text(String content_text) {
		this.content_text = content_text;
	}
	public String getContent_file() {
		return content_file;
	}
	public void setContent_file(String content_file) {
		this.content_file = content_file;
	}
	public int getContent_write_idx() {
		return content_write_idx;
	}
	public void setContent_write_idx(int content_write_idx) {
		this.content_write_idx = content_write_idx;
	}
	public int getContent_board_idx() {
		return content_board_idx;
	}
	public void setContent_board_idx(int content_board_idx) {
		this.content_board_idx = content_board_idx;
	}
	public String getContent_date() {
		return content_date;
	}
	public void setContent_date(String content_date) {
		this.content_date = content_date;
	}
	public MultipartFile getUpload_file() {
		return upload_file;
	}
	public void setUpload_file(MultipartFile upload_file) {
		this.upload_file = upload_file;
	}
	
	
	
}