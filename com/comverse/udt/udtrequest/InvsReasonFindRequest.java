/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsReasonFindRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsReasonFindRequest Udt Request
 *
 */

public class InvsReasonFindRequest extends InvsReasonRequest {
/**
 *
 * Constructor to create a  InvsReasonFindRequest
 * @param id Unique request name
 * @param InvsReasonFindIn InvsReasonObjectFilter for InvsReasonFindRequest
 *
 */
@JsonCreator
  public InvsReasonFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsReason")InvsReasonObjectFilter InvsReasonFindIn) {
    super(id, "InvsReasonFind");
    if (InvsReasonFindIn != null) {
      Integer index =  InvsReasonFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsReason", InvsReasonObjectHelper.toMap(InvsReasonFindIn, new HashMap(), "InvsReason").get("InvsReason"));
    }
  }

/**
 *
 * Retrieves the InvsReasonObjectDataList that results from the InvsReasonFindRequest call
 * @return InvsReasonObjectDataList resulting from udt call
 *
 */

  public InvsReasonObjectDataList getOutput() {
    return InvsReasonObjectHelper.fromMapList(outputMap, "InvsReasonList");
  }
}
