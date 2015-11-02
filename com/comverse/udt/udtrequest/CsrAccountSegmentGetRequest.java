/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrAccountSegmentGetRequest.java
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
 * Class used to create a CsrAccountSegmentGetRequest Udt Request
 *
 */

public class CsrAccountSegmentGetRequest extends CsrAccountSegmentSubRequestParent {
/**
 *
 * Constructor to create a  CsrAccountSegmentGetRequest
 * @param id Unique request name
 * @param CASGetIn CsrAccountSegmentObjectKeyData for CsrAccountSegmentGetRequest
 *
 */
@JsonCreator
  public CsrAccountSegmentGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CsrAccountSegment")CsrAccountSegmentObjectKeyData CASGetIn) {
    super(id, "CsrAccountSegmentGet");
    if (CASGetIn != null) {
      addInput("CsrAccountSegment", CsrAccountSegmentObjectKeyHelper.toMap(CASGetIn, new HashMap(), "CsrAccountSegmentObjectKeyData").get("CsrAccountSegmentObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CsrAccountSegmentObjectData that results from the CsrAccountSegmentGetRequest call
 * @return CsrAccountSegmentObjectData resulting from udt call
 *
 */

  public CsrAccountSegmentObjectData getOutput() {
    return CsrAccountSegmentObjectHelper.fromMap(outputMap, "CsrAccountSegment");
  }
}
