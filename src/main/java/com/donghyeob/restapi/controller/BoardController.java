package com.donghyeob.restapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.donghyeob.restapi.domain.BoardVO;
import com.donghyeob.restapi.domain.ResultVO;
import com.donghyeob.restapi.persistence.BoardMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class BoardController {
    private final BoardMapper boardMapper;
 
    @PostMapping("/board")
    public ResultVO addBoard(@RequestBody BoardVO boardVO) {
        int result = boardMapper.insertBoard(boardVO);
        if (result > 0) {
            return new ResultVO(0, "success");
        } else {
            return new ResultVO(100, "fail");
        }
    }
    
    @GetMapping("/board/{id}")
    public BoardVO findOne(@PathVariable int id) {
        return boardMapper.findOneBoard(id);
    }
 
    @GetMapping("/boards")
    public List<BoardVO> findAllBoard() { // 결과값이 여러개라서 List<Array>로 받음
        return boardMapper.findBoard();
    }
}
