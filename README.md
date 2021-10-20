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
추상 팩토리 패턴은 부품들을 한번에 생성해주는 팩토리 객체의 추상클레스(인터페이스)를 만들어 객체를 생성하는 패턴이다. 추상 팩토리 패턴은 조건에 따라 팩토리 단위의 객체를 바꿔줄 수 있다. 내가 구현한 추상 팩토리는 어플리케이션에서 운영체제에 따라 다른 로직을 가지는 Write 객체와 Delete 객체가 존재한다. 이 부품들을 운영체제들의 팩토리를 만들어 각각의 운영체제에 맞게 인스턴스를 생성해주도록 구성하였다. FactoryInstance에서는 System.getProperty("os.name")을 통해 내 컴퓨터의 os를 받아와 객체를 직접 생성해주는 역할을 한다. 이 때 FactoryInstance안에서 모든 구체적인 팩토리클레스들과 구체적인 제품클레스들을 구현한 이유는 Main에서 런타임에 다른 운영체제에 대한 값을 정의(new MacAppFactory()를 사용)하면 안되기 때문에 그것을 방지하고자 클레스 접근제어자를 default로 하였다.(priavte으로 해도 상관없음)\
\
Composite 패턴\
컴포지트 패턴은 말 그대로 복합체를 다룰 때 객체지향적으로 구조를 만드는 것이다. 보통 트리구조를 만들 때 사용한다. 그래서 자료구조 중 Trie를 사용하여 예시를 만들어 보았다. Trie 자료구조에서 알파벳 소문자만 받는 역할을 하였다. 그래서 만약 대문자를 받게 되면 toLowerCase()메소드를 통해서 소문자로 바꿔주고 값을 insert하거나 search하면 될 것이다. 예시에서의 핵심은 Array를 만들어 자식노드로 이동하는 것이 핵심이다. \
\
2021.10.20\
Visitor 패턴\
방문자 패턴은 객체에서 처리기능을 따로 분리하는 패턴이다. 이 패턴은 처리기능이 상황에 따라 유동적으로 바뀌지만 방문할 객체가 쉽게 변하지 않을 때 사용하면 좋다. 내가 생각한 예시는 롤 게임에서 티어(등급)에 따라서 혜택들이 다르게 제공해주는 것을 바탕으로 만들어보았다. 티어에 따라서 챔피언 스킨을 주는데 이 기능을 visitor로 하고 등급(티어)들을 visitable(elements)들로 만들어보았다. 이 때 visitor에서 오버로딩을 통해 티어에 따라 다른 파라미터를 넣은 이유는 조건에 따라 instanceof를 사용할 경우 처리기능이 늘어남에 따라 똑같은 코드가 불필요하게 늘어나기 때문에 intstanceof 대신 element 객체별로 오버로딩을 하였다. 
