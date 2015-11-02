/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaTypeDeleteRequest.java
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
 * Class used to create a GeoAreaTypeDeleteRequest Udt Request
 *
 */

public class GeoAreaTypeDeleteRequest extends GeoAreaTypeSubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaTypeDeleteRequest
 * @param id Unique request name
 * @param gatDeleteIn GeoAreaTypeObjectKeyData for GeoAreaTypeDeleteRequest
 *
 */
@JsonCreator
  public GeoAreaTypeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaType")GeoAreaTypeObjectKeyData gatDeleteIn) {
    super(id, "GeoAreaTypeDelete");
    if (gatDeleteIn != null) {
      addInput("GeoAreaType", GeoAreaTypeObjectKeyHelper.toMap(gatDeleteIn, new HashMap(), "GeoAreaTypeObjectKeyData").get("GeoAreaTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the GeoAreaTypeObjectData that results from the GeoAreaTypeDeleteRequest call
 * @return GeoAreaTypeObjectData resulting from udt call
 *
 */

  public GeoAreaTypeObjectData getOutput() {
    return GeoAreaTypeObjectHelper.fromMap(outputMap, "GeoAreaType");
  }
}
