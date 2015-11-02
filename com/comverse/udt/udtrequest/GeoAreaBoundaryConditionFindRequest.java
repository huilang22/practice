/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaBoundaryConditionFindRequest.java
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
 * Class used to create a GeoAreaBoundaryConditionFindRequest Udt Request
 *
 */

public class GeoAreaBoundaryConditionFindRequest extends GeoAreaBoundaryConditionRequest {
/**
 *
 * Constructor to create a  GeoAreaBoundaryConditionFindRequest
 * @param id Unique request name
 * @param GABCFindIn GeoAreaBoundaryConditionObjectFilter for GeoAreaBoundaryConditionFindRequest
 *
 */
@JsonCreator
  public GeoAreaBoundaryConditionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaBoundaryCondition")GeoAreaBoundaryConditionObjectFilter GABCFindIn) {
    super(id, "GeoAreaBoundaryConditionFind");
    if (GABCFindIn != null) {
      Integer index =  GABCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GeoAreaBoundaryCondition", GeoAreaBoundaryConditionObjectHelper.toMap(GABCFindIn, new HashMap(), "GeoAreaBoundaryCondition").get("GeoAreaBoundaryCondition"));
    }
  }

/**
 *
 * Retrieves the GeoAreaBoundaryConditionObjectDataList that results from the GeoAreaBoundaryConditionFindRequest call
 * @return GeoAreaBoundaryConditionObjectDataList resulting from udt call
 *
 */

  public GeoAreaBoundaryConditionObjectDataList getOutput() {
    return GeoAreaBoundaryConditionObjectHelper.fromMapList(outputMap, "GeoAreaBoundaryConditionList");
  }
}
