/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrAccountSegmentCreateRequest.java
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
 * Class used to create a CsrAccountSegmentCreateRequest Udt Request
 *
 */

public class CsrAccountSegmentCreateRequest extends CsrAccountSegmentSubRequestParent {
/**
 *
 * Constructor to create a  CsrAccountSegmentCreateRequest
 * @param id Unique request name
 * @param CASCreateIn CsrAccountSegmentObjectData for CsrAccountSegmentCreateRequest
 *
 */
@JsonCreator
  public CsrAccountSegmentCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CsrAccountSegment")CsrAccountSegmentObjectData CASCreateIn) {
    super(id, "CsrAccountSegmentCreate");
    if (CASCreateIn != null) {
      addInput("CsrAccountSegment", CsrAccountSegmentObjectHelper.toMap(CASCreateIn, new HashMap(), "CsrAccountSegment").get("CsrAccountSegment"));
    }
  }

/**
 *
 * Retrieves the CsrAccountSegmentObjectData that results from the CsrAccountSegmentCreateRequest call
 * @return CsrAccountSegmentObjectData resulting from udt call
 *
 */

  public CsrAccountSegmentObjectData getOutput() {
    return CsrAccountSegmentObjectHelper.fromMap(outputMap, "CsrAccountSegment");
  }
}
