import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class DojoTest {
	private Dojo dojo = new Dojo();
	
	@Test
	public void list() {
		//given
		
		//when
		List<String> theList = dojo.list();
		
		//then
		assertThat(theList).contains("s1", "s2", "s3");
	}
	
	@Test
	public void map() {
		//given
		
		//when
		Map<String, String> theMap = dojo.map();
		
		//then
		assertThat(theMap).containsEntry("key1", "value1");
		assertThat(theMap).containsEntry("key2", "value2");
		assertThat(theMap).containsEntry("key3", "value3");
	}
	
	@Test
	public void streamIterate() {
		//given
		
		//when
		String str = dojo.streamIterate();
		
		//then
		assertThat(str).isEqualTo("0123456789");
	}
	
	@Test
	public void getChuckNorrisJoke() throws IOException {
		//given
		
		//when
		String joke = dojo.getChuckNorrisJoke();
		
		//then
		assertThat(joke).contains("There are no races, only countries of people Chuck Norris has beaten to different shades of black and blue.");
	}
	
	@Test
	public void nextTenDates() {
		//given
		
		//when
		List<LocalDate> nextTenDates = dojo.nextTenDates();
		
		//then
		assertThat(nextTenDates).size().isEqualTo(10);
	}
	
	@Test
	public void readAllBytes() throws IOException {
		//given
		
		//when
		String fileContent = dojo.readAllBytes();
		
		//then
		assertThat(fileContent).isEqualTo("TOTO\nTATA\nTITI");
	}
	
	@Test
	public void copyOf() throws IOException {
		//given
		List<String> source = new ArrayList<>();
		source.add("s1");
		source.add("s2");
		source.add("s3");
		
		//when
		List<String> copy = dojo.copyOf(source);
		
		//then
		assertThat(copy).size().isEqualTo(3);
	}
	
	@Test
	public void repeat() {
		//given
		
		//when
		String str = dojo.repeate("ah", 3);
		
		//then
		assertThat(str).isEqualTo("ahahah");
	}
	
}
