# 사용방법
## localhost:8100/ 입력
- Hello world 출력
-

## localhost:8100/api/test 입력
- 상단 코드 입력시 , name : Hwan, age : 33, phonenumber 010-3392-7642 출력됨.
    - 


### localhost:8100/api/webinsert
- 상단코드 입력시 usernumber : n, name : 50, phone : 50 입력됨
- localhost:8100/api/webinsert?name=[입력한 값]&phone=[입력한값] 으로 동작
- ?뒤에 첫번째 파라메터 값 입력, &로 두 번째 파라메터값 입력으로 동작시킴
- localhost:8100/api/wbinsert?name=Hwan&phone=010-3392-7642 입력시
- {"usernuber":12, "name":"Hwan","phonenumber=010-3392-7642"} 출력 됨.


#### localhost:8100/api/find 입력
- 지금까지 name:"Hwan"이 포함된  모든 값 출력 됨.
