/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsInterfaceCreateRequest.java
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
 * Class used to create a InvsInterfaceCreateRequest Udt Request
 *
 */

public class InvsInterfaceCreateRequest extends InvsInterfaceSubRequestParent {
/**
 *
 * Constructor to create a  InvsInterfaceCreateRequest
 * @param id Unique request name
 * @param InvsInterfaceCreateIn InvsInterfaceObjectData for InvsInterfaceCreateRequest
 *
 */
@JsonCreator
  public InvsInterfaceCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsInterface")InvsInterfaceObjectData InvsInterfaceCreateIn) {
    super(id, "InvsInterfaceCreate");
    if (InvsInterfaceCreateIn != null) {
      addInput("InvsInterface", InvsInterfaceObjectHelper.toMap(InvsInterfaceCreateIn, new HashMap(), "InvsInterface").get("InvsInterface"));
    }
  }

/**
 *
 * Retrieves the InvsInterfaceObjectData that results from the InvsInterfaceCreateRequest call
 * @return InvsInterfaceObjectData resulting from udt call
 *
 */

  public InvsInterfaceObjectData getOutput() {
    return InvsInterfaceObjectHelper.fromMap(outputMap, "InvsInterface");
  }
}
