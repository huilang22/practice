/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcContentTypeCreateRequest.java
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
 * Class used to create a CtcContentTypeCreateRequest Udt Request
 *
 */

public class CtcContentTypeCreateRequest extends CtcContentTypeSubRequestParent {
/**
 *
 * Constructor to create a  CtcContentTypeCreateRequest
 * @param id Unique request name
 * @param CreateIn CtcContentTypeObjectData for CtcContentTypeCreateRequest
 *
 */
@JsonCreator
  public CtcContentTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcContentType")CtcContentTypeObjectData CreateIn) {
    super(id, "CtcContentTypeCreate");
    if (CreateIn != null) {
      addInput("CtcContentType", CtcContentTypeObjectHelper.toMap(CreateIn, new HashMap(), "CtcContentType").get("CtcContentType"));
    }
  }

/**
 *
 * Retrieves the CtcContentTypeObjectData that results from the CtcContentTypeCreateRequest call
 * @return CtcContentTypeObjectData resulting from udt call
 *
 */

  public CtcContentTypeObjectData getOutput() {
    return CtcContentTypeObjectHelper.fromMap(outputMap, "CtcContentType");
  }
}
