/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemUrlGetRequest.java
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
 * Class used to create a CtcItemUrlGetRequest Udt Request
 *
 */

public class CtcItemUrlGetRequest extends CtcItemUrlSubRequestParent {
/**
 *
 * Constructor to create a  CtcItemUrlGetRequest
 * @param id Unique request name
 * @param GetIn CtcItemUrlObjectKeyData for CtcItemUrlGetRequest
 *
 */
@JsonCreator
  public CtcItemUrlGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcItemUrl")CtcItemUrlObjectKeyData GetIn) {
    super(id, "CtcItemUrlGet");
    if (GetIn != null) {
      addInput("CtcItemUrl", CtcItemUrlObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcItemUrlObjectKeyData").get("CtcItemUrlObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcItemUrlObjectData that results from the CtcItemUrlGetRequest call
 * @return CtcItemUrlObjectData resulting from udt call
 *
 */

  public CtcItemUrlObjectData getOutput() {
    return CtcItemUrlObjectHelper.fromMap(outputMap, "CtcItemUrl");
  }
}
