/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemUpdateRequest.java
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
 * Class used to create a CtcItemUpdateRequest Udt Request
 *
 */

public class CtcItemUpdateRequest extends CtcItemSubRequestParent {
/**
 *
 * Constructor to create a  CtcItemUpdateRequest
 * @param id Unique request name
 * @param UpdateIn CtcItemObjectData for CtcItemUpdateRequest
 *
 */
@JsonCreator
  public CtcItemUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcItem")CtcItemObjectData UpdateIn) {
    super(id, "CtcItemUpdate");
    if (UpdateIn != null) {
      addInput("CtcItem", CtcItemObjectHelper.toMap(UpdateIn, new HashMap(), "CtcItem").get("CtcItem"));
    }
  }

/**
 *
 * Retrieves the CtcItemObjectData that results from the CtcItemUpdateRequest call
 * @return CtcItemObjectData resulting from udt call
 *
 */

  public CtcItemObjectData getOutput() {
    return CtcItemObjectHelper.fromMap(outputMap, "CtcItem");
  }
}
