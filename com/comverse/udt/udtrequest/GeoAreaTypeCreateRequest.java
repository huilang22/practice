/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaTypeCreateRequest.java
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
 * Class used to create a GeoAreaTypeCreateRequest Udt Request
 *
 */

public class GeoAreaTypeCreateRequest extends GeoAreaTypeSubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaTypeCreateRequest
 * @param id Unique request name
 * @param gatCrIn GeoAreaTypeObjectData for GeoAreaTypeCreateRequest
 *
 */
@JsonCreator
  public GeoAreaTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaType")GeoAreaTypeObjectData gatCrIn) {
    super(id, "GeoAreaTypeCreate");
    if (gatCrIn != null) {
      addInput("GeoAreaType", GeoAreaTypeObjectHelper.toMap(gatCrIn, new HashMap(), "GeoAreaType").get("GeoAreaType"));
    }
  }

/**
 *
 * Retrieves the GeoAreaTypeObjectData that results from the GeoAreaTypeCreateRequest call
 * @return GeoAreaTypeObjectData resulting from udt call
 *
 */

  public GeoAreaTypeObjectData getOutput() {
    return GeoAreaTypeObjectHelper.fromMap(outputMap, "GeoAreaType");
  }
}
