/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TransferReasonDeleteRequest.java
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
 * Class used to create a TransferReasonDeleteRequest Udt Request
 *
 */

public class TransferReasonDeleteRequest extends TransferReasonSubRequestParent {
/**
 *
 * Constructor to create a  TransferReasonDeleteRequest
 * @param id Unique request name
 * @param XRDeleteIn TransferReasonObjectKeyData for TransferReasonDeleteRequest
 *
 */
@JsonCreator
  public TransferReasonDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("TransferReason")TransferReasonObjectKeyData XRDeleteIn) {
    super(id, "TransferReasonDelete");
    if (XRDeleteIn != null) {
      addInput("TransferReason", TransferReasonObjectKeyHelper.toMap(XRDeleteIn, new HashMap(), "TransferReasonObjectKeyData").get("TransferReasonObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the TransferReasonObjectData that results from the TransferReasonDeleteRequest call
 * @return TransferReasonObjectData resulting from udt call
 *
 */

  public TransferReasonObjectData getOutput() {
    return TransferReasonObjectHelper.fromMap(outputMap, "TransferReason");
  }
}
