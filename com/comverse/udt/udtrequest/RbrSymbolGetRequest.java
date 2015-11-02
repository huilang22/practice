/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrSymbolGetRequest.java
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
 * Class used to create a RbrSymbolGetRequest Udt Request
 *
 */

public class RbrSymbolGetRequest extends RbrSymbolSubRequestParent {
/**
 *
 * Constructor to create a  RbrSymbolGetRequest
 * @param id Unique request name
 * @param RbrSymbolGetIn RbrSymbolObjectKeyData for RbrSymbolGetRequest
 *
 */
@JsonCreator
  public RbrSymbolGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrSymbol")RbrSymbolObjectKeyData RbrSymbolGetIn) {
    super(id, "RbrSymbolGet");
    if (RbrSymbolGetIn != null) {
      addInput("RbrSymbol", RbrSymbolObjectKeyHelper.toMap(RbrSymbolGetIn, new HashMap(), "RbrSymbolObjectKeyData").get("RbrSymbolObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RbrSymbolObjectData that results from the RbrSymbolGetRequest call
 * @return RbrSymbolObjectData resulting from udt call
 *
 */

  public RbrSymbolObjectData getOutput() {
    return RbrSymbolObjectHelper.fromMap(outputMap, "RbrSymbol");
  }
}
