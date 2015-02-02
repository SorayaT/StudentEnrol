import com.studentenrol.*

class BootStrap {

    def init = { servletContext ->
		def course1=new Course(title:'Interactive Media with Animation',
		department:'Computing',
		description:'"Lorem Ipsum dolor sit amet, ad sea solum brute sensibus, te summo vix, mel reque corpora vulpatate ei"',
		leader:'Joe Jojo',
		code: 'IMA101',
		startDate:new Date('19/01/2015'),
		endDate:new Date('19/01/2020'))
	if(!course1.save()){
		course1.errors.allErrors.each{ error ->
		printIn "An error occured whilst creating course1:${error}"
		}
	}
	}
    def destroy = {
    }
}
