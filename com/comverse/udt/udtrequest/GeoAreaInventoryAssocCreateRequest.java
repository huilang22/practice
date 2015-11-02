/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaInventoryAssocCreateRequest.java
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
 * Class used to create a GeoAreaInventoryAssocCreateRequest Udt Request
 *
 */

public class GeoAreaInventoryAssocCreateRequest extends GeoAreaInventoryAssocSubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaInventoryAssocCreateRequest
 * @param id Unique request name
 * @param GAIACreateIn GeoAreaInventoryAssocObjectData for GeoAreaInventoryAssocCreateRequest
 *
 */
@JsonCreator
  public GeoAreaInventoryAssocCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaInventoryAssoc")GeoAreaInventoryAssocObjectData GAIACreateIn) {
    super(id, "GeoAreaInventoryAssocCreate");
    if (GAIACreateIn != null) {
      addInput("GeoAreaInventoryAssoc", GeoAreaInventoryAssocObjectHelper.toMap(GAIACreateIn, new HashMap(), "GeoAreaInventoryAssoc").get("GeoAreaInventoryAssoc"));
    }
  }

/**
 *
 * Retrieves the GeoAreaInventoryAssocObjectData that results from the GeoAreaInventoryAssocCreateRequest call
 * @return GeoAreaInventoryAssocObjectData resulting from udt call
 *
 */

  public GeoAreaInventoryAssocObjectData getOutput() {
    return GeoAreaInventoryAssocObjectHelper.fromMap(outputMap, "GeoAreaInventoryAssoc");
  }
}
