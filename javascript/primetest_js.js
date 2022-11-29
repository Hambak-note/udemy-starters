/**
 * 
 */
 
 window.onload = function() {
	
	function isNum(val){
  		return !isNaN(val)
	}
	
	function isGivenRange(val){
		if(val > 100 || val < 2){
			return false;
		}
		return true;
	}
	
	function isPrime(val){
		
		for(let i = 2; i < val; i++){
			if(val % i == 0){
				return false;
			} 
		}
		return true;
	}
	
	
	document.getElementById("primebtn").onclick = function() {
		
		let inputText = document.getElementById("su").value;
		
		
		
		if(!isNum(inputText)){
			alert("숫자를 입력해주세요");
			return;
		}
		
		if(!isGivenRange(inputText)){
			alert("주어진 범위의 숫자를 입력해주세요");
			return;
		}
		
		
		document.getElementById("result").innerHTML = "";
		for(let i = 2; i <= inputText; i++){
			if(isPrime(i)){
				document.getElementById("result").innerHTML += "<h3>" + i + " 은(는) 소수입니다.</h3>";		
			}
		}
		
	}
}