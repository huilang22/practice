/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiNrcDucUpdateRequest.java
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
 * Class used to create a AbiNrcDucUpdateRequest Udt Request
 *
 */

public class AbiNrcDucUpdateRequest extends AbiNrcDucSubRequestParent {
/**
 *
 * Constructor to create a  AbiNrcDucUpdateRequest
 * @param id Unique request name
 * @param AbiNrcDucUpdateIn AbiNrcDucObjectData for AbiNrcDucUpdateRequest
 *
 */
@JsonCreator
  public AbiNrcDucUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AbiNrcDuc")AbiNrcDucObjectData AbiNrcDucUpdateIn) {
    super(id, "AbiNrcDucUpdate");
    if (AbiNrcDucUpdateIn != null) {
      addInput("AbiNrcDuc", AbiNrcDucObjectHelper.toMap(AbiNrcDucUpdateIn, new HashMap(), "AbiNrcDuc").get("AbiNrcDuc"));
    }
  }

/**
 *
 * Retrieves the AbiNrcDucObjectData that results from the AbiNrcDucUpdateRequest call
 * @return AbiNrcDucObjectData resulting from udt call
 *
 */

  public AbiNrcDucObjectData getOutput() {
    return AbiNrcDucObjectHelper.fromMap(outputMap, "AbiNrcDuc");
  }
}
