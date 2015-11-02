/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaBoundaryFindRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.svbl.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a GeoAreaBoundaryFindRequest Udt Request
 *
 */

public class GeoAreaBoundaryFindRequest extends GeoAreaBoundaryRequest {
/**
 *
 * Constructor to create a  GeoAreaBoundaryFindRequest
 * @param id Unique request name
 * @param GABFindIn GeoAreaBoundaryObjectFilter for GeoAreaBoundaryFindRequest
 *
 */
@JsonCreator
  public GeoAreaBoundaryFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaBoundary")GeoAreaBoundaryObjectFilter GABFindIn) {
    super(id, "GeoAreaBoundaryFind");
    if (GABFindIn != null) {
      Integer index =  GABFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GeoAreaBoundary", GeoAreaBoundaryObjectHelper.toMap(GABFindIn, new HashMap(), "GeoAreaBoundary").get("GeoAreaBoundary"));
    }
  }

/**
 *
 * Retrieves the GeoAreaBoundaryObjectDataList that results from the GeoAreaBoundaryFindRequest call
 * @return GeoAreaBoundaryObjectDataList resulting from udt call
 *
 */

  public GeoAreaBoundaryObjectDataList getOutput() {
    return GeoAreaBoundaryObjectHelper.fromMapList(outputMap, "GeoAreaBoundaryList");
  }
}
