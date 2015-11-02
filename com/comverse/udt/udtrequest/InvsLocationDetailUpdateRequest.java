/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationDetailUpdateRequest.java
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
 * Class used to create a InvsLocationDetailUpdateRequest Udt Request
 *
 */

public class InvsLocationDetailUpdateRequest extends InvsLocationDetailSubRequestParent {
/**
 *
 * Constructor to create a  InvsLocationDetailUpdateRequest
 * @param id Unique request name
 * @param ILDUpdateIn InvsLocationDetailObjectData for InvsLocationDetailUpdateRequest
 *
 */
@JsonCreator
  public InvsLocationDetailUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLocationDetail")InvsLocationDetailObjectData ILDUpdateIn) {
    super(id, "InvsLocationDetailUpdate");
    if (ILDUpdateIn != null) {
      addInput("InvsLocationDetail", InvsLocationDetailObjectHelper.toMap(ILDUpdateIn, new HashMap(), "InvsLocationDetail").get("InvsLocationDetail"));
    }
  }

/**
 *
 * Retrieves the InvsLocationDetailObjectData that results from the InvsLocationDetailUpdateRequest call
 * @return InvsLocationDetailObjectData resulting from udt call
 *
 */

  public InvsLocationDetailObjectData getOutput() {
    return InvsLocationDetailObjectHelper.fromMap(outputMap, "InvsLocationDetail");
  }
}
