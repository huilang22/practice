/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MobileZoneDeleteRequest.java
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
 * Class used to create a MobileZoneDeleteRequest Udt Request
 *
 */

public class MobileZoneDeleteRequest extends MobileZoneSubRequestParent {
/**
 *
 * Constructor to create a  MobileZoneDeleteRequest
 * @param id Unique request name
 * @param MZDeleteIn MobileZoneObjectKeyData for MobileZoneDeleteRequest
 *
 */
@JsonCreator
  public MobileZoneDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("MobileZone")MobileZoneObjectKeyData MZDeleteIn) {
    super(id, "MobileZoneDelete");
    if (MZDeleteIn != null) {
      addInput("MobileZone", MobileZoneObjectKeyHelper.toMap(MZDeleteIn, new HashMap(), "MobileZoneObjectKeyData").get("MobileZoneObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the MobileZoneObjectData that results from the MobileZoneDeleteRequest call
 * @return MobileZoneObjectData resulting from udt call
 *
 */

  public MobileZoneObjectData getOutput() {
    return MobileZoneObjectHelper.fromMap(outputMap, "MobileZone");
  }
}
