package com.spie.spacesimulator.interfaces.mappers;

import com.spie.spacesimulator.business.models.MissionControlCenterModel;
import com.spie.spacesimulator.business.models.SatelliteModel;
import com.spie.spacesimulator.infrastructure.entities.SpaceVehicule;
import com.spie.spacesimulator.interfaces.dto.MissionControlCenterDto;
import com.spie.spacesimulator.interfaces.dto.SatelliteDto;

public class MissionControlCenterMapper {
    public static MissionControlCenterModel mapDtoToModel(MissionControlCenterDto dto) {
        MissionControlCenterModel model = new MissionControlCenterModel(
                dto.getName(),
                dto.getLocation());
        for (SpaceVehicule spaceVehicule : dto.listAllLocalSatellites()) {
            SatelliteDto satelliteDto = (SatelliteDto) spaceVehicule;
            SatelliteModel satelliteModel = SatelliteMapper.mapDtoToModel(satelliteDto);
            model.getSpaceVehicules().add(satelliteModel);
        }
        return model;
    }

    public static MissionControlCenterDto mapModelToDto(MissionControlCenterModel model) {
        MissionControlCenterDto dto = new MissionControlCenterDto();
        dto.setName(model.getName());
        dto.setLocation(model.getLocation());
        for (SpaceVehicule spaceVehicule : model.listAllLocalSatellites()) {
            SatelliteModel satelliteModel = (SatelliteModel) spaceVehicule;
            SatelliteDto satelliteDto = SatelliteMapper.mapModelToDto(satelliteModel);
            dto.getSpaceVehicules().add(satelliteDto);
        }
        return dto;
    }
}
