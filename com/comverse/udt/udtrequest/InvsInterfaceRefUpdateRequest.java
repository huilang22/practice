/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsInterfaceRefUpdateRequest.java
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
 * Class used to create a InvsInterfaceRefUpdateRequest Udt Request
 *
 */

public class InvsInterfaceRefUpdateRequest extends InvsInterfaceRefSubRequestParent {
/**
 *
 * Constructor to create a  InvsInterfaceRefUpdateRequest
 * @param id Unique request name
 * @param InvsInterfaceRefUpdateIn InvsInterfaceRefObjectData for InvsInterfaceRefUpdateRequest
 *
 */
@JsonCreator
  public InvsInterfaceRefUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsInterfaceRef")InvsInterfaceRefObjectData InvsInterfaceRefUpdateIn) {
    super(id, "InvsInterfaceRefUpdate");
    if (InvsInterfaceRefUpdateIn != null) {
      addInput("InvsInterfaceRef", InvsInterfaceRefObjectHelper.toMap(InvsInterfaceRefUpdateIn, new HashMap(), "InvsInterfaceRef").get("InvsInterfaceRef"));
    }
  }

/**
 *
 * Retrieves the InvsInterfaceRefObjectData that results from the InvsInterfaceRefUpdateRequest call
 * @return InvsInterfaceRefObjectData resulting from udt call
 *
 */

  public InvsInterfaceRefObjectData getOutput() {
    return InvsInterfaceRefObjectHelper.fromMap(outputMap, "InvsInterfaceRef");
  }
}
