/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TransferReasonUpdateRequest.java
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
 * Class used to create a TransferReasonUpdateRequest Udt Request
 *
 */

public class TransferReasonUpdateRequest extends TransferReasonSubRequestParent {
/**
 *
 * Constructor to create a  TransferReasonUpdateRequest
 * @param id Unique request name
 * @param XRUpdateIn TransferReasonObjectData for TransferReasonUpdateRequest
 *
 */
@JsonCreator
  public TransferReasonUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("TransferReason")TransferReasonObjectData XRUpdateIn) {
    super(id, "TransferReasonUpdate");
    if (XRUpdateIn != null) {
      addInput("TransferReason", TransferReasonObjectHelper.toMap(XRUpdateIn, new HashMap(), "TransferReason").get("TransferReason"));
    }
  }

/**
 *
 * Retrieves the TransferReasonObjectData that results from the TransferReasonUpdateRequest call
 * @return TransferReasonObjectData resulting from udt call
 *
 */

  public TransferReasonObjectData getOutput() {
    return TransferReasonObjectHelper.fromMap(outputMap, "TransferReason");
  }
}
