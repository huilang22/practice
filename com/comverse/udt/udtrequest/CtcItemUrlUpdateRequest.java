/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemUrlUpdateRequest.java
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

import com.csgsystems.ctc.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CtcItemUrlUpdateRequest Udt Request
 *
 */

public class CtcItemUrlUpdateRequest extends CtcItemUrlSubRequestParent {
/**
 *
 * Constructor to create a  CtcItemUrlUpdateRequest
 * @param id Unique request name
 * @param UpdateIn CtcItemUrlObjectData for CtcItemUrlUpdateRequest
 *
 */
@JsonCreator
  public CtcItemUrlUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcItemUrl")CtcItemUrlObjectData UpdateIn) {
    super(id, "CtcItemUrlUpdate");
    if (UpdateIn != null) {
      addInput("CtcItemUrl", CtcItemUrlObjectHelper.toMap(UpdateIn, new HashMap(), "CtcItemUrl").get("CtcItemUrl"));
    }
  }

/**
 *
 * Retrieves the CtcItemUrlObjectData that results from the CtcItemUrlUpdateRequest call
 * @return CtcItemUrlObjectData resulting from udt call
 *
 */

  public CtcItemUrlObjectData getOutput() {
    return CtcItemUrlObjectHelper.fromMap(outputMap, "CtcItemUrl");
  }
}
