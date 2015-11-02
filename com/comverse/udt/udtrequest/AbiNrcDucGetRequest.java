/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiNrcDucGetRequest.java
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
 * Class used to create a AbiNrcDucGetRequest Udt Request
 *
 */

public class AbiNrcDucGetRequest extends AbiNrcDucSubRequestParent {
/**
 *
 * Constructor to create a  AbiNrcDucGetRequest
 * @param id Unique request name
 * @param AbiNrcDucGetIn AbiNrcDucObjectKeyData for AbiNrcDucGetRequest
 *
 */
@JsonCreator
  public AbiNrcDucGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AbiNrcDuc")AbiNrcDucObjectKeyData AbiNrcDucGetIn) {
    super(id, "AbiNrcDucGet");
    if (AbiNrcDucGetIn != null) {
      addInput("AbiNrcDuc", AbiNrcDucObjectKeyHelper.toMap(AbiNrcDucGetIn, new HashMap(), "AbiNrcDucObjectKeyData").get("AbiNrcDucObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AbiNrcDucObjectData that results from the AbiNrcDucGetRequest call
 * @return AbiNrcDucObjectData resulting from udt call
 *
 */

  public AbiNrcDucObjectData getOutput() {
    return AbiNrcDucObjectHelper.fromMap(outputMap, "AbiNrcDuc");
  }
}
