/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvContainerCreateRequest.java
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
 * Class used to create a InvContainerCreateRequest Udt Request
 *
 */

public class InvContainerCreateRequest extends InvContainerSubRequestParent {
/**
 *
 * Constructor to create a  InvContainerCreateRequest
 * @param id Unique request name
 * @param InvContainerCreateIn InvContainerObjectData for InvContainerCreateRequest
 *
 */
@JsonCreator
  public InvContainerCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvContainer")InvContainerObjectData InvContainerCreateIn) {
    super(id, "InvContainerCreate");
    if (InvContainerCreateIn != null) {
      addInput("InvContainer", InvContainerObjectHelper.toMap(InvContainerCreateIn, new HashMap(), "InvContainer").get("InvContainer"));
    }
  }

/**
 *
 * Retrieves the InvContainerObjectData that results from the InvContainerCreateRequest call
 * @return InvContainerObjectData resulting from udt call
 *
 */

  public InvContainerObjectData getOutput() {
    return InvContainerObjectHelper.fromMap(outputMap, "InvContainer");
  }
}
