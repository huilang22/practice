/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationDetailGetRequest.java
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
 * Class used to create a InvsLocationDetailGetRequest Udt Request
 *
 */

public class InvsLocationDetailGetRequest extends InvsLocationDetailSubRequestParent {
/**
 *
 * Constructor to create a  InvsLocationDetailGetRequest
 * @param id Unique request name
 * @param ILDGetIn InvsLocationDetailObjectKeyData for InvsLocationDetailGetRequest
 *
 */
@JsonCreator
  public InvsLocationDetailGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLocationDetail")InvsLocationDetailObjectKeyData ILDGetIn) {
    super(id, "InvsLocationDetailGet");
    if (ILDGetIn != null) {
      addInput("InvsLocationDetail", InvsLocationDetailObjectKeyHelper.toMap(ILDGetIn, new HashMap(), "InvsLocationDetailObjectKeyData").get("InvsLocationDetailObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsLocationDetailObjectData that results from the InvsLocationDetailGetRequest call
 * @return InvsLocationDetailObjectData resulting from udt call
 *
 */

  public InvsLocationDetailObjectData getOutput() {
    return InvsLocationDetailObjectHelper.fromMap(outputMap, "InvsLocationDetail");
  }
}
