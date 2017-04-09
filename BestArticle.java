
public class BestArticle extends MapFile {
	public BestArticle() {
		filename="Map_of_USRD_by_best_article_template.svg";
		outputname="Map_of_USRD_by_best_article.svg";
	}
	
	public String getStatistic(StateStats state) {
		return state.GetBest();
	}
}
