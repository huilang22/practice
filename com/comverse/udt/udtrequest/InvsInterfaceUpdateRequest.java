/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsInterfaceUpdateRequest.java
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
 * Class used to create a InvsInterfaceUpdateRequest Udt Request
 *
 */

public class InvsInterfaceUpdateRequest extends InvsInterfaceSubRequestParent {
/**
 *
 * Constructor to create a  InvsInterfaceUpdateRequest
 * @param id Unique request name
 * @param InvsInterfaceUpdateIn InvsInterfaceObjectData for InvsInterfaceUpdateRequest
 *
 */
@JsonCreator
  public InvsInterfaceUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsInterface")InvsInterfaceObjectData InvsInterfaceUpdateIn) {
    super(id, "InvsInterfaceUpdate");
    if (InvsInterfaceUpdateIn != null) {
      addInput("InvsInterface", InvsInterfaceObjectHelper.toMap(InvsInterfaceUpdateIn, new HashMap(), "InvsInterface").get("InvsInterface"));
    }
  }

/**
 *
 * Retrieves the InvsInterfaceObjectData that results from the InvsInterfaceUpdateRequest call
 * @return InvsInterfaceObjectData resulting from udt call
 *
 */

  public InvsInterfaceObjectData getOutput() {
    return InvsInterfaceObjectHelper.fromMap(outputMap, "InvsInterface");
  }
}
