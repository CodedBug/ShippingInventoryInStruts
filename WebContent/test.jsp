<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js" integrity="sha256-VazP97ZCwtekAsvgPBSUwPFKdrwD3unUfSGVYrahUqU=" crossorigin="anonymous"></script>
<!-- <script type="text/javascript" src="/js/tabulator/3.4/tabulator.min.js"></script> -->
<script type="text/javascript" src="./staticResources/js/tabulator.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="example-table"></div>
		
		<script src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>
		<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js" integrity="sha256-VazP97ZCwtekAsvgPBSUwPFKdrwD3unUfSGVYrahUqU=" crossorigin="anonymous"></script>
		<!-- <script type="text/javascript" src="/js/tabulator/3.4/tabulator.min.js"></script> -->
		<script type="text/javascript" src="./staticResources/js/tabulator.min.js"></script>
		
		<script type="text/javascript">
			//sample data
			var tabledata = [
			    {id:1, name:"Oli Bob", age:"12", col:"red", dob:"12/08/2017"},
			    {id:2, name:"Mary May", age:"1", col:"blue", dob:"14/05/1982"},
			    {id:3, name:"Christine Lobowski", age:"42", col:"green", dob:"22/05/1982"},
			    {id:4, name:"Brendon Philips", age:"125", col:"orange", dob:"01/08/1980"},
			    {id:5, name:"Margret Marmajuke", age:"16", col:"yellow", dob:"31/01/1999"},
			];

			$("#example-table").tabulator({
			    height:200, // set height of table to enable virtual DOM
			    data:tabledata, //load initial data into table
			    layout:"fitColumns", //fit columns to width of table (optional)
			    columns:[ //Define Table Columns
			        {title:"Name", field:"name", sorter:"string", width:150},
			        {title:"Age", field:"age", sorter:"number", align:"left", formatter:"progress"},
			        {title:"Favourite Color", field:"col", sorter:"string", sortable:false},
			        {title:"Date Of Birth", field:"dob", sorter:"date", align:"center"},
			    ],
			    rowClick:function(e, id, data, row){ //trigger an alert message when the row is clicked
			        alert("Row " + id + " Clicked!!!!");
			    }
			});
		</script>
</body>
</html>