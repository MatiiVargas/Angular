package com.portfolio.matias.Service;

import com.portfolio.matias.Entity.Idioma;
import com.portfolio.matias.Interface.IIdiomaService;
import com.portfolio.matias.Repository.IIdiomaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class ImpIdiomaService implements IIdiomaService{
    @Autowired IIdiomaRepository iidiomaRepository;

    @Override
    public List<Idioma> getIdioma() {
        List<Idioma> idioma = iidiomaRepository.findAll();
        return idioma;
    }

    @Override
    public void saveIdioma(Idioma idioma) {
        iidiomaRepository.save(idioma);
    }

    @Override
    public void deleteIdioma(Long id) {
       iidiomaRepository.deleteById(id);
    }

    @Override
    public Idioma findIdioma(Long id) {
        Idioma idioma = iidiomaRepository.findById(id) .orElse(null);
        return idioma;
    }
}
