package jp.ac.ohara.E.seisaku.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.ac.ohara.E.seisaku.model.GakuseiHyou;

@Repository
public interface GakuseiRepository  extends JpaRepository<GakuseiHyou, Long>{

}


