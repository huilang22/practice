/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingTypeCreateRequest.java
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
 * Class used to create a CtcRatingTypeCreateRequest Udt Request
 *
 */

public class CtcRatingTypeCreateRequest extends CtcRatingTypeSubRequestParent {
/**
 *
 * Constructor to create a  CtcRatingTypeCreateRequest
 * @param id Unique request name
 * @param CreateIn CtcRatingTypeObjectData for CtcRatingTypeCreateRequest
 *
 */
@JsonCreator
  public CtcRatingTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcRatingType")CtcRatingTypeObjectData CreateIn) {
    super(id, "CtcRatingTypeCreate");
    if (CreateIn != null) {
      addInput("CtcRatingType", CtcRatingTypeObjectHelper.toMap(CreateIn, new HashMap(), "CtcRatingType").get("CtcRatingType"));
    }
  }

/**
 *
 * Retrieves the CtcRatingTypeObjectData that results from the CtcRatingTypeCreateRequest call
 * @return CtcRatingTypeObjectData resulting from udt call
 *
 */

  public CtcRatingTypeObjectData getOutput() {
    return CtcRatingTypeObjectHelper.fromMap(outputMap, "CtcRatingType");
  }
}
