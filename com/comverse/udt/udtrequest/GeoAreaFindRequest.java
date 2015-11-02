/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaFindRequest.java
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
 * Class used to create a GeoAreaFindRequest Udt Request
 *
 */

public class GeoAreaFindRequest extends GeoAreaRequest {
/**
 *
 * Constructor to create a  GeoAreaFindRequest
 * @param id Unique request name
 * @param GAFindIn GAObjectFilter for GeoAreaFindRequest
 *
 */
@JsonCreator
  public GeoAreaFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoArea")GAObjectFilter GAFindIn) {
    super(id, "GeoAreaFind");
    if (GAFindIn != null) {
      Integer index =  GAFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GeoArea", GAObjectHelper.toMap(GAFindIn, new HashMap(), "GeoArea").get("GeoArea"));
    }
  }

/**
 *
 * Retrieves the GAObjectDataList that results from the GeoAreaFindRequest call
 * @return GAObjectDataList resulting from udt call
 *
 */

  public GAObjectDataList getOutput() {
    return GAObjectHelper.fromMapList(outputMap, "GeoAreaList");
  }
}
