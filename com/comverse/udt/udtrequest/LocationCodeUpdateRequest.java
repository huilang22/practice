/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LocationCodeUpdateRequest.java
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
 * Class used to create a LocationCodeUpdateRequest Udt Request
 *
 */

public class LocationCodeUpdateRequest extends LocationCodeSubRequestParent {
/**
 *
 * Constructor to create a  LocationCodeUpdateRequest
 * @param id Unique request name
 * @param LOCUpdateIn LOCObjectData for LocationCodeUpdateRequest
 *
 */
@JsonCreator
  public LocationCodeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("LocationCode")LOCObjectData LOCUpdateIn) {
    super(id, "LocationCodeUpdate");
    if (LOCUpdateIn != null) {
      addInput("LocationCode", LOCObjectHelper.toMap(LOCUpdateIn, new HashMap(), "LocationCode").get("LocationCode"));
    }
  }

/**
 *
 * Retrieves the LOCObjectData that results from the LocationCodeUpdateRequest call
 * @return LOCObjectData resulting from udt call
 *
 */

  public LOCObjectData getOutput() {
    return LOCObjectHelper.fromMap(outputMap, "LocationCode");
  }
}
