package com.ycf;

import com.ycf.inter.IGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by sniper on 16-8-12.
 */
@Component
public class GradeAPIImpl implements GradeAPI{

    @Autowired
    IGradeService gradeService;

    public Integer getGradeCount(){
        return gradeService.getGradeCount();
    }
}
