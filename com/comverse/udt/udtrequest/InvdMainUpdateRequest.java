/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainUpdateRequest.java
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
 * Class used to create a InvdMainUpdateRequest Udt Request
 *
 */

public class InvdMainUpdateRequest extends InvdMainSubRequestParent {
/**
 *
 * Constructor to create a  InvdMainUpdateRequest
 * @param id Unique request name
 * @param InvdMainUpdateIn InvdMainObjectData for InvdMainUpdateRequest
 *
 */
@JsonCreator
  public InvdMainUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdMain")InvdMainObjectData InvdMainUpdateIn) {
    super(id, "InvdMainUpdate");
    if (InvdMainUpdateIn != null) {
      addInput("InvdMain", InvdMainObjectHelper.toMap(InvdMainUpdateIn, new HashMap(), "InvdMain").get("InvdMain"));
    }
  }

/**
 *
 * Retrieves the InvdMainObjectData that results from the InvdMainUpdateRequest call
 * @return InvdMainObjectData resulting from udt call
 *
 */

  public InvdMainObjectData getOutput() {
    return InvdMainObjectHelper.fromMap(outputMap, "InvdMain");
  }
}
