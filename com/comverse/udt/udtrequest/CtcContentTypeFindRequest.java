/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcContentTypeFindRequest.java
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
 * Class used to create a CtcContentTypeFindRequest Udt Request
 *
 */

public class CtcContentTypeFindRequest extends CtcContentTypeRequest {
/**
 *
 * Constructor to create a  CtcContentTypeFindRequest
 * @param id Unique request name
 * @param FindIn CtcContentTypeObjectFilter for CtcContentTypeFindRequest
 *
 */
@JsonCreator
  public CtcContentTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcContentType")CtcContentTypeObjectFilter FindIn) {
    super(id, "CtcContentTypeFind");
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcContentType", CtcContentTypeObjectHelper.toMap(FindIn, new HashMap(), "CtcContentType").get("CtcContentType"));
    }
  }

/**
 *
 * Retrieves the CtcContentTypeObjectDataList that results from the CtcContentTypeFindRequest call
 * @return CtcContentTypeObjectDataList resulting from udt call
 *
 */

  public CtcContentTypeObjectDataList getOutput() {
    return CtcContentTypeObjectHelper.fromMapList(outputMap, "CtcContentTypeList");
  }
}
