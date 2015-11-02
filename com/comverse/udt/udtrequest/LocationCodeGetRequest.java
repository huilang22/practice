/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LocationCodeGetRequest.java
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
 * Class used to create a LocationCodeGetRequest Udt Request
 *
 */

public class LocationCodeGetRequest extends LocationCodeSubRequestParent {
/**
 *
 * Constructor to create a  LocationCodeGetRequest
 * @param id Unique request name
 * @param LOCGetIn LOCObjectKeyData for LocationCodeGetRequest
 *
 */
@JsonCreator
  public LocationCodeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("LocationCode")LOCObjectKeyData LOCGetIn) {
    super(id, "LocationCodeGet");
    if (LOCGetIn != null) {
      addInput("LocationCode", LOCObjectKeyHelper.toMap(LOCGetIn, new HashMap(), "LOCObjectKeyData").get("LOCObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the LOCObjectData that results from the LocationCodeGetRequest call
 * @return LOCObjectData resulting from udt call
 *
 */

  public LOCObjectData getOutput() {
    return LOCObjectHelper.fromMap(outputMap, "LocationCode");
  }
}
