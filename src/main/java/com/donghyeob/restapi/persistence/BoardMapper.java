package com.donghyeob.restapi.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.donghyeob.restapi.domain.BoardVO;
 
@Mapper
public interface BoardMapper {
    @Insert({"<script>", // xml �������� ����ϱ� ���� <script> ���
            "INSERT INTO board(title, content)",
            "VALUES(#{title}, #{content})",
            "</script>"})
    int insertBoard(BoardVO boardVO); // �Է��� boardVO ��ü�� �ް� ����� int�� return�� ���� 1, ���� 0
    
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