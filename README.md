# Design-Pattern
올바르게 객체 지향 프로그래밍을 설계하기 위한 방법

2021.10.17\
ProtoType 패턴\
java에서는 프로토타입 객체 설계를 위해 cloneable 인터페이스를 제공해준다.
clonable을 implements하면 clone()메소드를 사용할 수 있는데 이 때 clone()을 통해 복제된 객체의 필드 값 중 reference type 필드값이 있다면 그 값은 깊은 복사가 되지 않아 복사의 원본의 타입을 참조하게
된다. 그래서 reference type을 깊은 복사하기 위해 copy()메소드를 구현할 때 clone() 후에 reference 필드 값을 생성자를 통해 새 객체를 참조하게 만들었다. 따라서 완벽하게 복제품을 만들은 것을 main()에서 확인할 수 있다.
