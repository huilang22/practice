/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationDetailCreateRequest.java
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
 * Class used to create a InvsLocationDetailCreateRequest Udt Request
 *
 */

public class InvsLocationDetailCreateRequest extends InvsLocationDetailSubRequestParent {
/**
 *
 * Constructor to create a  InvsLocationDetailCreateRequest
 * @param id Unique request name
 * @param ILDCreateIn InvsLocationDetailObjectData for InvsLocationDetailCreateRequest
 *
 */
@JsonCreator
  public InvsLocationDetailCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLocationDetail")InvsLocationDetailObjectData ILDCreateIn) {
    super(id, "InvsLocationDetailCreate");
    if (ILDCreateIn != null) {
      addInput("InvsLocationDetail", InvsLocationDetailObjectHelper.toMap(ILDCreateIn, new HashMap(), "InvsLocationDetail").get("InvsLocationDetail"));
    }
  }

/**
 *
 * Retrieves the InvsLocationDetailObjectData that results from the InvsLocationDetailCreateRequest call
 * @return InvsLocationDetailObjectData resulting from udt call
 *
 */

  public InvsLocationDetailObjectData getOutput() {
    return InvsLocationDetailObjectHelper.fromMap(outputMap, "InvsLocationDetail");
  }
}
