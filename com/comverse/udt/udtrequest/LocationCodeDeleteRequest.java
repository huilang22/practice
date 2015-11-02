/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LocationCodeDeleteRequest.java
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
 * Class used to create a LocationCodeDeleteRequest Udt Request
 *
 */

public class LocationCodeDeleteRequest extends LocationCodeSubRequestParent {
/**
 *
 * Constructor to create a  LocationCodeDeleteRequest
 * @param id Unique request name
 * @param LOCDeleteIn LOCObjectKeyData for LocationCodeDeleteRequest
 *
 */
@JsonCreator
  public LocationCodeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("LocationCode")LOCObjectKeyData LOCDeleteIn) {
    super(id, "LocationCodeDelete");
    if (LOCDeleteIn != null) {
      addInput("LocationCode", LOCObjectKeyHelper.toMap(LOCDeleteIn, new HashMap(), "LOCObjectKeyData").get("LOCObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the LOCObjectData that results from the LocationCodeDeleteRequest call
 * @return LOCObjectData resulting from udt call
 *
 */

  public LOCObjectData getOutput() {
    return LOCObjectHelper.fromMap(outputMap, "LocationCode");
  }
}
