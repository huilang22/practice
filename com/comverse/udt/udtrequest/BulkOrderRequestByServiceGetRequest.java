/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BulkOrderRequestByServiceGetRequest.java
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
 * Class used to create a BulkOrderRequestByServiceGetRequest Udt Request
 *
 */

public class BulkOrderRequestByServiceGetRequest extends BulkOrderRequestSubRequestParent {
/**
 *
 * Constructor to create a  BulkOrderRequestByServiceGetRequest
 * @param id Unique request name
 * @param _________BatchRequest BatchRequestObjectData for BulkOrderRequestByServiceGetRequest
 *
 */
@JsonCreator
  public BulkOrderRequestByServiceGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequest")BatchRequestObjectData _________BatchRequest) {
    super(id, "BulkOrderRequestByServiceGet");
    if (_________BatchRequest != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(_________BatchRequest, new HashMap(), "BulkOrderRequestByServiceGetOutputData").get("BulkOrderRequestByServiceGetOutputData"));
    }
  }

/**
 *
 * Retrieves the BulkOrderRequestByServiceGetOutputData that results from the BulkOrderRequestByServiceGetRequest call
 * @return BulkOrderRequestByServiceGetOutputData resulting from udt call
 *
 */

  public BulkOrderRequestByServiceGetOutputData getOutput() {
    return BulkOrderRequestByServiceGetOutputHelper.fromMap(outputMap);
  }
}
