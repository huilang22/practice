/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MobileZoneCreateRequest.java
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
 * Class used to create a MobileZoneCreateRequest Udt Request
 *
 */

public class MobileZoneCreateRequest extends MobileZoneSubRequestParent {
/**
 *
 * Constructor to create a  MobileZoneCreateRequest
 * @param id Unique request name
 * @param MZCreateIn MobileZoneObjectData for MobileZoneCreateRequest
 *
 */
@JsonCreator
  public MobileZoneCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("MobileZone")MobileZoneObjectData MZCreateIn) {
    super(id, "MobileZoneCreate");
    if (MZCreateIn != null) {
      addInput("MobileZone", MobileZoneObjectHelper.toMap(MZCreateIn, new HashMap(), "MobileZone").get("MobileZone"));
    }
  }

/**
 *
 * Retrieves the MobileZoneObjectData that results from the MobileZoneCreateRequest call
 * @return MobileZoneObjectData resulting from udt call
 *
 */

  public MobileZoneObjectData getOutput() {
    return MobileZoneObjectHelper.fromMap(outputMap, "MobileZone");
  }
}
