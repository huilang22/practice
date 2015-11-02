/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingTypeUpdateRequest.java
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
 * Class used to create a CtcRatingTypeUpdateRequest Udt Request
 *
 */

public class CtcRatingTypeUpdateRequest extends CtcRatingTypeSubRequestParent {
/**
 *
 * Constructor to create a  CtcRatingTypeUpdateRequest
 * @param id Unique request name
 * @param UpdateIn CtcRatingTypeObjectData for CtcRatingTypeUpdateRequest
 *
 */
@JsonCreator
  public CtcRatingTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcRatingType")CtcRatingTypeObjectData UpdateIn) {
    super(id, "CtcRatingTypeUpdate");
    if (UpdateIn != null) {
      addInput("CtcRatingType", CtcRatingTypeObjectHelper.toMap(UpdateIn, new HashMap(), "CtcRatingType").get("CtcRatingType"));
    }
  }

/**
 *
 * Retrieves the CtcRatingTypeObjectData that results from the CtcRatingTypeUpdateRequest call
 * @return CtcRatingTypeObjectData resulting from udt call
 *
 */

  public CtcRatingTypeObjectData getOutput() {
    return CtcRatingTypeObjectHelper.fromMap(outputMap, "CtcRatingType");
  }
}
