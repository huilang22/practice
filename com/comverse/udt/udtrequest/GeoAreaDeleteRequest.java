/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaDeleteRequest.java
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
 * Class used to create a GeoAreaDeleteRequest Udt Request
 *
 */

public class GeoAreaDeleteRequest extends GeoAreaSubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaDeleteRequest
 * @param id Unique request name
 * @param GADeleteIn GAObjectKeyData for GeoAreaDeleteRequest
 *
 */
@JsonCreator
  public GeoAreaDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoArea")GAObjectKeyData GADeleteIn) {
    super(id, "GeoAreaDelete");
    if (GADeleteIn != null) {
      addInput("GeoArea", GAObjectKeyHelper.toMap(GADeleteIn, new HashMap(), "GAObjectKeyData").get("GAObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the GAObjectData that results from the GeoAreaDeleteRequest call
 * @return GAObjectData resulting from udt call
 *
 */

  public GAObjectData getOutput() {
    return GAObjectHelper.fromMap(outputMap, "GeoArea");
  }
}
