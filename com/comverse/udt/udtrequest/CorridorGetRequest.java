/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorGetRequest.java
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
 * Class used to create a CorridorGetRequest Udt Request
 *
 */

public class CorridorGetRequest extends CorridorSubRequestParent {
/**
 *
 * Constructor to create a  CorridorGetRequest
 * @param id Unique request name
 * @param CCGetIn CorridorObjectKeyData for CorridorGetRequest
 *
 */
@JsonCreator
  public CorridorGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Corridor")CorridorObjectKeyData CCGetIn) {
    super(id, "CorridorGet");
    if (CCGetIn != null) {
      addInput("Corridor", CorridorObjectKeyHelper.toMap(CCGetIn, new HashMap(), "CorridorObjectKeyData").get("CorridorObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CorridorObjectData that results from the CorridorGetRequest call
 * @return CorridorObjectData resulting from udt call
 *
 */

  public CorridorObjectData getOutput() {
    return CorridorObjectHelper.fromMap(outputMap, "Corridor");
  }
}
