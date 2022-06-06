package io.nirahtech.space.simulator.core.models.definitions.features;

import java.io.File;

import io.nirahtech.space.simulator.core.models.definitions.CameraFilter;

public interface Camera {

    File downloadPicture(File picture);

    File takePicture();

    void useCameraFilter(CameraFilter filter);

    void removeCameraFilter(CameraFilter filter);

    File[] listPictures();

    void removePicture(final File picture);
}
