/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TransferReasonGetRequest.java
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
 * Class used to create a TransferReasonGetRequest Udt Request
 *
 */

public class TransferReasonGetRequest extends TransferReasonSubRequestParent {
/**
 *
 * Constructor to create a  TransferReasonGetRequest
 * @param id Unique request name
 * @param XRGetIn TransferReasonObjectKeyData for TransferReasonGetRequest
 *
 */
@JsonCreator
  public TransferReasonGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("TransferReason")TransferReasonObjectKeyData XRGetIn) {
    super(id, "TransferReasonGet");
    if (XRGetIn != null) {
      addInput("TransferReason", TransferReasonObjectKeyHelper.toMap(XRGetIn, new HashMap(), "TransferReasonObjectKeyData").get("TransferReasonObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the TransferReasonObjectData that results from the TransferReasonGetRequest call
 * @return TransferReasonObjectData resulting from udt call
 *
 */

  public TransferReasonObjectData getOutput() {
    return TransferReasonObjectHelper.fromMap(outputMap, "TransferReason");
  }
}
