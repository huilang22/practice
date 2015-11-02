/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobsubstateGetRequest.java
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
 * Class used to create a InvsJobsubstateGetRequest Udt Request
 *
 */

public class InvsJobsubstateGetRequest extends InvsJobsubstateSubRequestParent {
/**
 *
 * Constructor to create a  InvsJobsubstateGetRequest
 * @param id Unique request name
 * @param InvsJobsubstateGetIn InvsJobsubstateObjectKeyData for InvsJobsubstateGetRequest
 *
 */
@JsonCreator
  public InvsJobsubstateGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsJobsubstate")InvsJobsubstateObjectKeyData InvsJobsubstateGetIn) {
    super(id, "InvsJobsubstateGet");
    if (InvsJobsubstateGetIn != null) {
      addInput("InvsJobsubstate", InvsJobsubstateObjectKeyHelper.toMap(InvsJobsubstateGetIn, new HashMap(), "InvsJobsubstateObjectKeyData").get("InvsJobsubstateObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsJobsubstateObjectData that results from the InvsJobsubstateGetRequest call
 * @return InvsJobsubstateObjectData resulting from udt call
 *
 */

  public InvsJobsubstateObjectData getOutput() {
    return InvsJobsubstateObjectHelper.fromMap(outputMap, "InvsJobsubstate");
  }
}
