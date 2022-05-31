package StreamAPI3;

public class NewsId {

	
		private int newsId;
		private String postedByUser;
		private String commentByUser;
		private String comment;
	public NewsId(int newsId, String postedByUser, String commentByUser, String comment) {
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
		} public int getNewsId() {
		return newsId;
		} public String getPostedByUser() {
		return postedByUser;
		} public String getCommentByUser() {
		return commentByUser;
		} public String getComment() {
		return comment; 
		}
}
		


