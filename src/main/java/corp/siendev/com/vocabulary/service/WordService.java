package corp.siendev.com.vocabulary.service;

import corp.siendev.com.vocabulary.model.WordEntity;
import corp.siendev.com.vocabulary.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Service for the word repository.
 *
 * @author Golubnichenko Yuriy
 */
@Service
@Transactional
public class WordService {

    @Autowired
    WordRepository wordRepository;

    public List<WordEntity> getAllWords() {
        List<WordEntity> listWord = new ArrayList<>();
        wordRepository.findAll().forEach(listWord::add);

        return listWord;
    }

    public WordEntity getWord(int id) {
        return wordRepository.findOne(id);
    }

    public WordEntity addWord(WordEntity word) {
        if (getWord(word.getId()) != null) {
            return null;
        }
        return wordRepository.save(word);
    }

    public WordEntity updateWord(WordEntity word) {
        if (getWord(word.getId()) != null) {
            return wordRepository.save(word);
        }
        return null;
    }

    public Boolean deleteWord(int id) {
        if (getWord(id) != null) {
            wordRepository.delete(id);
            return true;
        }
        return false;
    }
}
