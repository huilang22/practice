/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimResellerGetRequest.java
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
 * Class used to create a InvsSimResellerGetRequest Udt Request
 *
 */

public class InvsSimResellerGetRequest extends InvsSimResellerSubRequestParent {
/**
 *
 * Constructor to create a  InvsSimResellerGetRequest
 * @param id Unique request name
 * @param InvsSimResellerGetIn InvsSimResellerObjectKeyData for InvsSimResellerGetRequest
 *
 */
@JsonCreator
  public InvsSimResellerGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSimReseller")InvsSimResellerObjectKeyData InvsSimResellerGetIn) {
    super(id, "InvsSimResellerGet");
    if (InvsSimResellerGetIn != null) {
      addInput("InvsSimReseller", InvsSimResellerObjectKeyHelper.toMap(InvsSimResellerGetIn, new HashMap(), "InvsSimResellerObjectKeyData").get("InvsSimResellerObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsSimResellerObjectData that results from the InvsSimResellerGetRequest call
 * @return InvsSimResellerObjectData resulting from udt call
 *
 */

  public InvsSimResellerObjectData getOutput() {
    return InvsSimResellerObjectHelper.fromMap(outputMap, "InvsSimReseller");
  }
}
