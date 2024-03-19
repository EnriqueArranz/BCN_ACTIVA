package cat.itacademy.barcelonactiva.ArranzPuig.Enrique.s05.t01.n01.S05T01N01ArranzPuigEnrique.model.services;

import cat.itacademy.barcelonactiva.ArranzPuig.Enrique.s05.t01.n01.S05T01N01ArranzPuigEnrique.model.dto.BranchOfficeDTO;

import java.util.List;


public interface BranchOfficeService {

    void add(BranchOfficeDTO branchOfficeDTO);
    void update(Integer id, String nameBranchOffice, String CountryBranchOffice);
    void delete(Integer id);

    BranchOfficeDTO getOne(Integer id);

    List<BranchOfficeDTO> getAll();
}
