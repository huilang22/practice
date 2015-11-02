/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaInventoryAssocFindRequest.java
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
 * Class used to create a GeoAreaInventoryAssocFindRequest Udt Request
 *
 */

public class GeoAreaInventoryAssocFindRequest extends GeoAreaInventoryAssocRequest {
/**
 *
 * Constructor to create a  GeoAreaInventoryAssocFindRequest
 * @param id Unique request name
 * @param GAIAFindIn GeoAreaInventoryAssocObjectFilter for GeoAreaInventoryAssocFindRequest
 *
 */
@JsonCreator
  public GeoAreaInventoryAssocFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaInventoryAssoc")GeoAreaInventoryAssocObjectFilter GAIAFindIn) {
    super(id, "GeoAreaInventoryAssocFind");
    if (GAIAFindIn != null) {
      Integer index =  GAIAFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GeoAreaInventoryAssoc", GeoAreaInventoryAssocObjectHelper.toMap(GAIAFindIn, new HashMap(), "GeoAreaInventoryAssoc").get("GeoAreaInventoryAssoc"));
    }
  }

/**
 *
 * Retrieves the GeoAreaInventoryAssocObjectDataList that results from the GeoAreaInventoryAssocFindRequest call
 * @return GeoAreaInventoryAssocObjectDataList resulting from udt call
 *
 */

  public GeoAreaInventoryAssocObjectDataList getOutput() {
    return GeoAreaInventoryAssocObjectHelper.fromMapList(outputMap, "GeoAreaInventoryAssocList");
  }
}
