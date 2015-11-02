/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementFindWithExtendedDataRequest.java
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
 * Class used to create a InvElementFindWithExtendedDataRequest Udt Request
 *
 */

public class InvElementFindWithExtendedDataRequest extends InvElementRequest {
/**
 *
 * Constructor to create a  InvElementFindWithExtendedDataRequest
 * @param id Unique request name
 * @param InvFndWithIn InvElementObjFilter for InvElementFindWithExtendedDataRequest
 *
 */
@JsonCreator
  public InvElementFindWithExtendedDataRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjFilter InvFndWithIn) {
    super(id, "InvElementFindWithExtendedData");
    if (InvFndWithIn != null) {
      Integer index =  InvFndWithIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvElement", InvElementObjHelper.toMap(InvFndWithIn, new HashMap(), "InvElement").get("InvElement"));
    }
  }

/**
 *
 * Retrieves the InvElementObjDataList that results from the InvElementFindWithExtendedDataRequest call
 * @return InvElementObjDataList resulting from udt call
 *
 */

  public InvElementObjDataList getOutput() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
  }
}
