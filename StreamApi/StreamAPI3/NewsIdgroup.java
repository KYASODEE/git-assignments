package StreamAPI3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
public class NewsIdgroup {
public static void main(String[] args) {
	
NewsId firstNews = new NewsId(1, "Test1", "User1", "Great News on budget" );
NewsId secondNews = new NewsId(1, "Test1", "User2", "wonderful news about Technology" );
NewsId thirdNews = new NewsId(2, "Test2", "User3", "This seems fake budget news" );
NewsId fourthNews = new NewsId(3, "Test3", "User4", "This is so frightening" );
List<NewsId> newsList = new ArrayList<>();
newsList.add(firstNews);
newsList.add(secondNews);
newsList.add(thirdNews);
newsList.add(fourthNews);
//Optional<Object> a = News.stream()
// .max(Comparator.comparing(News::getUser))
// .map(p->p.User);
//System.out.println(a);
System.out.println(newsList.stream()
.collect(Collectors.groupingBy(NewsId::getNewsId)).keySet()); }}

