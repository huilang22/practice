/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationDetailDeleteRequest.java
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
 * Class used to create a InvsLocationDetailDeleteRequest Udt Request
 *
 */

public class InvsLocationDetailDeleteRequest extends InvsLocationDetailSubRequestParent {
/**
 *
 * Constructor to create a  InvsLocationDetailDeleteRequest
 * @param id Unique request name
 * @param ILDDeleteIn InvsLocationDetailObjectKeyData for InvsLocationDetailDeleteRequest
 *
 */
@JsonCreator
  public InvsLocationDetailDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLocationDetail")InvsLocationDetailObjectKeyData ILDDeleteIn) {
    super(id, "InvsLocationDetailDelete");
    if (ILDDeleteIn != null) {
      addInput("InvsLocationDetail", InvsLocationDetailObjectKeyHelper.toMap(ILDDeleteIn, new HashMap(), "InvsLocationDetailObjectKeyData").get("InvsLocationDetailObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsLocationDetailObjectData that results from the InvsLocationDetailDeleteRequest call
 * @return InvsLocationDetailObjectData resulting from udt call
 *
 */

  public InvsLocationDetailObjectData getOutput() {
    return InvsLocationDetailObjectHelper.fromMap(outputMap, "InvsLocationDetail");
  }
}
