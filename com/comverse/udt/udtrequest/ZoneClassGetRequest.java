/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ZoneClassGetRequest.java
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
 * Class used to create a ZoneClassGetRequest Udt Request
 *
 */

public class ZoneClassGetRequest extends ZoneClassSubRequestParent {
/**
 *
 * Constructor to create a  ZoneClassGetRequest
 * @param id Unique request name
 * @param zcGetIn ZoneClassObjectKeyData for ZoneClassGetRequest
 *
 */
@JsonCreator
  public ZoneClassGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ZoneClass")ZoneClassObjectKeyData zcGetIn) {
    super(id, "ZoneClassGet");
    if (zcGetIn != null) {
      addInput("ZoneClass", ZoneClassObjectKeyHelper.toMap(zcGetIn, new HashMap(), "ZoneClassObjectKeyData").get("ZoneClassObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ZoneClassObjectData that results from the ZoneClassGetRequest call
 * @return ZoneClassObjectData resulting from udt call
 *
 */

  public ZoneClassObjectData getOutput() {
    return ZoneClassObjectHelper.fromMap(outputMap, "ZoneClass");
  }
}
