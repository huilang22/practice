/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsMccCodeUpdateRequest.java
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
 * Class used to create a InvsMccCodeUpdateRequest Udt Request
 *
 */

public class InvsMccCodeUpdateRequest extends InvsMccCodeSubRequestParent {
/**
 *
 * Constructor to create a  InvsMccCodeUpdateRequest
 * @param id Unique request name
 * @param InvsMccCodeUpdateIn InvsMccCodeObjectData for InvsMccCodeUpdateRequest
 *
 */
@JsonCreator
  public InvsMccCodeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsMccCode")InvsMccCodeObjectData InvsMccCodeUpdateIn) {
    super(id, "InvsMccCodeUpdate");
    if (InvsMccCodeUpdateIn != null) {
      addInput("InvsMccCode", InvsMccCodeObjectHelper.toMap(InvsMccCodeUpdateIn, new HashMap(), "InvsMccCode").get("InvsMccCode"));
    }
  }

/**
 *
 * Retrieves the InvsMccCodeObjectData that results from the InvsMccCodeUpdateRequest call
 * @return InvsMccCodeObjectData resulting from udt call
 *
 */

  public InvsMccCodeObjectData getOutput() {
    return InvsMccCodeObjectHelper.fromMap(outputMap, "InvsMccCode");
  }
}
