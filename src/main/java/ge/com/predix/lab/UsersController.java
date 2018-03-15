package ge.com.predix.lab;

import io.predix.bhge.rest.api.UsersApi;
import io.predix.bhge.rest.model.User;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController implements UsersApi {
	private static final Logger logger = LoggerFactory.getLogger(UsersController.class);

	@Override
	public ResponseEntity<User> getUserById(@ApiParam(value = "The id of the user to retrieve", required = true) @PathVariable("id") Long id) {
		logger.info("Request for user '{}' has been received", id);

		HttpHeaders responseHeaders = new HttpHeaders();

		User user = new User();
		user.setId(id);
		user.setName("User name");
		return new ResponseEntity<>(user, responseHeaders, HttpStatus.FOUND);

	}
}
