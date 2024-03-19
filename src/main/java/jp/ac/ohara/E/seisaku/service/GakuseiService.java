package jp.ac.ohara.E.seisaku.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import jp.ac.ohara.E.seisaku.model.GakuseiHyou;
import jp.ac.ohara.E.seisaku.repository.GakuseiRepository;
 

@Service
@Transactional
public class  GakuseiService{

    @Autowired
    private GakuseiRepository repository;

    /**
     * 学生一覧の取得
     * @return List<Gakusei>
     */
    public List<GakuseiHyou> getGakuseiList() {
        List<GakuseiHyou> entityList = this.repository.findAll();
        return entityList;
    }

    /**
     * 詳細データの取得
     * @param @NonNull Long index

     */
    public GakuseiHyou get(@NonNull Long index) {
        GakuseiHyou gakusei = this.repository.findById(index).orElse(new GakuseiHyou());
        return gakusei;
    }

    public void save(@NonNull GakuseiHyou gakusei) {
        this.repository.save(gakusei);
    }

    /**
     * アドレス帳データの削除
     * @param @NonNull Long index
     */
    public void delete(@NonNull Long index) {
        this.repository.deleteById(index);
    }
}