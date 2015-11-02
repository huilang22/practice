/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ZoneDeleteRequest.java
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
 * Class used to create a ZoneDeleteRequest Udt Request
 *
 */

public class ZoneDeleteRequest extends ZoneSubRequestParent {
/**
 *
 * Constructor to create a  ZoneDeleteRequest
 * @param id Unique request name
 * @param zDeleteIn ZoneObjectKeyData for ZoneDeleteRequest
 *
 */
@JsonCreator
  public ZoneDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("Zone")ZoneObjectKeyData zDeleteIn) {
    super(id, "ZoneDelete");
    if (zDeleteIn != null) {
      addInput("Zone", ZoneObjectKeyHelper.toMap(zDeleteIn, new HashMap(), "ZoneObjectKeyData").get("ZoneObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ZoneObjectData that results from the ZoneDeleteRequest call
 * @return ZoneObjectData resulting from udt call
 *
 */

  public ZoneObjectData getOutput() {
    return ZoneObjectHelper.fromMap(outputMap, "Zone");
  }
}
