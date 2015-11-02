/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrAccountSegmentFindRequest.java
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
 * Class used to create a CsrAccountSegmentFindRequest Udt Request
 *
 */

public class CsrAccountSegmentFindRequest extends CsrAccountSegmentRequest {
/**
 *
 * Constructor to create a  CsrAccountSegmentFindRequest
 * @param id Unique request name
 * @param CASFindIn CsrAccountSegmentObjectFilter for CsrAccountSegmentFindRequest
 *
 */
@JsonCreator
  public CsrAccountSegmentFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CsrAccountSegment")CsrAccountSegmentObjectFilter CASFindIn) {
    super(id, "CsrAccountSegmentFind");
    if (CASFindIn != null) {
      Integer index =  CASFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CsrAccountSegment", CsrAccountSegmentObjectHelper.toMap(CASFindIn, new HashMap(), "CsrAccountSegment").get("CsrAccountSegment"));
    }
  }

/**
 *
 * Retrieves the CsrAccountSegmentObjectDataList that results from the CsrAccountSegmentFindRequest call
 * @return CsrAccountSegmentObjectDataList resulting from udt call
 *
 */

  public CsrAccountSegmentObjectDataList getOutput() {
    return CsrAccountSegmentObjectHelper.fromMapList(outputMap, "CsrAccountSegmentList");
  }
}
