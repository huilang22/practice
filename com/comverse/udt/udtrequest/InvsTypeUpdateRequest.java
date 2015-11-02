/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeUpdateRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsTypeUpdateRequest Udt Request
 *
 */

public class InvsTypeUpdateRequest extends InvsTypeSubRequestParent {
/**
 *
 * Constructor to create a  InvsTypeUpdateRequest
 * @param id Unique request name
 * @param InvsTypeUpdateIn InvsTypeObjectData for InvsTypeUpdateRequest
 *
 */
@JsonCreator
  public InvsTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsType")InvsTypeObjectData InvsTypeUpdateIn) {
    super(id, "InvsTypeUpdate");
    if (InvsTypeUpdateIn != null) {
      addInput("InvsType", InvsTypeObjectHelper.toMap(InvsTypeUpdateIn, new HashMap(), "InvsType").get("InvsType"));
    }
  }

/**
 *
 * Retrieves the InvsTypeObjectData that results from the InvsTypeUpdateRequest call
 * @return InvsTypeObjectData resulting from udt call
 *
 */

  public InvsTypeObjectData getOutput() {
    return InvsTypeObjectHelper.fromMap(outputMap, "InvsType");
  }
}
