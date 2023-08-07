package com.example.Collection.Service;

import com.example.Collection.Model.DictionaryDocument;
import com.example.Collection.Repository.DictionaryRepository;
import com.example.Collection.dto.DirectoryDataDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DictionaryDocumentServiceImpl implements DictionaryDocumentService {
    private final DictionaryRepository dictionaryRepository;

    @Override
    public DictionaryDocument create(DictionaryDocument dictionaryDocument) {
        dictionaryRepository.insert(dictionaryDocument).getId();
        String dictionaryId = dictionaryDocument.getId();
        for (int i = 0; i < dictionaryDocument.getData().size(); i++) {
            if(!dictionaryDocument.getData().get(i).containsKey("dictionaryId")){
               dictionaryDocument.getData().get(i).put("dictionaryId", dictionaryId);
            }
        }
        return dictionaryRepository.save(dictionaryDocument);
    }

    @Override
    public void delete(String id) {
        dictionaryRepository.deleteById(id);
    }

    @Override
    public List<DictionaryDocument> listAll() {
        return dictionaryRepository.findAll();
    }

    @Override
    public DictionaryDocument findById(String id) {
        return dictionaryRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public DictionaryDocument addData(DirectoryDataDto dto) {
        DictionaryDocument document = findById(dto.getDictionaryId());
        document.getData().add(dto.getData());
        return dictionaryRepository.save(document);
    }

    @Override
    public DictionaryDocument deleteData(String id, String dataId) {
        DictionaryDocument document = dictionaryRepository.findById(id)
                .orElseThrow(IllegalArgumentException::new);
        for (int i = 0; i < document.getData().size(); i++) {
            if(document.getData().get(i).get("dataId") == dataId) {
                document.getData().get(i).clear();
            }else {
                throw new RuntimeException("Wrong data's id");
            }
        }
        return dictionaryRepository.save(document);
    }

    @Override
    public DictionaryDocument updateData(DirectoryDataDto dto) {
        DictionaryDocument document = dictionaryRepository.findById(dto.getDictionaryId())
                .orElseThrow(IllegalArgumentException::new);
        for (int i = 0; i < document.getData().size(); i++) {
            if(document.getData().get(i).get("dataId") == dto.getDataId()) {
                deleteData(dto.getDictionaryId(), dto.getDataId());
                document.getData().add(dto.getData());
            }
        }
        return dictionaryRepository.save(document);
    }
}
