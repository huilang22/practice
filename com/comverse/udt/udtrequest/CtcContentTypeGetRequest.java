/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcContentTypeGetRequest.java
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
 * Class used to create a CtcContentTypeGetRequest Udt Request
 *
 */

public class CtcContentTypeGetRequest extends CtcContentTypeSubRequestParent {
/**
 *
 * Constructor to create a  CtcContentTypeGetRequest
 * @param id Unique request name
 * @param GetIn CtcContentTypeObjectKeyData for CtcContentTypeGetRequest
 *
 */
@JsonCreator
  public CtcContentTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcContentType")CtcContentTypeObjectKeyData GetIn) {
    super(id, "CtcContentTypeGet");
    if (GetIn != null) {
      addInput("CtcContentType", CtcContentTypeObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcContentTypeObjectKeyData").get("CtcContentTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcContentTypeObjectData that results from the CtcContentTypeGetRequest call
 * @return CtcContentTypeObjectData resulting from udt call
 *
 */

  public CtcContentTypeObjectData getOutput() {
    return CtcContentTypeObjectHelper.fromMap(outputMap, "CtcContentType");
  }
}
