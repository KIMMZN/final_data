package com.main.repository;

import com.main.vo.memberVO;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class memberDaoImpl implements IFmemberdao {

    @Autowired
    SqlSession sqlSession;
    private static String Query ="com.main.vo.memberVO";

    @Override
    public void insertMember(memberVO membervo) throws Exception {
        System.out.println("ugyuguguyguyg");
        sqlSession.insert(Query+".insertOne", membervo );

    }


}
