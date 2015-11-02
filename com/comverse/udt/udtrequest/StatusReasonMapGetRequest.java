/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusReasonMapGetRequest.java
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
 * Class used to create a StatusReasonMapGetRequest Udt Request
 *
 */

public class StatusReasonMapGetRequest extends StatusReasonMapSubRequestParent {
/**
 *
 * Constructor to create a  StatusReasonMapGetRequest
 * @param id Unique request name
 * @param SRMGetIn SRMObjectKeyData for StatusReasonMapGetRequest
 *
 */
@JsonCreator
  public StatusReasonMapGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("StatusReasonMap")SRMObjectKeyData SRMGetIn) {
    super(id, "StatusReasonMapGet");
    if (SRMGetIn != null) {
      addInput("StatusReasonMap", SRMObjectKeyHelper.toMap(SRMGetIn, new HashMap(), "SRMObjectKeyData").get("SRMObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the SRMObjectData that results from the StatusReasonMapGetRequest call
 * @return SRMObjectData resulting from udt call
 *
 */

  public SRMObjectData getOutput() {
    return SRMObjectHelper.fromMap(outputMap, "StatusReasonMap");
  }
}
