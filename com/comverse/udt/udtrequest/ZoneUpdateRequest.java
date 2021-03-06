/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ZoneUpdateRequest.java
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
 * Class used to create a ZoneUpdateRequest Udt Request
 *
 */

public class ZoneUpdateRequest extends ZoneSubRequestParent {
/**
 *
 * Constructor to create a  ZoneUpdateRequest
 * @param id Unique request name
 * @param zUpdIn ZoneObjectData for ZoneUpdateRequest
 *
 */
@JsonCreator
  public ZoneUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Zone")ZoneObjectData zUpdIn) {
    super(id, "ZoneUpdate");
    if (zUpdIn != null) {
      addInput("Zone", ZoneObjectHelper.toMap(zUpdIn, new HashMap(), "Zone").get("Zone"));
    }
  }

/**
 *
 * Retrieves the ZoneObjectData that results from the ZoneUpdateRequest call
 * @return ZoneObjectData resulting from udt call
 *
 */

  public ZoneObjectData getOutput() {
    return ZoneObjectHelper.fromMap(outputMap, "Zone");
  }
}
