/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationDetailFindRequest.java
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
 * Class used to create a InvsLocationDetailFindRequest Udt Request
 *
 */

public class InvsLocationDetailFindRequest extends InvsLocationDetailRequest {
/**
 *
 * Constructor to create a  InvsLocationDetailFindRequest
 * @param id Unique request name
 * @param ILDFindIn InvsLocationDetailObjectFilter for InvsLocationDetailFindRequest
 *
 */
@JsonCreator
  public InvsLocationDetailFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLocationDetail")InvsLocationDetailObjectFilter ILDFindIn) {
    super(id, "InvsLocationDetailFind");
    if (ILDFindIn != null) {
      Integer index =  ILDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsLocationDetail", InvsLocationDetailObjectHelper.toMap(ILDFindIn, new HashMap(), "InvsLocationDetail").get("InvsLocationDetail"));
    }
  }

/**
 *
 * Retrieves the InvsLocationDetailObjectDataList that results from the InvsLocationDetailFindRequest call
 * @return InvsLocationDetailObjectDataList resulting from udt call
 *
 */

  public InvsLocationDetailObjectDataList getOutput() {
    return InvsLocationDetailObjectHelper.fromMapList(outputMap, "InvsLocationDetailList");
  }
}
