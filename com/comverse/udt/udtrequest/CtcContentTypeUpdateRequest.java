/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcContentTypeUpdateRequest.java
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
 * Class used to create a CtcContentTypeUpdateRequest Udt Request
 *
 */

public class CtcContentTypeUpdateRequest extends CtcContentTypeSubRequestParent {
/**
 *
 * Constructor to create a  CtcContentTypeUpdateRequest
 * @param id Unique request name
 * @param UpdateIn CtcContentTypeObjectData for CtcContentTypeUpdateRequest
 *
 */
@JsonCreator
  public CtcContentTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcContentType")CtcContentTypeObjectData UpdateIn) {
    super(id, "CtcContentTypeUpdate");
    if (UpdateIn != null) {
      addInput("CtcContentType", CtcContentTypeObjectHelper.toMap(UpdateIn, new HashMap(), "CtcContentType").get("CtcContentType"));
    }
  }

/**
 *
 * Retrieves the CtcContentTypeObjectData that results from the CtcContentTypeUpdateRequest call
 * @return CtcContentTypeObjectData resulting from udt call
 *
 */

  public CtcContentTypeObjectData getOutput() {
    return CtcContentTypeObjectHelper.fromMap(outputMap, "CtcContentType");
  }
}
