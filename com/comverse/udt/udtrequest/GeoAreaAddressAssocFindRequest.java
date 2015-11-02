/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaAddressAssocFindRequest.java
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
 * Class used to create a GeoAreaAddressAssocFindRequest Udt Request
 *
 */

public class GeoAreaAddressAssocFindRequest extends GeoAreaAddressAssocRequest {
/**
 *
 * Constructor to create a  GeoAreaAddressAssocFindRequest
 * @param id Unique request name
 * @param GAAAFindIn GeoAreaAddressAssocObjectFilter for GeoAreaAddressAssocFindRequest
 *
 */
@JsonCreator
  public GeoAreaAddressAssocFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("GeoAreaAddressAssoc")GeoAreaAddressAssocObjectFilter GAAAFindIn) {
    super(id, "GeoAreaAddressAssocFind");
    if (GAAAFindIn != null) {
      Integer index =  GAAAFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GeoAreaAddressAssoc", GeoAreaAddressAssocObjectHelper.toMap(GAAAFindIn, new HashMap(), "GeoAreaAddressAssoc").get("GeoAreaAddressAssoc"));
    }
  }

/**
 *
 * Retrieves the GeoAreaAddressAssocObjectDataList that results from the GeoAreaAddressAssocFindRequest call
 * @return GeoAreaAddressAssocObjectDataList resulting from udt call
 *
 */

  public GeoAreaAddressAssocObjectDataList getOutput() {
    return GeoAreaAddressAssocObjectHelper.fromMapList(outputMap, "GeoAreaAddressAssocList");
  }
}
