package com.nfstech.flickrfetchermvvm.common;

public interface ResultCallbackListener<R, E> {
    void onSuccess(R response);

    void onFailure(E error);
}
