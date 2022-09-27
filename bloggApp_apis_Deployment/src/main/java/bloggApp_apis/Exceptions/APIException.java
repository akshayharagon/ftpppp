package bloggApp_apis.Exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class APIException extends RuntimeException{

	public APIException(String message) {
		super(message);
		
	}

	public APIException() {
		super();
	}

}
