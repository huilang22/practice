/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingTypeDeleteRequest.java
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
 * Class used to create a CtcRatingTypeDeleteRequest Udt Request
 *
 */

public class CtcRatingTypeDeleteRequest extends CtcRatingTypeSubRequestParent {
/**
 *
 * Constructor to create a  CtcRatingTypeDeleteRequest
 * @param id Unique request name
 * @param DeleteIn CtcRatingTypeObjectKeyData for CtcRatingTypeDeleteRequest
 *
 */
@JsonCreator
  public CtcRatingTypeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcRatingType")CtcRatingTypeObjectKeyData DeleteIn) {
    super(id, "CtcRatingTypeDelete");
    if (DeleteIn != null) {
      addInput("CtcRatingType", CtcRatingTypeObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcRatingTypeObjectKeyData").get("CtcRatingTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcRatingTypeObjectData that results from the CtcRatingTypeDeleteRequest call
 * @return CtcRatingTypeObjectData resulting from udt call
 *
 */

  public CtcRatingTypeObjectData getOutput() {
    return CtcRatingTypeObjectHelper.fromMap(outputMap, "CtcRatingType");
  }
}
