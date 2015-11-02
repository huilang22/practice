/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MobileZoneGetRequest.java
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
 * Class used to create a MobileZoneGetRequest Udt Request
 *
 */

public class MobileZoneGetRequest extends MobileZoneSubRequestParent {
/**
 *
 * Constructor to create a  MobileZoneGetRequest
 * @param id Unique request name
 * @param MZGetIn MobileZoneObjectKeyData for MobileZoneGetRequest
 *
 */
@JsonCreator
  public MobileZoneGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("MobileZone")MobileZoneObjectKeyData MZGetIn) {
    super(id, "MobileZoneGet");
    if (MZGetIn != null) {
      addInput("MobileZone", MobileZoneObjectKeyHelper.toMap(MZGetIn, new HashMap(), "MobileZoneObjectKeyData").get("MobileZoneObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the MobileZoneObjectData that results from the MobileZoneGetRequest call
 * @return MobileZoneObjectData resulting from udt call
 *
 */

  public MobileZoneObjectData getOutput() {
    return MobileZoneObjectHelper.fromMap(outputMap, "MobileZone");
  }
}
