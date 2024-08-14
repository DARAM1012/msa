// insert:Create : 회원가입, 게시글쓰기, 리뷰쓰기
// form input 데이터 최소한의 암호가, 보안
// 주소창에 데이터가 노출되지 않습니다.
<form method="post" action=""></form>

//select : Read : 게시물목록, 검색결과, 회원정보
//주소창에 검색하고자 하는 키워드 : 제목 구인
//select * from board where title like '%구인%';
<form method="get" action=""></form>

// U : update 데이터수정, 방식 post : 수정에 관련된 업무 처리위해서 patch, update
<form method="patch" action=""></form>

// D : delete 데이터삭제, 게시글삭제, 리뷰삭제, 회원탈퇴(??)
<form method="delete" action=""></form>