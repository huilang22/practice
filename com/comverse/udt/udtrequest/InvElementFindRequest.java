/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementFindRequest.java
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
 * Class used to create a InvElementFindRequest Udt Request
 *
 */

public class InvElementFindRequest extends InvElementRequest {
/**
 *
 * Constructor to create a  InvElementFindRequest
 * @param id Unique request name
 * @param InvFndIn InvElementObjFilter for InvElementFindRequest
 *
 */
@JsonCreator
  public InvElementFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjFilter InvFndIn) {
    super(id, "InvElementFind");
    if (InvFndIn != null) {
      Integer index =  InvFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvElement", InvElementObjHelper.toMap(InvFndIn, new HashMap(), "InvElement").get("InvElement"));
    }
  }

/**
 *
 * Retrieves the InvElementObjDataList that results from the InvElementFindRequest call
 * @return InvElementObjDataList resulting from udt call
 *
 */

  public InvElementObjDataList getOutput() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
  }
}
