/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SuspendedReasonGetRequest.java
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

import com.csgsystems.ar.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a SuspendedReasonGetRequest Udt Request
 *
 */

public class SuspendedReasonGetRequest extends SuspendedReasonSubRequestParent {
/**
 *
 * Constructor to create a  SuspendedReasonGetRequest
 * @param id Unique request name
 * @param SRGetIn SuspendedReasonObjectKeyData for SuspendedReasonGetRequest
 *
 */
@JsonCreator
  public SuspendedReasonGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("SuspendedReason")SuspendedReasonObjectKeyData SRGetIn) {
    super(id, "SuspendedReasonGet");
    if (SRGetIn != null) {
      addInput("SuspendedReason", SuspendedReasonObjectKeyHelper.toMap(SRGetIn, new HashMap(), "SuspendedReasonObjectKeyData").get("SuspendedReasonObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the SuspendedReasonObjectData that results from the SuspendedReasonGetRequest call
 * @return SuspendedReasonObjectData resulting from udt call
 *
 */

  public SuspendedReasonObjectData getOutput() {
    return SuspendedReasonObjectHelper.fromMap(outputMap, "SuspendedReason");
  }
}
