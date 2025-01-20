package himedia.aoptest;

import org.springframework.stereotype.Service;

// 원래는 패키지 제대로 나눠서 분리해야하는데
// 지금은 관련된 특정 지점에 특정 기능을 수행할 수 있도록 만들거라 test 용이라 이렇게하는 거임

@Service
public class ProductService {
	public ProductVo findProduct(String keyword) {
		System.out.println("finding [" + keyword + "] ...");
		
		return new ProductVo(keyword);
	}
}
