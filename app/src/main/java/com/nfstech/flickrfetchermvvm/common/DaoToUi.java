package com.nfstech.flickrfetchermvvm.common;

import android.support.annotation.Nullable;

import com.nfstech.flickrfetchermvvm.dao.Photo;
import com.nfstech.flickrfetchermvvm.view.model.PhotoListModel;
public class DaoToUi {

    @Nullable
    public static PhotoListModel toUi(Photo photo) {
        PhotoListModel photoListModel = null;
        if (photo != null) {
            photoListModel = new PhotoListModel();
            photoListModel.setUrl(photo.getPhotoUrl());
            photoListModel.setId(photo.getPhotoId());
        }

        return photoListModel;
    }
}
