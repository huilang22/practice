/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsProfileFindRequest.java
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
 * Class used to create a InvsProfileFindRequest Udt Request
 *
 */

public class InvsProfileFindRequest extends InvsProfileRequest {
/**
 *
 * Constructor to create a  InvsProfileFindRequest
 * @param id Unique request name
 * @param InvsProfileFindIn InvsProfileObjectFilter for InvsProfileFindRequest
 *
 */
@JsonCreator
  public InvsProfileFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsProfile")InvsProfileObjectFilter InvsProfileFindIn) {
    super(id, "InvsProfileFind");
    if (InvsProfileFindIn != null) {
      Integer index =  InvsProfileFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsProfile", InvsProfileObjectHelper.toMap(InvsProfileFindIn, new HashMap(), "InvsProfile").get("InvsProfile"));
    }
  }

/**
 *
 * Retrieves the InvsProfileObjectDataList that results from the InvsProfileFindRequest call
 * @return InvsProfileObjectDataList resulting from udt call
 *
 */

  public InvsProfileObjectDataList getOutput() {
    return InvsProfileObjectHelper.fromMapList(outputMap, "InvsProfileList");
  }
}
