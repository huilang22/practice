/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaTypeUpdateRequest.java
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
 * Class used to create a GeoAreaTypeUpdateRequest Udt Request
 *
 */

public class GeoAreaTypeUpdateRequest extends GeoAreaTypeSubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaTypeUpdateRequest
 * @param id Unique request name
 * @param gatUpdIn GeoAreaTypeObjectData for GeoAreaTypeUpdateRequest
 *
 */
@JsonCreator
  public GeoAreaTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaType")GeoAreaTypeObjectData gatUpdIn) {
    super(id, "GeoAreaTypeUpdate");
    if (gatUpdIn != null) {
      addInput("GeoAreaType", GeoAreaTypeObjectHelper.toMap(gatUpdIn, new HashMap(), "GeoAreaType").get("GeoAreaType"));
    }
  }

/**
 *
 * Retrieves the GeoAreaTypeObjectData that results from the GeoAreaTypeUpdateRequest call
 * @return GeoAreaTypeObjectData resulting from udt call
 *
 */

  public GeoAreaTypeObjectData getOutput() {
    return GeoAreaTypeObjectHelper.fromMap(outputMap, "GeoAreaType");
  }
}
