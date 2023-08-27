/**
 * JavaScript 모듈화
 *	
 *	함수들을 하나의 모듈처럼 묶음으로 구성하는 것을 의미한다.
 *	화면 내에서 JavaScript를 처리하다보면 이벤트 처리, DOM, Ajax 처리 등
 *	복잡하게 섞여서 유지보수가 힘들다. 따라서 JavaScript 코드를 여러 부품으로 분리하여 조립하는 형식으로 설계한다.
 *
 * parse => JSON을 javascrit Object로 만들어줌
 * stringify => javascript Object을 전달했을떄 JSON으로 만들어줌
 */
 

	console.log("Reply Module.......");
	
	let replyService = (function(){
	
	// 추가하기
		function add(reply, callback) {
			console.log("add reply.......");
			
			$.ajax({
				url: "/replies/new",
				type:"post",
				data: JSON.stringify(reply),
				contentType: "application/json; charset=utf-8",
				success: function(result) {
					if(callback) {
						callback(result);
					}
				}	
			});
		}
		
		return{add:add}
	})();