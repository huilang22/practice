/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaInventoryAssocUpdateRequest.java
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
 * Class used to create a GeoAreaInventoryAssocUpdateRequest Udt Request
 *
 */

public class GeoAreaInventoryAssocUpdateRequest extends GeoAreaInventoryAssocSubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaInventoryAssocUpdateRequest
 * @param id Unique request name
 * @param GAIAUpdateIn GeoAreaInventoryAssocObjectData for GeoAreaInventoryAssocUpdateRequest
 *
 */
@JsonCreator
  public GeoAreaInventoryAssocUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaInventoryAssoc")GeoAreaInventoryAssocObjectData GAIAUpdateIn) {
    super(id, "GeoAreaInventoryAssocUpdate");
    if (GAIAUpdateIn != null) {
      addInput("GeoAreaInventoryAssoc", GeoAreaInventoryAssocObjectHelper.toMap(GAIAUpdateIn, new HashMap(), "GeoAreaInventoryAssoc").get("GeoAreaInventoryAssoc"));
    }
  }

/**
 *
 * Retrieves the GeoAreaInventoryAssocObjectData that results from the GeoAreaInventoryAssocUpdateRequest call
 * @return GeoAreaInventoryAssocObjectData resulting from udt call
 *
 */

  public GeoAreaInventoryAssocObjectData getOutput() {
    return GeoAreaInventoryAssocObjectHelper.fromMap(outputMap, "GeoAreaInventoryAssoc");
  }
}
