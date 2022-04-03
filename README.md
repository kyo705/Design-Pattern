# 디자인 패턴
올바르게 객체 지향 프로그래밍을 설계하기 위한 방법

-----------------------
## 1. 생성 패턴

### [1. Singleton Pattern](https://github.com/kyo705/Design-Pattern/blob/master/%EC%83%9D%EC%84%B1%20%ED%8C%A8%ED%84%B4/%EC%8B%B1%EA%B8%80%ED%86%A4%20%ED%8C%A8%ED%84%B4.md#singleton-%ED%8C%A8%ED%84%B4)  
### [2. ProtoType Pattern](https://github.com/kyo705/Design-Pattern/blob/master/%EC%83%9D%EC%84%B1%20%ED%8C%A8%ED%84%B4/%ED%94%84%EB%A1%9C%ED%86%A0%ED%83%80%EC%9E%85%20%ED%8C%A8%ED%84%B4.md#prototype-%ED%8C%A8%ED%84%B4)   
### [3. AbstractFactory Pattern](https://github.com/kyo705/Design-Pattern/blob/master/%EC%83%9D%EC%84%B1%20%ED%8C%A8%ED%84%B4/%EC%B6%94%EC%83%81%20%ED%8C%A9%ED%86%A0%EB%A6%AC%20%ED%8C%A8%ED%84%B4.md#abstractfactory-%ED%8C%A8%ED%84%B4)      
### [4. Builder Pattern](https://github.com/kyo705/Design-Pattern/blob/master/%EC%83%9D%EC%84%B1%20%ED%8C%A8%ED%84%B4/%EB%B9%8C%EB%8D%94%20%ED%8C%A8%ED%84%B4.md#builder-%ED%8C%A8%ED%84%B4)   
### [5. FactoryMethod Pattern](https://github.com/kyo705/Design-Pattern/blob/master/%EC%83%9D%EC%84%B1%20%ED%8C%A8%ED%84%B4/%ED%8C%A9%ED%86%A0%EB%A6%AC%20%EB%A9%94%EC%86%8C%EB%93%9C%20%ED%8C%A8%ED%84%B4.md#factorymethod-%ED%8C%A8%ED%84%B4)   
-----------------------
## 2. 구조 패턴

### [1. Adapter Pattern](https://github.com/kyo705/Design-Pattern/blob/master/%EA%B5%AC%EC%A1%B0%20%ED%8C%A8%ED%84%B4/%EC%96%B4%EB%8C%91%ED%84%B0%20%ED%8C%A8%ED%84%B4.md#adapter-%ED%8C%A8%ED%84%B4)   
### [2. Composite Pattern](https://github.com/kyo705/Design-Pattern/blob/master/%EA%B5%AC%EC%A1%B0%20%ED%8C%A8%ED%84%B4/%EC%BB%B4%ED%8F%AC%EC%A7%80%ED%8A%B8%20%ED%8C%A8%ED%84%B4.md#composite-%ED%8C%A8%ED%84%B4)   
### [3. Bridge Pattern](https://github.com/kyo705/Design-Pattern/blob/master/%EA%B5%AC%EC%A1%B0%20%ED%8C%A8%ED%84%B4/%EB%B8%8C%EB%A6%BF%EC%A7%80%20%ED%8C%A8%ED%84%B4.md#bridge-%ED%8C%A8%ED%84%B4)   
### [4. Decorator Pattern](https://github.com/kyo705/Design-Pattern/blob/master/%EA%B5%AC%EC%A1%B0%20%ED%8C%A8%ED%84%B4/%EB%8D%B0%EC%BD%94%EB%A0%88%EC%9D%B4%ED%84%B0%20%ED%8C%A8%ED%84%B4.md#decorator-%ED%8C%A8%ED%84%B4)   
### [5. Facade Pattern](https://github.com/kyo705/Design-Pattern/blob/master/%EA%B5%AC%EC%A1%B0%20%ED%8C%A8%ED%84%B4/%ED%8D%BC%EC%82%AC%EB%93%9C%20%ED%8C%A8%ED%84%B4.md#facade-%ED%8C%A8%ED%84%B4)   
### [6. Flyweight Pattern](https://github.com/kyo705/Design-Pattern/blob/master/%EA%B5%AC%EC%A1%B0%20%ED%8C%A8%ED%84%B4/%ED%94%8C%EB%9D%BC%EC%9D%B4%EC%9B%A8%EC%9D%B4%ED%8A%B8%20%ED%8C%A8%ED%84%B4.md#flyweight-%ED%8C%A8%ED%84%B4)   
### [7. Proxy Pattern](https://github.com/kyo705/Design-Pattern/blob/master/%EA%B5%AC%EC%A1%B0%20%ED%8C%A8%ED%84%B4/%ED%94%84%EB%A1%9D%EC%8B%9C%20%ED%8C%A8%ED%84%B4.md#proxy-%ED%8C%A8%ED%84%B4)   

-----------------------
## 3. 행위 패턴
### [1. Template method Pattern]()
### [2. Interpreter Pattern]()
### [3. Iterator Pattern]()
### [4. Observer Pattern]()
### [5. Strategy Pattern]()
### [6. Visitor Pattern]()
### [7. Chain of responsibility Pattern]()
### [8. Command Pattern]()
### [9. Mediator Pattern]()
### [10. State Pattern]()
### [11. Memento Pattern]()
-----------------------------------------


## Visitor 패턴
방문자 패턴은 객체에서 처리기능을 따로 분리하는 패턴이다. 이 패턴은 처리기능이 상황에 따라 유동적으로 바뀌지만 방문할 객체가 쉽게 변하지 않을 때 사용하면 좋다. 내가 생각한 예시는 롤 게임에서 티어(등급)에 따라서 혜택들이 다르게 제공해주는 것을 바탕으로 만들어보았다. 티어에 따라서 챔피언 스킨을 주는데 이 기능을 visitor로 하고 등급(티어)들을 visitable(elements)들로 만들어보았다. 이 때 visitor에서 오버로딩을 통해 티어에 따라 다른 파라미터를 넣은 이유는 조건에 따라 instanceof를 사용할 경우 처리기능이 늘어남에 따라 똑같은 코드가 불필요하게 늘어나기 때문에 intstanceof 대신 element 객체별로 오버로딩을 하였다. 이런 방식을 더블 디스패치라 한다.

## ChainOfReponsibility 패턴
책임연쇄 패턴의 핵심은 명령 객체를 수행할 책임객체들을 여러개 나눠서 책임을 분산하는 것이다. 특정 책임객체가 명령객체를 수행하지 못할 경우 다음 책임객체로 넘겨주는 방식인데 책임객체들을 연결시켜줄 메소드를 만드는 것이 핵심이다. 책임객체들은 동적으로 처리가 가능하여 코드상에서 책임객체를 추가하거나 해제하는 것이 가능하다. 자바에서 책임연쇄 패턴을 활용한 예는 try catch문이 있다. 나는 책임연쇄 패턴을 활용하여 게임에서의 공격에 대해 아이템의 방어구에 따라 받는 데미지가 감소하는 것을 구현해보았다. 이 때 데미지가 방어구의 방어력보다 낮다면 데미지는 0이 되고 종료되지만 그것이 아닐 경우 데미지를 방어구만큼 감소시킨 뒤 다른 아이템에게 책임을 넘겨주는 형식으로 로직을 만들어봤다.

## Observer 패턴
옵저버 패턴은 관찰하는 객체(Observer)와 변경사항 등을 제공해주는 객체(Publisher)가 있는데 제공 객체가 특정 사항이 변경되었을 때 관련된 모든 관찰객체들에게 특정 정보를 전달하는 패턴이다. 이 패턴의 예시는 유튜브에서 구독을 누르면 구독자는 하나의 옵저버가 되고 특정 영상이 올라오면 제공 객체가 구독자들에게 알람을 전달하는 방식이다. 예시를 만들 때 자바에서 제공해주는 oberser, observable 객체를 이용하려고 하였는데 java 9 이후부터 deprecated 되는 객체라 되어있어서 직접 구현해봤다. 기존 제공되는 객체에서는 observable에서 observer객체를 담을 때 vector로 담았다. 그 이유는 멀티스레딩때 사용을 가능하게 하기 위해서이다. 그리고 다른 제공되는 메소드의 반환 타입 앞에 synchronized가 붙어있는데 이는 멀티스레딩에서 동시에 접근할 우려가 있기 때문에 붙여놓았다. (하지만 synchronized는 속도에 큰 영향을 끼치기 때문에 싱글톤에서 다른 방식을 선호한다. 다음 기회에 더 자세하게 설명할 수 있는 기회가 있기를) 나는 예시를 만들었기 때문에 싱글스레드로 가정하고 vector 대신에 arraylist를 사용하여 옵저버들을 모아두었다.

## Mediator 패턴
중재자 패턴은 객체들 간의 서로 데이터를 주고받는 것이 아닌 중재자를 통해 데이터를 주고받는 방식으로 M:N관계(매쉬형)이 아닌 1:1 맵핑으로 바꿔준다. 네트워크 통신에서도 LAN에서 스위치를 둬 통신하는 방식이라 생각할 수 있다. Mediator방식과 Observer 방식이 굉장히 유사하다. 그렇지만 그 두 개 패턴의 차이는 Mediator 방식은 서로가 통신을 주고받는 반면 Observer방식은 Publisher에 의해서만 데이터를 주고 observer는 데이터를 받기만 하는 것이 차이이다.

## Strategy 패턴과 State 패턴
전략패턴과 상태패턴은 인터페이스를 통해 여러 구체적인 상황에 맞는 구현체를 구현하고 사용한다는 것이 공통점이다. 하지만 두 패턴의 차이점은 전략패턴은 클라이언트(Main함수)에서 직접 그 부품을 바꿔 끼우는 방식인 반면 상태패턴인 경우 특정 매소드를 통해 상태를 변화시켜 외부에서는 변화를 시킬 수 없게 해준다는 점이 차이점이다. 보통 전략패턴의 경우 런타임때 한번 정해진 상태가 변경되지 않을 때 사용하고(예를 들면, DBMS를 어떤 것을 사용할 것인지) 상태가 런타임때 빈번히 바뀌는 경우 상태패턴을 사용한다. 두 패턴의 예시는 똑같은 무기로 예시를 들었는데 전략 패턴의 경우 무기 인터페이스를 만든 후 외부에서 접근이 가능한 검, 총의 구현체를 만들었고 Warior 객체에서 무기를 교체하는 매소드를 구현하였다. 이 때 구현 매소드는 parameter를 통한 di로 구현하였다. 반면, 상태 패턴의 경우 무기 인터페이스를 만든것은 같지만 Warior객체 안에서 프라이빗하게 검, 총의 구현체를 만들고 그것을 통해 상태를 변화시키는 방식을 사용했다.

## TempleteMethod 패턴
템플릿 메소드 패턴을 사용하는 경우는 특정 알고리즘(프로세스)가 정해져 있고 그 세부 내용을 바뀌어 질 수 있는 경우 사용한다. 우선 abstract class를 선언한 뒤 해당 클레스에서 특정 알고리즘을 가지는 메소드를 만든다. 이 때 알고리즘을 나타내는 메소드는 추상 메소드들을 호출하면서 알고리즘을 수행하도록 한다. 그리고 알고리즘 과정에 사용되는 개개의 추상 매소드들은 concrete class를 선언하고 구체화한다. 그 후 main 클레스에서 concrete 객체를 생성 후 알고리즘 수행 메소드를 사용하는 것으로 구체적인 알고리즘을 수행하도록 한다.
