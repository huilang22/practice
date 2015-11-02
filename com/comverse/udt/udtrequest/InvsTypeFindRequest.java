/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeFindRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsTypeFindRequest Udt Request
 *
 */

public class InvsTypeFindRequest extends InvsTypeRequest {
/**
 *
 * Constructor to create a  InvsTypeFindRequest
 * @param id Unique request name
 * @param InvsTypeFindIn InvsTypeObjectFilter for InvsTypeFindRequest
 *
 */
@JsonCreator
  public InvsTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsType")InvsTypeObjectFilter InvsTypeFindIn) {
    super(id, "InvsTypeFind");
    if (InvsTypeFindIn != null) {
      Integer index =  InvsTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsType", InvsTypeObjectHelper.toMap(InvsTypeFindIn, new HashMap(), "InvsType").get("InvsType"));
    }
  }

/**
 *
 * Retrieves the InvsTypeObjectDataList that results from the InvsTypeFindRequest call
 * @return InvsTypeObjectDataList resulting from udt call
 *
 */

  public InvsTypeObjectDataList getOutput() {
    return InvsTypeObjectHelper.fromMapList(outputMap, "InvsTypeList");
  }
}
