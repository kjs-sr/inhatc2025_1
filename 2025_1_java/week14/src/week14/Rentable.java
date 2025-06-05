package week14;

public interface Rentable<P> {
	//다양한 제품을 렌트하기 위해
	//리턴 타입을 제네릭 타입으로 선언
	P rent();
}
