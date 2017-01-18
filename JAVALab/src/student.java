
public class student {

	public float marksMaths;
	public float marksEnglish;
	public float marksScience;
	public int rollNumber;
	public student(){
		marksMaths=0;
		marksEnglish=0;
		marksScience=0;
		rollNumber=0;
	}
	public student(float marksMaths,float marksEnglish, float marksScience,int rollNumber){
		this.marksEnglish=marksEnglish;
		this.marksMaths=marksMaths;
		this.marksScience=marksScience;
		this.rollNumber=rollNumber;
	}
	public student(student st){
		this.marksMaths=st.marksMaths;
		this.marksEnglish = st.marksEnglish;
		this.marksScience=st.marksScience;
		this.rollNumber=st.rollNumber;
		
	}
	public student(int rollnumber){
	
		this(10,10,10,rollnumber);
		
	}
	public String display(){
		
		return "The Marks Scored by roll number "+rollNumber+" are:\nMaths: "+marksMaths+"\nEnglish: "+marksEnglish+"\nScience: "+marksScience+"\n";
		
		
		
	}
	public float totalMarks(){
		
		return marksMaths+marksEnglish+marksScience;
	}
	public float calculatePercentage(){
		
		return (marksEnglish+marksMaths+marksScience)*100/300;
	}
	
	
	
	
}
