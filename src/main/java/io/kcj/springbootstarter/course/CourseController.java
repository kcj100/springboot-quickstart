package io.kcj.springbootstarter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.kcj.springbootstarter.topic.Topic;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping("topics/{topicId}/courses")
	public List<Course> getAllCourse(@PathVariable String topicId) {
		return courseService.getAllCourses(topicId);
	}

	@GetMapping("topics/{topicId}/courses/{courseId}")
	public Course getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}

	@PostMapping("topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
		course.setTopic(new Topic(topicId, "", ""));
		courseService.addCourse(course);
	}

	@PutMapping("topics/{topicId}/courses/{courseId}")
	public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String id) {
		course.setTopic(new Topic(topicId, "", ""));
		courseService.updateCourse(course);
	}
	
	@DeleteMapping("topics/{topicId}/courses/{courseId}")
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}
	
}
