/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LocationCodeCreateRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a LocationCodeCreateRequest Udt Request
 *
 */

public class LocationCodeCreateRequest extends LocationCodeSubRequestParent {
/**
 *
 * Constructor to create a  LocationCodeCreateRequest
 * @param id Unique request name
 * @param LOCCreateIn LOCObjectData for LocationCodeCreateRequest
 *
 */
@JsonCreator
  public LocationCodeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("LocationCode")LOCObjectData LOCCreateIn) {
    super(id, "LocationCodeCreate");
    if (LOCCreateIn != null) {
      addInput("LocationCode", LOCObjectHelper.toMap(LOCCreateIn, new HashMap(), "LocationCode").get("LocationCode"));
    }
  }

/**
 *
 * Retrieves the LOCObjectData that results from the LocationCodeCreateRequest call
 * @return LOCObjectData resulting from udt call
 *
 */

  public LOCObjectData getOutput() {
    return LOCObjectHelper.fromMap(outputMap, "LocationCode");
  }
}
