package com.spie.spacesimulator.interfaces.mappers;

import com.spie.spacesimulator.business.models.SatelliteModel;
import com.spie.spacesimulator.interfaces.dto.SatelliteDto;

public class SatelliteMapper {
    public static SatelliteModel mapDtoToModel(SatelliteDto dto) {
        return new SatelliteModel(dto.getName(), dto.getType());
    }

    public static SatelliteDto mapModelToDto(SatelliteModel model) {
        SatelliteDto dto = new SatelliteDto();
        dto.setName(model.getName());
        dto.setType(model.getType());
        return dto;
    }

}
