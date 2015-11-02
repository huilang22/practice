/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TransSourceTypeUpdateRequest.java
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
 * Class used to create a TransSourceTypeUpdateRequest Udt Request
 *
 */

public class TransSourceTypeUpdateRequest extends TransSourceTypeSubRequestParent {
/**
 *
 * Constructor to create a  TransSourceTypeUpdateRequest
 * @param id Unique request name
 * @param TSUpdateIn TransSourceTypeObjectData for TransSourceTypeUpdateRequest
 *
 */
@JsonCreator
  public TransSourceTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("TransSourceType")TransSourceTypeObjectData TSUpdateIn) {
    super(id, "TransSourceTypeUpdate");
    if (TSUpdateIn != null) {
      addInput("TransSourceType", TransSourceTypeObjectHelper.toMap(TSUpdateIn, new HashMap(), "TransSourceType").get("TransSourceType"));
    }
  }

/**
 *
 * Retrieves the TransSourceTypeObjectData that results from the TransSourceTypeUpdateRequest call
 * @return TransSourceTypeObjectData resulting from udt call
 *
 */

  public TransSourceTypeObjectData getOutput() {
    return TransSourceTypeObjectHelper.fromMap(outputMap, "TransSourceType");
  }
}
