package com.ycf.impl;

import com.ycf.GradeInfo;
import com.ycf.GradeInfoExample;
import com.ycf.inter.GradeInfoMapper;
import com.ycf.inter.IGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sniper on 16-8-12.
 */

@Service
public class GradeService implements IGradeService{

    @Autowired
    GradeInfoMapper gradeInfoMapper;

    public Integer getGradeCount(){
        List<GradeInfo> list= gradeInfoMapper.selectByExample(null);
        return list.size();
    }
}
