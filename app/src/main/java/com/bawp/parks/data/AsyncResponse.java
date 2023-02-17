package com.bawp.parks.data;

import com.bawp.parks.model.Park;

import java.util.List;

public interface AsyncResponse {
    void processPark(List<Park> parks);
}
