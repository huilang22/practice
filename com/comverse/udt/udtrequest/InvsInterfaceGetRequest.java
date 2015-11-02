/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsInterfaceGetRequest.java
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
 * Class used to create a InvsInterfaceGetRequest Udt Request
 *
 */

public class InvsInterfaceGetRequest extends InvsInterfaceSubRequestParent {
/**
 *
 * Constructor to create a  InvsInterfaceGetRequest
 * @param id Unique request name
 * @param InvsInterfaceGetIn InvsInterfaceObjectKeyData for InvsInterfaceGetRequest
 *
 */
@JsonCreator
  public InvsInterfaceGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsInterface")InvsInterfaceObjectKeyData InvsInterfaceGetIn) {
    super(id, "InvsInterfaceGet");
    if (InvsInterfaceGetIn != null) {
      addInput("InvsInterface", InvsInterfaceObjectKeyHelper.toMap(InvsInterfaceGetIn, new HashMap(), "InvsInterfaceObjectKeyData").get("InvsInterfaceObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsInterfaceObjectData that results from the InvsInterfaceGetRequest call
 * @return InvsInterfaceObjectData resulting from udt call
 *
 */

  public InvsInterfaceObjectData getOutput() {
    return InvsInterfaceObjectHelper.fromMap(outputMap, "InvsInterface");
  }
}
