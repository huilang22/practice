/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BulkOrderRequestByAccountGetRequest.java
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

import com.csgsystems.bat.data.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BulkOrderRequestByAccountGetRequest Udt Request
 *
 */

public class BulkOrderRequestByAccountGetRequest extends BulkOrderRequestSubRequestParent {
/**
 *
 * Constructor to create a  BulkOrderRequestByAccountGetRequest
 * @param id Unique request name
 * @param ___BatchRequest BatchRequestObjectData for BulkOrderRequestByAccountGetRequest
 *
 */
@JsonCreator
  public BulkOrderRequestByAccountGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequest")BatchRequestObjectData ___BatchRequest) {
    super(id, "BulkOrderRequestByAccountGet");
    if (___BatchRequest != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(___BatchRequest, new HashMap(), "BulkOrderRequestByAccountGetOutputData").get("BulkOrderRequestByAccountGetOutputData"));
    }
  }

/**
 *
 * Retrieves the BulkOrderRequestByAccountGetOutputData that results from the BulkOrderRequestByAccountGetRequest call
 * @return BulkOrderRequestByAccountGetOutputData resulting from udt call
 *
 */

  public BulkOrderRequestByAccountGetOutputData getOutput() {
    return BulkOrderRequestByAccountGetOutputHelper.fromMap(outputMap);
  }
}
