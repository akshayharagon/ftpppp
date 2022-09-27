package bloggApp_apis.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bloggApp_apis.PayloadsOrDTOs.APIResponse;
import bloggApp_apis.PayloadsOrDTOs.CommentDTO;
import bloggApp_apis.Services.CommentService;

@RestController
@RequestMapping("/api/")
public class CommentController {
	
	
	@Autowired
	private CommentService commentService;
	
	@PostMapping("/post/{id}/comments")
	public ResponseEntity<CommentDTO> createComment(@RequestBody CommentDTO commentDTO, @PathVariable int id ){
		CommentDTO createComment = commentService.createComment(commentDTO, id);
		return new ResponseEntity<CommentDTO>(createComment, HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("/post/{pid}/comment/{cid}")
	public ResponseEntity<APIResponse> deleteComment(@PathVariable("pid") int pid,@PathVariable("cid") int cid) {
		commentService.deleteComment(pid, cid);
		return new ResponseEntity<APIResponse>(new APIResponse("Deleted comment Successfully", true), HttpStatus.OK);
	}

}
