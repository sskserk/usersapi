package ge.com.predix.lab;


import io.predix.bhge.rest.api.DefaultApi;
import io.predix.bhge.rest.model.IndexPage;
import io.predix.bhge.rest.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController implements DefaultApi {
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);


	@Override
	public ResponseEntity<IndexPage> index() {
		logger.info("Request for Index page has been received");

		HttpHeaders responseHeaders = new HttpHeaders();

		IndexPage indexPage = new IndexPage();
		indexPage.setName("IndexPage");
		return new ResponseEntity<>(indexPage, responseHeaders, HttpStatus.FOUND);
	}
}
