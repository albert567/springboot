package cn.altctrl.springboot.mapper;

import cn.altctrl.springboot.pojo.Project;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProjectMapper {

    @Select("SELECT project_no AS projectNo,project_name AS projectName FROM project")
    List<Project> findAll();
}
