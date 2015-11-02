/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdThresholdDeleteRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvdThresholdDeleteRequest Udt Request
 *
 */

public class InvdThresholdDeleteRequest extends InvdThresholdRequest {
/**
 *
 * Constructor to create a  InvdThresholdDeleteRequest
 * @param id Unique request name
 * @param InvdThresholdDeleteIn InvdThresholdObjectKeyData for InvdThresholdDeleteRequest
 *
 */
@JsonCreator
  public InvdThresholdDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdThreshold")InvdThresholdObjectKeyData InvdThresholdDeleteIn) {
    super(id, "InvdThresholdDelete");
    if (InvdThresholdDeleteIn != null) {
      addInput("InvdThreshold", InvdThresholdObjectKeyHelper.toMap(InvdThresholdDeleteIn, new HashMap(), "InvdThresholdObjectKeyData").get("InvdThresholdObjectKeyData"));
    }
  }

}
