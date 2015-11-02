/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaServiceabilityFindRequest.java
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
 * Class used to create a GeoAreaServiceabilityFindRequest Udt Request
 *
 */

public class GeoAreaServiceabilityFindRequest extends GeoAreaServiceabilityRequest {
/**
 *
 * Constructor to create a  GeoAreaServiceabilityFindRequest
 * @param id Unique request name
 * @param GeoAreaSvcFindIn GASObjFilter for GeoAreaServiceabilityFindRequest
 *
 */
@JsonCreator
  public GeoAreaServiceabilityFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaServiceability")GASObjFilter GeoAreaSvcFindIn) {
    super(id, "GeoAreaServiceabilityFind");
    if (GeoAreaSvcFindIn != null) {
      Integer index =  GeoAreaSvcFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GeoAreaServiceability", GASObjHelper.toMap(GeoAreaSvcFindIn, new HashMap(), "GeoAreaServiceability").get("GeoAreaServiceability"));
    }
  }

/**
 *
 * Retrieves the GASObjDataList that results from the GeoAreaServiceabilityFindRequest call
 * @return GASObjDataList resulting from udt call
 *
 */

  public GASObjDataList getOutput() {
    return GASObjHelper.fromMapList(outputMap, "GeoAreaServiceabilityList");
  }
}
