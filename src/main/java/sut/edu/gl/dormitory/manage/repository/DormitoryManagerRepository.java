package sut.edu.gl.dormitory.manage.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sut.edu.gl.dormitory.manage.entity.DormitoryManagerEntity;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = "dormitoryManager", path = "dormitoryManager")
public interface DormitoryManagerRepository extends PagingAndSortingRepository<DormitoryManagerEntity, String> {

    /**
     * 按照宿管编号查询宿管信息
     *
     * @param sn 宿管编号
     * @return 宿管信息
     */
    DormitoryManagerEntity findBySn(String sn);

    /**
     * 按照宿管姓名查询宿管信息
     *
     * @param name 姓名
     * @return 宿管信息
     */
    List<DormitoryManagerEntity> findByName(String name);
}
