/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrAccountSegmentDeleteRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CsrAccountSegmentDeleteRequest Udt Request
 *
 */

public class CsrAccountSegmentDeleteRequest extends CsrAccountSegmentSubRequestParent {
/**
 *
 * Constructor to create a  CsrAccountSegmentDeleteRequest
 * @param id Unique request name
 * @param CASDeleteIn CsrAccountSegmentObjectKeyData for CsrAccountSegmentDeleteRequest
 *
 */
@JsonCreator
  public CsrAccountSegmentDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CsrAccountSegment")CsrAccountSegmentObjectKeyData CASDeleteIn) {
    super(id, "CsrAccountSegmentDelete");
    if (CASDeleteIn != null) {
      addInput("CsrAccountSegment", CsrAccountSegmentObjectKeyHelper.toMap(CASDeleteIn, new HashMap(), "CsrAccountSegmentObjectKeyData").get("CsrAccountSegmentObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CsrAccountSegmentObjectData that results from the CsrAccountSegmentDeleteRequest call
 * @return CsrAccountSegmentObjectData resulting from udt call
 *
 */

  public CsrAccountSegmentObjectData getOutput() {
    return CsrAccountSegmentObjectHelper.fromMap(outputMap, "CsrAccountSegment");
  }
}
