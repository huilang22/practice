/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsMccCodeGetRequest.java
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
 * Class used to create a InvsMccCodeGetRequest Udt Request
 *
 */

public class InvsMccCodeGetRequest extends InvsMccCodeSubRequestParent {
/**
 *
 * Constructor to create a  InvsMccCodeGetRequest
 * @param id Unique request name
 * @param InvsMccCodeGetIn InvsMccCodeObjectKeyData for InvsMccCodeGetRequest
 *
 */
@JsonCreator
  public InvsMccCodeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsMccCode")InvsMccCodeObjectKeyData InvsMccCodeGetIn) {
    super(id, "InvsMccCodeGet");
    if (InvsMccCodeGetIn != null) {
      addInput("InvsMccCode", InvsMccCodeObjectKeyHelper.toMap(InvsMccCodeGetIn, new HashMap(), "InvsMccCodeObjectKeyData").get("InvsMccCodeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsMccCodeObjectData that results from the InvsMccCodeGetRequest call
 * @return InvsMccCodeObjectData resulting from udt call
 *
 */

  public InvsMccCodeObjectData getOutput() {
    return InvsMccCodeObjectHelper.fromMap(outputMap, "InvsMccCode");
  }
}
