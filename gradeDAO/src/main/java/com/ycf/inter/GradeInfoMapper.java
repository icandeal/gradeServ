package com.ycf.inter;

import com.ycf.GradeInfo;
import com.ycf.GradeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GradeInfoMapper {
    int countByExample(GradeInfoExample example);

    int deleteByExample(GradeInfoExample example);

    int deleteByPrimaryKey(Integer gradeId);

    int insert(GradeInfo record);

    int insertSelective(GradeInfo record);

    List<GradeInfo> selectByExample(GradeInfoExample example);

    GradeInfo selectByPrimaryKey(Integer gradeId);

    int updateByExampleSelective(@Param("record") GradeInfo record, @Param("example") GradeInfoExample example);

    int updateByExample(@Param("record") GradeInfo record, @Param("example") GradeInfoExample example);

    int updateByPrimaryKeySelective(GradeInfo record);

    int updateByPrimaryKey(GradeInfo record);
}