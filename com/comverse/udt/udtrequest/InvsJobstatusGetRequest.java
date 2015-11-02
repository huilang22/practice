/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobstatusGetRequest.java
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
 * Class used to create a InvsJobstatusGetRequest Udt Request
 *
 */

public class InvsJobstatusGetRequest extends InvsJobstatusSubRequestParent {
/**
 *
 * Constructor to create a  InvsJobstatusGetRequest
 * @param id Unique request name
 * @param InvsJobstatusGetIn InvsJobstatusObjectKeyData for InvsJobstatusGetRequest
 *
 */
@JsonCreator
  public InvsJobstatusGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsJobstatus")InvsJobstatusObjectKeyData InvsJobstatusGetIn) {
    super(id, "InvsJobstatusGet");
    if (InvsJobstatusGetIn != null) {
      addInput("InvsJobstatus", InvsJobstatusObjectKeyHelper.toMap(InvsJobstatusGetIn, new HashMap(), "InvsJobstatusObjectKeyData").get("InvsJobstatusObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsJobstatusObjectData that results from the InvsJobstatusGetRequest call
 * @return InvsJobstatusObjectData resulting from udt call
 *
 */

  public InvsJobstatusObjectData getOutput() {
    return InvsJobstatusObjectHelper.fromMap(outputMap, "InvsJobstatus");
  }
}
