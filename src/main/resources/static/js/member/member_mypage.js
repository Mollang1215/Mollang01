/* 변수 생성 */

/* 버튼 정의 */
const mypage_01 = document.querySelector('.mypage_01');
const mypage_02 = document.querySelector('.mypage_02');
const mypage_03 = document.querySelector('.mypage_03');


/* 게시글 on off */
const mypage_selfpage_onoff = document.querySelector('.mypage_selfpage_onoff');
const mypage_selfpage_onoff02 = document.querySelector('.mypage_selfpage_onoff02');
const mypage_selfpage_onoff03 = document.querySelector('.mypage_selfpage_onoff03');


mypage_01.addEventListener('click', () => {
	mypage_selfpage_onoff.classList.toggle('active');
});

mypage_02.addEventListener('click', () => {
	mypage_selfpage_onoff02.classList.toggle('active');
});

mypage_03.addEventListener('click', () => {
	mypage_selfpage_onoff03.classList.toggle('active');
});