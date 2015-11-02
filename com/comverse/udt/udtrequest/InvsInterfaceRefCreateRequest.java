/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsInterfaceRefCreateRequest.java
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
 * Class used to create a InvsInterfaceRefCreateRequest Udt Request
 *
 */

public class InvsInterfaceRefCreateRequest extends InvsInterfaceRefSubRequestParent {
/**
 *
 * Constructor to create a  InvsInterfaceRefCreateRequest
 * @param id Unique request name
 * @param InvsInterfaceRefCreateIn InvsInterfaceRefObjectData for InvsInterfaceRefCreateRequest
 *
 */
@JsonCreator
  public InvsInterfaceRefCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsInterfaceRef")InvsInterfaceRefObjectData InvsInterfaceRefCreateIn) {
    super(id, "InvsInterfaceRefCreate");
    if (InvsInterfaceRefCreateIn != null) {
      addInput("InvsInterfaceRef", InvsInterfaceRefObjectHelper.toMap(InvsInterfaceRefCreateIn, new HashMap(), "InvsInterfaceRef").get("InvsInterfaceRef"));
    }
  }

/**
 *
 * Retrieves the InvsInterfaceRefObjectData that results from the InvsInterfaceRefCreateRequest call
 * @return InvsInterfaceRefObjectData resulting from udt call
 *
 */

  public InvsInterfaceRefObjectData getOutput() {
    return InvsInterfaceRefObjectHelper.fromMap(outputMap, "InvsInterfaceRef");
  }
}
