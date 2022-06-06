package io.nirahtech.space.simulator.core.commanding;

import io.nirahtech.space.simulator.core.models.definitions.CameraFilter;
import io.nirahtech.space.simulator.core.models.definitions.CommandResult;
import io.nirahtech.space.simulator.core.models.definitions.MaterialCameraFilter;
import io.nirahtech.space.simulator.core.models.definitions.MeteorologicalCameraFilter;
import io.nirahtech.space.simulator.core.models.definitions.ObservationSpacecraft;
import io.nirahtech.space.simulator.core.models.definitions.ReliefCameraFilter;
import io.nirahtech.space.simulator.core.models.definitions.ThermicalCameraFilter;
import io.nirahtech.space.simulator.infrastructure.enumerations.CameraFilterType;

public class UseCameraFilterCommand extends AbstractCommand {

    private final CameraFilterType filterType;

    public UseCameraFilterCommand(ObservationSpacecraft spacecraft, String fromMCC, String toSpacecraft,
            CameraFilterType filterType) {
        super(spacecraft, fromMCC, toSpacecraft);
        this.filterType = filterType;
    }

    @Override
    public CommandResult execute() {
        CameraFilter filterToApply = null;
        switch (this.filterType) {
            case MATERIAL_FILTER:
                filterToApply = new MaterialCameraFilter();
                break;
            case METEOROLOGICAL_FILTER:
                filterToApply = new MeteorologicalCameraFilter();
                break;
            case RELIEF_FILTER:
                filterToApply = new ReliefCameraFilter();
                break;
            case THERMICAL_FILTER:
                filterToApply = new ThermicalCameraFilter();
                break;

            default:
                break;
        }
        this.spacecraft.useCameraFilter(filterToApply);
        return null;
    }

}
