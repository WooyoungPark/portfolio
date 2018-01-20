package com.Mappers;

/* Mapper interface와 일반 interface의 구분을 위해 Mapper interface에는 @MyMapper 애노테이션을 넣어준다
 * 
 * */


/**
 * <pre> 
 * com.portfolio.dao
 * MyMapper.java
 * [ Description ]
 * 관련 Bean : MapperScannerConfigurer
 * 역할 : Mapper 자동 스캔 기능인 MapperScannerConfigurer를 사용하는데 
 * Bean에서 설정한 패키지의 내의 Interface중에서 @MyMapper 애노테이션이 붙은 
 * Interface만 매퍼라는것을 인지 시키기 위한 Interface 
 * </pre>
 * [ History ]
 * @author	 정동희
 * @Date		 2018. 1. 17. 오후 12:05:31
 * <pre>
 * ---- 수정이력[Name - Date - Description] ----
 * 정동희 - 2018. 1. 17. - 최초생성
 * </pre>
 */
public @interface MyMapper {

}
