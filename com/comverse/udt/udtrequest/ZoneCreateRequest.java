/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ZoneCreateRequest.java
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
 * Class used to create a ZoneCreateRequest Udt Request
 *
 */

public class ZoneCreateRequest extends ZoneSubRequestParent {
/**
 *
 * Constructor to create a  ZoneCreateRequest
 * @param id Unique request name
 * @param zCrIn ZoneObjectData for ZoneCreateRequest
 *
 */
@JsonCreator
  public ZoneCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Zone")ZoneObjectData zCrIn) {
    super(id, "ZoneCreate");
    if (zCrIn != null) {
      addInput("Zone", ZoneObjectHelper.toMap(zCrIn, new HashMap(), "Zone").get("Zone"));
    }
  }

/**
 *
 * Retrieves the ZoneObjectData that results from the ZoneCreateRequest call
 * @return ZoneObjectData resulting from udt call
 *
 */

  public ZoneObjectData getOutput() {
    return ZoneObjectHelper.fromMap(outputMap, "Zone");
  }
}
