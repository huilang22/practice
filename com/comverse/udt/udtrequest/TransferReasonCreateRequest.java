/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TransferReasonCreateRequest.java
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
 * Class used to create a TransferReasonCreateRequest Udt Request
 *
 */

public class TransferReasonCreateRequest extends TransferReasonSubRequestParent {
/**
 *
 * Constructor to create a  TransferReasonCreateRequest
 * @param id Unique request name
 * @param XRCreateIn TransferReasonObjectData for TransferReasonCreateRequest
 *
 */
@JsonCreator
  public TransferReasonCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("TransferReason")TransferReasonObjectData XRCreateIn) {
    super(id, "TransferReasonCreate");
    if (XRCreateIn != null) {
      addInput("TransferReason", TransferReasonObjectHelper.toMap(XRCreateIn, new HashMap(), "TransferReason").get("TransferReason"));
    }
  }

/**
 *
 * Retrieves the TransferReasonObjectData that results from the TransferReasonCreateRequest call
 * @return TransferReasonObjectData resulting from udt call
 *
 */

  public TransferReasonObjectData getOutput() {
    return TransferReasonObjectHelper.fromMap(outputMap, "TransferReason");
  }
}
