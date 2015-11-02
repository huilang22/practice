/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrSymbolDeleteRequest.java
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
 * Class used to create a RbrSymbolDeleteRequest Udt Request
 *
 */

public class RbrSymbolDeleteRequest extends RbrSymbolSubRequestParent {
/**
 *
 * Constructor to create a  RbrSymbolDeleteRequest
 * @param id Unique request name
 * @param RbrSymbolDeleteIn RbrSymbolObjectKeyData for RbrSymbolDeleteRequest
 *
 */
@JsonCreator
  public RbrSymbolDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrSymbol")RbrSymbolObjectKeyData RbrSymbolDeleteIn) {
    super(id, "RbrSymbolDelete");
    if (RbrSymbolDeleteIn != null) {
      addInput("RbrSymbol", RbrSymbolObjectKeyHelper.toMap(RbrSymbolDeleteIn, new HashMap(), "RbrSymbolObjectKeyData").get("RbrSymbolObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RbrSymbolObjectData that results from the RbrSymbolDeleteRequest call
 * @return RbrSymbolObjectData resulting from udt call
 *
 */

  public RbrSymbolObjectData getOutput() {
    return RbrSymbolObjectHelper.fromMap(outputMap, "RbrSymbol");
  }
}
