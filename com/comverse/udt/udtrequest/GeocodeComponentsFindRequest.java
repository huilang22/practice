/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeocodeComponentsFindRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a GeocodeComponentsFindRequest Udt Request
 *
 */

public class GeocodeComponentsFindRequest extends GeocodeRequest {
/**
 *
 * Constructor to create a  GeocodeComponentsFindRequest
 * @param id Unique request name
 * @param City String for GeocodeComponentsFindRequest
 * @param County String for GeocodeComponentsFindRequest
 * @param State String for GeocodeComponentsFindRequest
 *
 */
@JsonCreator
  public GeocodeComponentsFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("City")String City, @JsonProperty("County")String County, @JsonProperty("State")String State) {
    super(id, "GeocodeComponentsFind");
    if (City != null) {
      addInput("City", City);
    }
    if (County != null) {
      addInput("County", County);
    }
    if (State != null) {
      addInput("State", State);
    }
  }

/**
 *
 * Retrieves the GeocodeComponentsObjectDataList that results from the GeocodeComponentsFindRequest call
 * @return GeocodeComponentsObjectDataList resulting from udt call
 *
 */

  public GeocodeComponentsObjectDataList getOutput() {
    return GeocodeComponentsObjectHelper.fromMapList(outputMap, "GeocodeComponentsList");
  }
}
