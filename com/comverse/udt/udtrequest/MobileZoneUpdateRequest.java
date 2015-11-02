/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MobileZoneUpdateRequest.java
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
 * Class used to create a MobileZoneUpdateRequest Udt Request
 *
 */

public class MobileZoneUpdateRequest extends MobileZoneSubRequestParent {
/**
 *
 * Constructor to create a  MobileZoneUpdateRequest
 * @param id Unique request name
 * @param MZUpdateIn MobileZoneObjectData for MobileZoneUpdateRequest
 *
 */
@JsonCreator
  public MobileZoneUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("MobileZone")MobileZoneObjectData MZUpdateIn) {
    super(id, "MobileZoneUpdate");
    if (MZUpdateIn != null) {
      addInput("MobileZone", MobileZoneObjectHelper.toMap(MZUpdateIn, new HashMap(), "MobileZone").get("MobileZone"));
    }
  }

/**
 *
 * Retrieves the MobileZoneObjectData that results from the MobileZoneUpdateRequest call
 * @return MobileZoneObjectData resulting from udt call
 *
 */

  public MobileZoneObjectData getOutput() {
    return MobileZoneObjectHelper.fromMap(outputMap, "MobileZone");
  }
}
