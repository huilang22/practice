/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NetActionGetRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a NetActionGetRequest Udt Request
 *
 */

public class NetActionGetRequest extends NetActionSubRequestParent {
/**
 *
 * Constructor to create a  NetActionGetRequest
 * @param id Unique request name
 * @param NARGetIn NetActionObjectKeyData for NetActionGetRequest
 *
 */
@JsonCreator
  public NetActionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("NetAction")NetActionObjectKeyData NARGetIn) {
    super(id, "NetActionGet");
    if (NARGetIn != null) {
      addInput("NetAction", NetActionObjectKeyHelper.toMap(NARGetIn, new HashMap(), "NetActionObjectKeyData").get("NetActionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the NetActionObjectData that results from the NetActionGetRequest call
 * @return NetActionObjectData resulting from udt call
 *
 */

  public NetActionObjectData getOutput() {
    return NetActionObjectHelper.fromMap(outputMap, "NetAction");
  }
}
