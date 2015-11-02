/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaInventoryAssocGetRequest.java
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
 * Class used to create a GeoAreaInventoryAssocGetRequest Udt Request
 *
 */

public class GeoAreaInventoryAssocGetRequest extends GeoAreaInventoryAssocSubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaInventoryAssocGetRequest
 * @param id Unique request name
 * @param GAIAGetIn GeoAreaInventoryAssocObjectKeyData for GeoAreaInventoryAssocGetRequest
 *
 */
@JsonCreator
  public GeoAreaInventoryAssocGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaInventoryAssoc")GeoAreaInventoryAssocObjectKeyData GAIAGetIn) {
    super(id, "GeoAreaInventoryAssocGet");
    if (GAIAGetIn != null) {
      addInput("GeoAreaInventoryAssoc", GeoAreaInventoryAssocObjectKeyHelper.toMap(GAIAGetIn, new HashMap(), "GeoAreaInventoryAssocObjectKeyData").get("GeoAreaInventoryAssocObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the GeoAreaInventoryAssocObjectData that results from the GeoAreaInventoryAssocGetRequest call
 * @return GeoAreaInventoryAssocObjectData resulting from udt call
 *
 */

  public GeoAreaInventoryAssocObjectData getOutput() {
    return GeoAreaInventoryAssocObjectHelper.fromMap(outputMap, "GeoAreaInventoryAssoc");
  }
}
