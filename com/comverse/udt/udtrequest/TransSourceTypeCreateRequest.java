/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TransSourceTypeCreateRequest.java
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
 * Class used to create a TransSourceTypeCreateRequest Udt Request
 *
 */

public class TransSourceTypeCreateRequest extends TransSourceTypeSubRequestParent {
/**
 *
 * Constructor to create a  TransSourceTypeCreateRequest
 * @param id Unique request name
 * @param TSCreateIn TransSourceTypeObjectData for TransSourceTypeCreateRequest
 *
 */
@JsonCreator
  public TransSourceTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("TransSourceType")TransSourceTypeObjectData TSCreateIn) {
    super(id, "TransSourceTypeCreate");
    if (TSCreateIn != null) {
      addInput("TransSourceType", TransSourceTypeObjectHelper.toMap(TSCreateIn, new HashMap(), "TransSourceType").get("TransSourceType"));
    }
  }

/**
 *
 * Retrieves the TransSourceTypeObjectData that results from the TransSourceTypeCreateRequest call
 * @return TransSourceTypeObjectData resulting from udt call
 *
 */

  public TransSourceTypeObjectData getOutput() {
    return TransSourceTypeObjectHelper.fromMap(outputMap, "TransSourceType");
  }
}
