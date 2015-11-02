/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrSymbolCreateRequest.java
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
 * Class used to create a RbrSymbolCreateRequest Udt Request
 *
 */

public class RbrSymbolCreateRequest extends RbrSymbolSubRequestParent {
/**
 *
 * Constructor to create a  RbrSymbolCreateRequest
 * @param id Unique request name
 * @param RbrSymbolCreateIn RbrSymbolObjectData for RbrSymbolCreateRequest
 *
 */
@JsonCreator
  public RbrSymbolCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrSymbol")RbrSymbolObjectData RbrSymbolCreateIn) {
    super(id, "RbrSymbolCreate");
    if (RbrSymbolCreateIn != null) {
      addInput("RbrSymbol", RbrSymbolObjectHelper.toMap(RbrSymbolCreateIn, new HashMap(), "RbrSymbol").get("RbrSymbol"));
    }
  }

/**
 *
 * Retrieves the RbrSymbolObjectData that results from the RbrSymbolCreateRequest call
 * @return RbrSymbolObjectData resulting from udt call
 *
 */

  public RbrSymbolObjectData getOutput() {
    return RbrSymbolObjectHelper.fromMap(outputMap, "RbrSymbol");
  }
}
