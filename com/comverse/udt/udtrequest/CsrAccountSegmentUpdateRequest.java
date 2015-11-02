/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrAccountSegmentUpdateRequest.java
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
 * Class used to create a CsrAccountSegmentUpdateRequest Udt Request
 *
 */

public class CsrAccountSegmentUpdateRequest extends CsrAccountSegmentSubRequestParent {
/**
 *
 * Constructor to create a  CsrAccountSegmentUpdateRequest
 * @param id Unique request name
 * @param CASUpdateIn CsrAccountSegmentObjectData for CsrAccountSegmentUpdateRequest
 *
 */
@JsonCreator
  public CsrAccountSegmentUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CsrAccountSegment")CsrAccountSegmentObjectData CASUpdateIn) {
    super(id, "CsrAccountSegmentUpdate");
    if (CASUpdateIn != null) {
      addInput("CsrAccountSegment", CsrAccountSegmentObjectHelper.toMap(CASUpdateIn, new HashMap(), "CsrAccountSegment").get("CsrAccountSegment"));
    }
  }

/**
 *
 * Retrieves the CsrAccountSegmentObjectData that results from the CsrAccountSegmentUpdateRequest call
 * @return CsrAccountSegmentObjectData resulting from udt call
 *
 */

  public CsrAccountSegmentObjectData getOutput() {
    return CsrAccountSegmentObjectHelper.fromMap(outputMap, "CsrAccountSegment");
  }
}
