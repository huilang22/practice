/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcContentTypeDeleteRequest.java
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
 * Class used to create a CtcContentTypeDeleteRequest Udt Request
 *
 */

public class CtcContentTypeDeleteRequest extends CtcContentTypeSubRequestParent {
/**
 *
 * Constructor to create a  CtcContentTypeDeleteRequest
 * @param id Unique request name
 * @param DeleteIn CtcContentTypeObjectKeyData for CtcContentTypeDeleteRequest
 *
 */
@JsonCreator
  public CtcContentTypeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcContentType")CtcContentTypeObjectKeyData DeleteIn) {
    super(id, "CtcContentTypeDelete");
    if (DeleteIn != null) {
      addInput("CtcContentType", CtcContentTypeObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcContentTypeObjectKeyData").get("CtcContentTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcContentTypeObjectData that results from the CtcContentTypeDeleteRequest call
 * @return CtcContentTypeObjectData resulting from udt call
 *
 */

  public CtcContentTypeObjectData getOutput() {
    return CtcContentTypeObjectHelper.fromMap(outputMap, "CtcContentType");
  }
}
