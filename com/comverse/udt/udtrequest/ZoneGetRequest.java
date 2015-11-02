/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ZoneGetRequest.java
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
 * Class used to create a ZoneGetRequest Udt Request
 *
 */

public class ZoneGetRequest extends ZoneSubRequestParent {
/**
 *
 * Constructor to create a  ZoneGetRequest
 * @param id Unique request name
 * @param zGetIn ZoneObjectKeyData for ZoneGetRequest
 *
 */
@JsonCreator
  public ZoneGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Zone")ZoneObjectKeyData zGetIn) {
    super(id, "ZoneGet");
    if (zGetIn != null) {
      addInput("Zone", ZoneObjectKeyHelper.toMap(zGetIn, new HashMap(), "ZoneObjectKeyData").get("ZoneObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ZoneObjectData that results from the ZoneGetRequest call
 * @return ZoneObjectData resulting from udt call
 *
 */

  public ZoneObjectData getOutput() {
    return ZoneObjectHelper.fromMap(outputMap, "Zone");
  }
}
