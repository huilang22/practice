/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineUpdateRequest.java
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
 * Class used to create a InvsLineUpdateRequest Udt Request
 *
 */

public class InvsLineUpdateRequest extends InvsLineSubRequestParent {
/**
 *
 * Constructor to create a  InvsLineUpdateRequest
 * @param id Unique request name
 * @param InvsLineUpdateIn InvsLineObjectData for InvsLineUpdateRequest
 *
 */
@JsonCreator
  public InvsLineUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLine")InvsLineObjectData InvsLineUpdateIn) {
    super(id, "InvsLineUpdate");
    if (InvsLineUpdateIn != null) {
      addInput("InvsLine", InvsLineObjectHelper.toMap(InvsLineUpdateIn, new HashMap(), "InvsLine").get("InvsLine"));
    }
  }

/**
 *
 * Retrieves the InvsLineObjectData that results from the InvsLineUpdateRequest call
 * @return InvsLineObjectData resulting from udt call
 *
 */

  public InvsLineObjectData getOutput() {
    return InvsLineObjectHelper.fromMap(outputMap, "InvsLine");
  }
}
