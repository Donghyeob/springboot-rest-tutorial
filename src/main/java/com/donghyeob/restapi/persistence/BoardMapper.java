package com.donghyeob.restapi.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.donghyeob.restapi.domain.BoardVO;
 
@Mapper
public interface BoardMapper {
    @Insert({"<script>", // xml 구문없이 사용하기 위해 <script> 사용
            "INSERT INTO board(title, content)",
            "VALUES(#{title}, #{content})",
            "</script>"})
    int insertBoard(BoardVO boardVO); // 입력을 boardVO 객체로 받고 출력을 int로 return함 성공 1, 실패 0
    
    @Select({"<script>",
        "SELECT * from board",
        "order by id desc",
        "</script>"})
    List<BoardVO> findBoard();

	@Select({"<script>",
        "SELECT * from board",
        "where id = #{id}",
        "</script>"})
	BoardVO findOneBoard(int id);
}