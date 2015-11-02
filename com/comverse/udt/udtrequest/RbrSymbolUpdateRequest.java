/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrSymbolUpdateRequest.java
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
 * Class used to create a RbrSymbolUpdateRequest Udt Request
 *
 */

public class RbrSymbolUpdateRequest extends RbrSymbolSubRequestParent {
/**
 *
 * Constructor to create a  RbrSymbolUpdateRequest
 * @param id Unique request name
 * @param RbrSymbolUpdateIn RbrSymbolObjectData for RbrSymbolUpdateRequest
 *
 */
@JsonCreator
  public RbrSymbolUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrSymbol")RbrSymbolObjectData RbrSymbolUpdateIn) {
    super(id, "RbrSymbolUpdate");
    if (RbrSymbolUpdateIn != null) {
      addInput("RbrSymbol", RbrSymbolObjectHelper.toMap(RbrSymbolUpdateIn, new HashMap(), "RbrSymbol").get("RbrSymbol"));
    }
  }

/**
 *
 * Retrieves the RbrSymbolObjectData that results from the RbrSymbolUpdateRequest call
 * @return RbrSymbolObjectData resulting from udt call
 *
 */

  public RbrSymbolObjectData getOutput() {
    return RbrSymbolObjectHelper.fromMap(outputMap, "RbrSymbol");
  }
}
