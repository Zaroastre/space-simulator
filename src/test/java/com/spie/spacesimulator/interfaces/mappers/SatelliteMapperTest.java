package com.spie.spacesimulator.interfaces.mappers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.spie.spacesimulator.business.models.SatelliteModel;
import com.spie.spacesimulator.infrastructure.enumerations.SatelliteType;
import com.spie.spacesimulator.interfaces.dto.SatelliteDto;

public class SatelliteMapperTest {

    @Before
    public void setup() {
        System.out.println("Hello!");
    }

    @Test
    public void testSatelliteMapperDtoToModel() {
        SatelliteDto dto = new SatelliteDto();
        dto.setName("SAT-TEST-DTO");
        dto.setType(SatelliteType.OBSERVATION);

        SatelliteModel model = SatelliteMapper.mapDtoToModel(dto);
        assertNotNull(model);
        assertEquals(dto.getName(), model.getName());
        assertEquals(dto.getType(), model.getType());
    }

    @After
    public void tearDown() {
        System.out.println("Bye bye!");
    }
}
