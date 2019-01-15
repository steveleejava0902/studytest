
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%! 
class gugudan1 {



	public String[] printGuguAtoB(int i, int j) {
		// TODO Auto-generated method stub
		
		String[] gugustr = new String[100];
		int cnt = 0;
		for(; i <= j; i++) {
			for(int a=1; a <= 9; a++) {
				gugustr[cnt] = i + " * " + a + " = " + i * a;
				cnt++;
			}
		}
		return gugustr;
		
	}
	
	

}
%>


<html>

<% 

	
	gugudan1 gu1 = new gugudan1();
	int a = Integer.parseInt(request.getParameter("a"));
	int b = Integer.parseInt(request.getParameter("b"));
	int c = (b - a + 1) * 9;
	String[] gugustrget = new String[c];
	gugustrget = gu1.printGuguAtoB(a,b);

%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>



	<table style="border: 1px solid ">
<%
	for(int x = 0; x < c; x++){
		System.out.println(gugustrget[x]);

%>
		<tr style="border: 1px solid ">
			<td style="border: 1px solid ">
			<%=gugustrget[x] %>
			</td>

		</tr>
<%
	}
%>


	</table>



</body>
</html>