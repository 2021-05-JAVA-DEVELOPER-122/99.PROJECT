
1.Service클래스 작성(작성기준 Dao당하나씩서비스클래스작성)
----------------------------------------------------------
       - 단위업무주석기술
       ex>	MemberService.java
  		OrderService.java
  		BoardService.java
  		ProductService.java

2.요구사항명세표,화면정의서에있는 업무를 참고해서 주석으로 기능을정의	
------------------------------------------------------
  	ex>	public class MemberService{
	      private MemberDao memberDao;
		  private ProductDao productDao;
		  public MemberService(){
		  	memberDao=new MemberDao();
			productDao=new ProductDao();
		  }			
		  /****************************
		   번호,이름,나이,연락처를 입력하여 회원 추가한다.
		   ***************************/
		  
		  /*****************************
		   이름을 입력하여 검색한다.
		   ****************************/
		 
		  /*****************************
		   번호을 입력하여 검색한다.
		   ****************************/
		  
		  /*****************************
		   전체회원을 출력한다.
		   ****************************/

		  /*****************************
		    회원 번호를 입력하여 회원을 삭제한다.
		   ****************************/
        }

3.화면정의서에있는 기능을정의한 주석을보고 메쏘드원형정의(인자,리턴타입)	
 -----------------------------------------------------------------------
		public class MemberService{
			  /****************************
			   번호,이름,나이,연락처를 입력하여 회원 추가한다.
			  ****************************/
			  public void addMember(Member addMember){}
			  /*****************************
			   이름을 입력하여 검색한다.
			  *****************************/
			  public ArrayList<Member> findByName(String name){}
			  /*****************************
			   번호을 입력하여 검색한다.
			  *****************************/
			  public Member findByNo(int no){}
			  /*****************************
			   전체회원을 출력한다.
			   회원 번호를 입력하여 회원을 삭제한다.
			   기능선택 취소 가능하다
			   메인메뉴로 이동한다.
			   *****************************/		
	    }

4. 메쏘드원형을 Dao객체의메쏘드를 호출해서구현	
----------------------------------------------
		public class MemberService{
		   private MemberDao memberDao;	
		   private ProductDao productDao;
           	   public MemberService(){
                   	memberDao=new MemberDao();
			productDao=new ProductDao();
		   }
		  /****************************
		   번호,이름,나이,연락처를 입력하여 회원 추가한다.
		  ****************************/
		  public void addMember(Member addMember){
				
		   }
		  /*****************************
		   이름을 입력하여 검색한다.
		  *****************************/
		  public ArrayList<Member> findByName(String name){
		  
		  }
		  /*****************************
		   번호을 입력하여 검색한다.
		  *****************************/
		  public Member findByNo(int no){
		  
		  }
		  /*****************************
		   전체회원을 출력한다.
		   회원 번호를 입력하여 회원을 삭제한다.
		   기능선택 취소 가능하다
		   메인메뉴로 이동한다.
		   *****************************/		
	        }

5.jsp파일에서 Service를 이용한테스트
----------------------------------------------
    ex> member_insert_action.jsp 작성
	
		<%
           MemberService memberService=new MemberService();
           memberService.insert();
		   response.sendRedirect("main.jsp");
		   return;
		%>

 
    ex> xxx_list.jsp 작성
		  <ol>
			  <li>1,KIM,서울,123-9090</li>
			  <li>2,GIM,부산,123-9090</li>
			  <li>3,LIM,대구,123-9090</li>	
		  </ol> 	
    ex> xxx_insert_form.jsp 작성
        	<form>
			id:<input type="text" name="id"/><br/>
			name:<input type="text" name="name"/><br/>
			pass:<input type="text" name="pass"/><br/>
			email:<input type="text" name="email"/><br/>
			<input type="submit" value="가입"/><br/>
		</form>
   	
 
