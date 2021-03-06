package com.urswolfer.gerrit.client.rest.http.changes;

import com.google.gerrit.extensions.api.changes.IncludedInInfo;
import com.google.gerrit.extensions.restapi.RestApiException;
import com.google.gson.Gson;
import com.google.gson.JsonElement;

public class IncludedInInfoParser {
    private final Gson gson;

    public IncludedInInfoParser(Gson gson) {
        this.gson = gson;
    }

    public IncludedInInfo parseIncludedInInfos(JsonElement jsonElement) throws RestApiException {
        return gson.fromJson(jsonElement, IncludedInInfo.class);
    }
}
