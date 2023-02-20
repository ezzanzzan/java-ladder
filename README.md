# java-ladder

사다리 타기 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

--- 

## 기능 요구사항
- 참여자들
  - [x] 참여자는 이름을 갖는다.
  - [x] 이름은 중복될 수 없다.
  - [x] 참여자는 2명 이상이다.
  
- 참여자 이름
  - [x] 앞 뒤의 공백은 제거한다.
    - [x] 공백이 제거된 이름의 길이는 1이상 5이하이다.
  - [x] 이름에 한글이 들어갈 수 없다.

- 입력
  - [x] 참여자를 입력받을 때 쉼표(,)를 기준으로 이름을 구분한다.

- 사다리
  - [x] 사다리는 높이를 갖는다.
    - 높이
      - [x] 높이는 숫자(자연수)로 입력되어야 한다.
      - [x] 0보다 커야한다.
  - [x] 사다리는 높이만큼 선을 갖는다.

- 선
  - [x] True, False로 이루어진 Boolean List를 갖는다.
  - [x] 참여자의 개수보다 하나 적은 사이즈를 갖는다.
  - [x] 가로 라인이 겹쳐서는 안된다. / 겹칠 수 없다.

- 출력
  - [x] 실행 결과를 출력한다.
  - [x] 사람 이름은 6글자 기준으로 오른쪽 정렬로 출력한다.
  - [x] 사다리의 가로 길이는 5자로 출력한다.

---
## 1단계 미션 PR 이후 리팩토링
- 제어자
  - [x] 인텔리제이 설정 확인하기 (⌥⌘C → ⌥⌘C → private로 선택)
  - [x] Controller의 InputView OutputView는 외부에서 사용하는 필드가 아니므로 private final로 숨겨주기
  - [x] Line 클래스의 random 객체도 해당 클래스 내부에서만 사용되니 수정하기
  - [x] 키워드 정렬 순서 지키기
- 에러 출력 메세지의 위치 고민해보기
  - [x] 동료개발자가 "에러 메세지를 출력할 때 suffix 로 특수문자를 붙여주세요." 라는 요구사항을 접하면 `OutputView.java`와 `LadderGameController.java`중 어떤 파일을 먼저 열어볼까요? 에 대한 고민해보기
    - [x]  OutputView 클래스에 에러 메세지를 받아 출력하는 메서드 생성하기
    - [x]  LadderGameController 클래스에 있는 에러 메세지 outputview.printErrorMessage로 수정
  - [x] 마찬가지로 "사다리 높이에 대한 에러 출력 메세지 포맷을 변경해주세요." 라고 하면 어떤 파일을 먼저 열어볼까요? 에 대한 고민도 해보기
  - [x] LineSymbol Class 오류 메시지 출력하기
- 메서드 네이밍
  - [x] Persons class 의 사이즈 return 해주는 메소드 이름을 ‘크기’ 대신 ‘명’, ‘수’로 변경할 수 있도록 고민하기 .. getSize → ???
- 중복 검증
  - [ ] List와 Set의 특징 알아보기
  - [ ] 중복 검증 시 어떤 컬렌션이 더 잘어울리는지 생각해보기
- stream
  - [ ] OutputView의 printPerosns 메소드 출력 방법을 for문 대신 stream 사용하기
