/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingTypeGetRequest.java
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
 * Class used to create a CtcRatingTypeGetRequest Udt Request
 *
 */

public class CtcRatingTypeGetRequest extends CtcRatingTypeSubRequestParent {
/**
 *
 * Constructor to create a  CtcRatingTypeGetRequest
 * @param id Unique request name
 * @param GetIn CtcRatingTypeObjectKeyData for CtcRatingTypeGetRequest
 *
 */
@JsonCreator
  public CtcRatingTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcRatingType")CtcRatingTypeObjectKeyData GetIn) {
    super(id, "CtcRatingTypeGet");
    if (GetIn != null) {
      addInput("CtcRatingType", CtcRatingTypeObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcRatingTypeObjectKeyData").get("CtcRatingTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcRatingTypeObjectData that results from the CtcRatingTypeGetRequest call
 * @return CtcRatingTypeObjectData resulting from udt call
 *
 */

  public CtcRatingTypeObjectData getOutput() {
    return CtcRatingTypeObjectHelper.fromMap(outputMap, "CtcRatingType");
  }
}
