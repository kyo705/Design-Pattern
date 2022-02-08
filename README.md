# Design-Pattern
올바르게 객체 지향 프로그래밍을 설계하기 위한 방법

2021.10.17\
ProtoType 패턴\
java에서는 프로토타입 객체 설계를 위해 cloneable 인터페이스를 제공해준다.
clonable을 implements하면 clone()메소드를 사용할 수 있는데 이 때 clone()을 통해 복제된 객체의 필드 값 중 reference type 필드값이 있다면 그 값은 깊은 복사가 되지 않아 복사의 원본의 타입을 참조하게
된다. 그래서 reference type을 깊은 복사하기 위해 copy()메소드를 구현할 때 clone() 후에 reference 필드 값을 생성자를 통해 새 객체를 참조하게 만들었다. 따라서 완벽하게 복제품을 만들은 것을 main()에서 확인할 수 있다.

2021.10.18\
Builder 패턴\
빌더 패턴은 사용하고자 하는 객체의 필드값이 많을 경우 Main 함수에서의 가독성을 높이기 위해 Builder객체를 만들어 사용한다. 물론 생성자를 통해 parameter로 값을 전달할 때 주석을 통해 document를 작성할 순 있지만 클린 코드를 만들기 위해서는 코드만으로 사용자가 이해할 수 있게 만들어주는 것이 바람직하다. 그래서 빌더 패턴을 사용하는 것이다.\
\
AbstractFactory 패턴\
추상 팩토리 패턴은 부품들을 한번에 생성해주는 팩토리 객체의 추상클레스(인터페이스)를 만들어 객체를 생성하는 패턴이다. 추상 팩토리 패턴은 조건에 따라 팩토리 단위의 객체를 바꿔줄 수 있다. 내가 구현한 추상 팩토리는 어플리케이션에서 운영체제에 따라 다른 로직을 가지는 Write 객체와 Delete 객체가 존재한다. 이 부품들을 운영체제들의 팩토리를 만들어 각각의 운영체제에 맞게 인스턴스를 생성해주도록 구성하였다. FactoryInstance에서는 System.getProperty("os.name")을 통해 내 컴퓨터의 os를 받아와 객체를 직접 생성해주는 역할을 한다. 이 때 FactoryInstance안에서 모든 구체적인 팩토리클레스들과 구체적인 제품클레스들을 구현하고 접근제어자를 default값으로 한 이유는 Main에서 런타임에 다른 운영체제에 대한 값을 정의(new MacAppFactory()를 사용)하면 안되기 때문에 그것을 방지하고자 이런 방식으로 구현하였다.\
\
Composite 패턴\
컴포지트 패턴은 말 그대로 복합체를 다룰 때 객체지향적으로 구조를 만드는 것이다. 보통 트리구조를 만들 때 사용한다. 그래서 자료구조 중 Trie를 사용하여 예시를 만들어 보았다. Trie 자료구조에서 알파벳 소문자만 받는 역할을 하였다. 그래서 만약 대문자를 받게 되면 toLowerCase()메소드를 통해서 소문자로 바꿔주고 값을 insert하거나 search하면 될 것이다. 예시에서의 핵심은 Array를 만들어 자식노드로 이동하는 것이 핵심이다. \
\
2021.10.20\
Visitor 패턴\
방문자 패턴은 객체에서 처리기능을 따로 분리하는 패턴이다. 이 패턴은 처리기능이 상황에 따라 유동적으로 바뀌지만 방문할 객체가 쉽게 변하지 않을 때 사용하면 좋다. 내가 생각한 예시는 롤 게임에서 티어(등급)에 따라서 혜택들이 다르게 제공해주는 것을 바탕으로 만들어보았다. 티어에 따라서 챔피언 스킨을 주는데 이 기능을 visitor로 하고 등급(티어)들을 visitable(elements)들로 만들어보았다. 이 때 visitor에서 오버로딩을 통해 티어에 따라 다른 파라미터를 넣은 이유는 조건에 따라 instanceof를 사용할 경우 처리기능이 늘어남에 따라 똑같은 코드가 불필요하게 늘어나기 때문에 intstanceof 대신 element 객체별로 오버로딩을 하였다. 이런 방식을 더블 디스패치라 한다.\
\
ChainOfReponsibility 패턴\
책임연쇄 패턴의 핵심은 명령 객체를 수행할 책임객체들을 여러개 나눠서 책임을 분산하는 것이다. 특정 책임객체가 명령객체를 수행하지 못할 경우 다음 책임객체로 넘겨주는 방식인데 책임객체들을 연결시켜줄 메소드를 만드는 것이 핵심이다. 책임객체들은 동적으로 처리가 가능하여 코드상에서 책임객체를 추가하거나 해제하는 것이 가능하다. 자바에서 책임연쇄 패턴을 활용한 예는 try catch문이 있다. 나는 책임연쇄 패턴을 활용하여 게임에서의 공격에 대해 아이템의 방어구에 따라 받는 데미지가 감소하는 것을 구현해보았다. 이 때 데미지가 방어구의 방어력보다 낮다면 데미지는 0이 되고 종료되지만 그것이 아닐 경우 데미지를 방어구만큼 감소시킨 뒤 다른 아이템에게 책임을 넘겨주는 형식으로 로직을 만들어봤다.\
\
2021.10.22\
Observer 패턴\
옵저버 패턴은 관찰하는 객체(Observer)와 변경사항 등을 제공해주는 객체(Publisher)가 있는데 제공 객체가 특정 사항이 변경되었을 때 관련된 모든 관찰객체들에게 특정 정보를 전달하는 패턴이다. 이 패턴의 예시는 유튜브에서 구독을 누르면 구독자는 하나의 옵저버가 되고 특정 영상이 올라오면 제공 객체가 구독자들에게 알람을 전달하는 방식이다. 예시를 만들 때 자바에서 제공해주는 oberser, observable 객체를 이용하려고 하였는데 java 9 이후부터 deprecated 되는 객체라 되어있어서 직접 구현해봤다. 기존 제공되는 객체에서는 observable에서 observer객체를 담을 때 vector로 담았다. 그 이유는 멀티스레딩때 사용을 가능하게 하기 위해서이다. 그리고 다른 제공되는 메소드의 반환 타입 앞에 synchronized가 붙어있는데 이는 멀티스레딩에서 동시에 접근할 우려가 있기 때문에 붙여놓았다. (하지만 synchronized는 속도에 큰 영향을 끼치기 때문에 싱글톤에서 다른 방식을 선호한다. 다음 기회에 더 자세하게 설명할 수 있는 기회가 있기를) 나는 예시를 만들었기 때문에 싱글스레드로 가정하고 vector 대신에 arraylist를 사용하여 옵저버들을 모아두었다. \
\
2021.10.24\
Proxy 패턴\
특정 객체의 가벼운 기능을 대신 처리해주는 객체지향 설계 방식으로 자바에서는 Proxy 클레스를 라이브러리로 제공해준다. Proxy 패턴의 대표적인 예는 바로 AOP이다. AOP란 관점 지향 프로그래밍으로 핵심기능과 서브기능을 나눠 따로 따로 처리하도록 하는 기능인데 이를 구현할 때 Proxy 객체를 통해 처리한다. 프록시 객체는 서브 기능을 자신이 직접 처리하고 핵심 기능은 본 객체를 통해 처리하도록 호출하는 기능이다. (자바에서 제공되는 프록시 클레스는 생성자가 private으로 되어있어 인스턴스를 직접생성하지 않고 매소드를 생성하는 특징이 있다.) 이런 AOP기능을 스프링이 보다 편리하게 사용할 수 있게 제공해준다.\
\
Mediator 패턴\
중재자 패턴은 객체들 간의 서로 데이터를 주고받는 것이 아닌 중재자를 통해 데이터를 주고받는 방식으로 M:N관계(매쉬형)이 아닌 1:1 맵핑으로 바꿔준다. 네트워크 통신에서도 LAN에서 스위치를 둬 통신하는 방식이라 생각할 수 있다. Mediator방식과 Observer 방식이 굉장히 유사하다. 그렇지만 그 두 개 패턴의 차이는 Mediator 방식은 서로가 통신을 주고받는 반면 Observer방식은 Publisher에 의해서만 데이터를 주고 observer는 데이터를 받기만 하는 것이 차이이다.\
\
Strategy 패턴과 State 패턴\
전략패턴과 상태패턴은 인터페이스를 통해 여러 구체적인 상황에 맞는 구현체를 구현하고 사용한다는 것이 공통점이다. 하지만 두 패턴의 차이점은 전략패턴은 클라이언트(Main함수)에서 직접 그 부품을 바꿔 끼우는 방식인 반면 상태패턴인 경우 특정 매소드를 통해 상태를 변화시켜 외부에서는 변화를 시킬 수 없게 해준다는 점이 차이점이다. 보통 전략패턴의 경우 런타임때 한번 정해진 상태가 변경되지 않을 때 사용하고(예를 들면, DBMS를 어떤 것을 사용할 것인지) 상태가 런타임때 빈번히 바뀌는 경우 상태패턴을 사용한다. 두 패턴의 예시는 똑같은 무기로 예시를 들었는데 전략 패턴의 경우 무기 인터페이스를 만든 후 외부에서 접근이 가능한 검, 총의 구현체를 만들었고 Warior 객체에서 무기를 교체하는 매소드를 구현하였다. 이 때 구현 매소드는 parameter를 통한 di로 구현하였다. 반면, 상태 패턴의 경우 무기 인터페이스를 만든것은 같지만 Warior객체 안에서 프라이빗하게 검, 총의 구현체를 만들고 그것을 통해 상태를 변화시키는 방식을 사용했다.\
\
2021.10.27\
Singleton 패턴\
싱글톤 패턴은 인스턴스를 단 한개만 생성하도록 하는 패턴이다. 똑같은 객체를 여러번 반복해서 생성해야하는 경우 Heap 영역에 메모리를 낭비하게 된다. 싱글톤이 사용되는 예시를 보면 스레드풀이나 스프링 ioc컨테이너의 빈객체를 생성할 때 등 종종 사용된다. 하지만 싱글톤의 문제점은 멀티스레드 환경에서 발생된다. 멀티스레드에서 스레드들이 한번에 싱글톤에 접근할 때 동시에 객체를 생성할 수 있게 된다. 이를 방지하기 위해 동기화를 시켜야하는데 이 때 보통 2가지 방법으로 동기화를 시킨다.\
 첫 번째 방법은 synchronized를 통한 멀티스레드 동기화 방식이다. 이 때 synchronized를 메소드에 붙이면 더 넓게 lock이 잡히므로 조건문과 sychronized block을 활용하는 방법이 좋다. 이 때  싱글톤 객체에 volatile를 붙이는데 이는 ram에 데이터를 저장하고 가져오도록 하는 접근 제어 방식이다. 이렇게 하는 이유는 스레드는 기본적으로 캐시를 이용하여 더 빠르게 데이터를 저장하고 접근하도록 하는데 하나의 스레드에서 싱글톤 객체를 생성했는데 이것을 캐쉬에 저장하고 ram에 저장하는 순서를 가진다. 이 때 다른 스레드가 기존의 스레드가 캐시에만 저장되어 있는 시점에 ram에 접근한다면 싱글톤 객체가 없는 것으로 간주하여 또 다른 싱글톤 객체를 생성하게 된다. 그래서 이런 상황을 방지하기 위해 무조건 데이터를 ram에 접근하는 방식을 선택한 것이다. 이것은 멀티스레드에서의 mutual exclusion를 확실시 하게 해주지만 성능적인 측면에서 많이 느리다는 단점이 있다.\
 두 번째 방법은 inner class의 private static을 통한 클레스 초기화 방식이다. 첫번째 방식에서 inner class를 추가하는 방식이다. 이 방식을 통해 실제 싱글톤 매소드가 실행되었을 때 inner class가 초기화 되고 private static 필드가 생성되면서 생성자를 호출하여 객체를 만들게 된다. 이 때 멀티스레드라고 하더라도 jvm에서는 한 스레드가 클레스를 로더할 때 다른 스레드는 클레스를 로더하지 못하는 메커니즘을 가져 thread safety하게 객체를 생성할 수 있다. 이 방식이 가장 바람직한 방식이라고 한다.\
\
2022.02.05\
TempleteMethod 패턴\
템플릿 메소드 패턴을 사용하는 경우는 특정 알고리즘(프로세스)가 정해져 있고 그 세부 내용을 바뀌어 질 수 있는 경우 사용한다. 우선 abstract class를 선언한 뒤 해당 클레스에서 특정 알고리즘을 가지는 메소드를 만든다. 이 때 알고리즘을 나타내는 메소드는 추상 메소드들을 호출하면서 알고리즘을 수행하도록 한다. 그리고 알고리즘 과정에 사용되는 개개의 추상 매소드들은 concrete class를 선언하고 구체화한다. 그 후 main 클레스에서 concrete 객체를 생성 후 알고리즘 수행 메소드를 사용하는 것으로 구체적인 알고리즘을 수행하도록 한다.\
\
FactoryMethod 패턴\
팩토리 메소드 패턴은 객체를 생성할 때 특정한 순서를 가지는 과정이 필요할 때 사용한다. 팩토리 메소드 패턴은 템플릿 메소드 패턴을 사용하는데 템플릿 메소드 패턴의 한 알고리즘 과정의 추상 메소드에 객체를 생성하는 로직을 넣어 객체를 생성하도록 한다. 이 때 특정 객체는 전략패턴을 사용해서 만드는 것이 객체지향적인 설계이기 때문에 인터페이스를 만들고 구체화한 클레스를 만들도록 하였다. \
\
Bridge 패턴\
브릿지 패턴은 객체의 기능과 구현을 분리하는 방식이다. 구현은 인터페이스로 선언 후 상황에 맞게 바꿔 끼우도록(전략 패턴)하고 기능 부분에선 구체화된 구현부를 사용하여 기능을 만든다. 이 때 기능부를 상속받아 기존 기능을 활용하여 새로운 기능을 만들 수 있게 한다. 코드 예시에서는 모스부호를 예시로 들어놨다.
