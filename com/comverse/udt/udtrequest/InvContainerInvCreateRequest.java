/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvContainerInvCreateRequest.java
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
 * Class used to create a InvContainerInvCreateRequest Udt Request
 *
 */

public class InvContainerInvCreateRequest extends InvContainerInvSubRequestParent {
/**
 *
 * Constructor to create a  InvContainerInvCreateRequest
 * @param id Unique request name
 * @param InvContainerInvCreateIn InvContainerInvObjectData for InvContainerInvCreateRequest
 *
 */
@JsonCreator
  public InvContainerInvCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvContainerInv")InvContainerInvObjectData InvContainerInvCreateIn) {
    super(id, "InvContainerInvCreate");
    if (InvContainerInvCreateIn != null) {
      addInput("InvContainerInv", InvContainerInvObjectHelper.toMap(InvContainerInvCreateIn, new HashMap(), "InvContainerInv").get("InvContainerInv"));
    }
  }

/**
 *
 * Retrieves the InvContainerInvObjectData that results from the InvContainerInvCreateRequest call
 * @return InvContainerInvObjectData resulting from udt call
 *
 */

  public InvContainerInvObjectData getOutput() {
    return InvContainerInvObjectHelper.fromMap(outputMap, "InvContainerInv");
  }
}
