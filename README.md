### Human-Tracking Robot ###

###### 휴먼 트래킹을 위한 자율 주행 자동차 제작 및 소프트웨어 구현 ######

***

<center><img src="https://user-images.githubusercontent.com/48851895/122412858-e2c27f80-cfc0-11eb-918c-3d76da6aaa9f.png" width="300" height="300"></center>




##### 프로젝트 배경 #####

구글의 웨이모와 테슬라, 애플까지 자율 주행에 대해 앞다투어 연구하고 있고, 우리나라 역시 2018년 과학기술정보통신부에서 4차 산업혁명 대응 우선 추진 분야로 자율 주행차를 선정하였다.

이에 각광받는 자율주행기술을 실생활에 밀접한 기술로 확장하고자했다.


![image](https://user-images.githubusercontent.com/48851895/122413504-63817b80-cfc1-11eb-92b7-bce9c1036e66.png)



그리하여 자율 주행 기능에 휴먼 트랙킹 기술을 결합하여 사람을 따라가는 로봇을 만들어 스마트 장바구니, 범죄자 감시 시스템, 노인 돌봄 로봇, 안심 귀가 로봇 등 다양하게 활용 가능하도록 구현하고자 하였다.

***

##### 프로젝트 목표 #####

- 카메라를 이용해 사람을 인식한다.
- 인식된 사람의 위치를 파악하여 주행한다.
- 와이파이 신호로 사람과의 거리를 파악하여 일정 거리를 유지한다.
- 안드로이드 디바이스로 로봇과 통신한다.

***

##### 프로젝트 설계 #####


![image](https://user-images.githubusercontent.com/48851895/122413562-6f6d3d80-cfc1-11eb-87d9-14f657c7ed72.png)


***

##### 하드웨어 구조 #####

![image](https://user-images.githubusercontent.com/48851895/122439808-ed880f00-cfd6-11eb-947e-e7d19616e507.png)
- Nvidia TX2를 메인보드로 하여 장착
- usb 허브에는 4개의 아두이노 보드가 연결됨.
   - 각각의 아두이노는 전자 변속기, 초음파 센서, 피에조 부저를 제어함.


***

##### 소프트웨어 구조 #####

![image](https://user-images.githubusercontent.com/48851895/122440262-5a030e00-cfd7-11eb-976e-291bffd1ea3b.png)


- human tracking에서 중심이 되는 






<img src="C:\Users\오딧세이33\Desktop\황제 펭귄\media\메인.jpg" alt="메인" style="zoom: 33%;" />
