package sut.edu.gl.dormitory.manage.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sut.edu.gl.dormitory.manage.entity.LiveEntity;


@RepositoryRestResource(collectionResourceRel = "live", path = "live")
public interface LiveRepository extends PagingAndSortingRepository<LiveEntity, String> {
}
