package sut.edu.gl.dormitory.manage.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sut.edu.gl.dormitory.manage.entity.DormitoryEntity;


@RepositoryRestResource(collectionResourceRel = "dormitory", path = "dormitory")
public interface DormitoryRepository extends PagingAndSortingRepository<DormitoryEntity, String> {

    /**
     * 按照宿舍编号查询宿舍信息
     *
     * @param sn 宿舍编号
     * @return 宿舍信息
     */
    DormitoryEntity findBySn(String sn);
}
