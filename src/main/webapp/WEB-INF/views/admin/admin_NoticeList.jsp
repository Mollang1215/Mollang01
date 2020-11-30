<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자_게시판 목록</title>

<!-- 부트스트렙 -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
	crossorigin="anonymous"></script>

<!-- 이미지 파일 -->
<script src="https://kit.fontawesome.com/45fba14eff.js"
	crossorigin="anonymous"></script>

<link rel="stylesheet" href="../css/board/topic_lavel.css">
<link rel="stylesheet" href="../css/board/page.css">

<!-- j Query -->
<script type="text/JavaScript" src="../lib/jquery-3.5.1.js"></script>
<script type="text/JavaScript" src="../lib/jquery-3.5.1.min.js"></script>
<script>
	$(document).ready(function() {
		//공지사항의 높이값
		var height = $(".notice").height();
		//공지사항의 개수를 알아보기
		var num = $(".rolling li").length;

		//총 높이
		var max = height * num;
		//초기 값 설정
		var move = 0;
		function noticeRolling() {
			move += height;

			// animate를 통해서 부드럽게 top 올리기
			$(".rolling").animate({
				"top" : -move
			}, 600, function() {
				//if문을 통해 최대값보다 top가 올라갔다면 0으로 되돌리기
				if (move >= max) {
					$(this).css("top", 0);
					move = 0;
				}
				;
			});
		}
		;
		//자동롤링 setInterval를 사용해서 1000(1초) 마다 함수 실행
		noticeRollingOff = setInterval(noticeRolling, 6000);

		//마지막에 될 경우 clone을 통해 첫 번째 li 복사
		$(".rolling").append($(".rolling li").first().clone());

	});
</script>


<style>
#form-input {
	width: 700px;
	margin-left: 10px;
	margin-right: 10px;
}

#inlineFormCustomSelectPref {
	width: 150px;
	height: 35px;
}

#inlineFormCustomSelectPrefMBTI {
	width: 220px;
}

#BUTTONMO {
	width: 130px;
	height: 40px;
}

#alertsize {
	padding: 8px 10px;
	width: 150px;
	height: 40px;
	margin-right: 10px;
	text-align: center;
}

#alertsizeinput {
	padding: 8px 10px;
	width: 250px;
	height: 40px;
}
</style>


</head>
<body style="border: 5px solid red; margin-bottom: 500px;">

	<div style="border-bottom: 3px solid lightgray;">

		<top style="width:100%"> <jsp:include page="../template/top.jsp" />
		</top>
	</div>

	<div class="container">
		<!-- 게시판 Title -->
		<h2 class="#">관리자</h2>
		<!-- 즐찾과 같은높이로 설정 -->
		<div style="width: 100%; float: none; margin: 20px auto">

			<table class="table table-striped" style="text-align: center;">
				<thead>
					<tr>
						<th >번호</th>
						<th style=" width:650px">글제목</th>
						<th >상태</th>
						<th>작성자</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>1</td>
						<td>하이고 허리야</td>
						<td>머리야</td>
						<td>두야</td>
					</tr>
					<tr>
						<td>2</td>
						<td>Jacob</td>
						<td>Thornton</td>
						<td>@fat</td>
					</tr>
					<tr>
						<td>3</td>
						<td>Larry</td>
						<td>the Bird</td>
						<td>@twitter</td>
					</tr>
				</tbody>
			</table>
		</div>
		</div>	
		<div class="container">
 		<div class="row">
 		<div class="col-sm-12">
			<div class="d-none d-sm-block" >
				<ul class="pagination justify-content-center" >
					<li class="page-item" >
						<a href="#" class="btn btn-secondary">이전</a>
					</li>
					<li class="page-item">
						<a href="#" class="btn btn btn-light">1</a>
					</li>
					<li class="page-item">
						<a href="#" class="btn btn btn-light">2</a>
					</li>
					<li class="page-item">
						<a href="#" class="btn btn btn-light">3</a>
					</li>
					<li class="page-item">
						<a href="#" class="btn btn btn-light">4</a>
					</li>
					<li class="page-item">
						<a href="#" class="btn btn btn-light">5</a>
					</li>
					<li class="page-item">
						<a href="#" class="btn btn btn-light">6</a>
					</li>
					<li class="page-item">
						<a href="#" class="btn btn btn-light">7</a>
					</li>
					<li class="page-item">
						<a href="#" class="btn btn btn-light">8</a>
					</li>
					<li class="page-item">
						<a href="#" class="btn btn btn-light">9</a>
					</li>
					<li class="page-item">
						<a href="#" class="btn btn btn-light">10</a>
					</li>
					<li class="page-item">
						<a href="#" class="btn btn-secondary">다음</a>
					</li>
				</ul>
				</div>
			</div>
			</div>
		</div>
</body>
</html>