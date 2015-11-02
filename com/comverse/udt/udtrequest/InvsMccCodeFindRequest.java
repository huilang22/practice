/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsMccCodeFindRequest.java
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
 * Class used to create a InvsMccCodeFindRequest Udt Request
 *
 */

public class InvsMccCodeFindRequest extends InvsMccCodeRequest {
/**
 *
 * Constructor to create a  InvsMccCodeFindRequest
 * @param id Unique request name
 * @param InvsMccCodeFindIn InvsMccCodeObjectFilter for InvsMccCodeFindRequest
 *
 */
@JsonCreator
  public InvsMccCodeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsMccCode")InvsMccCodeObjectFilter InvsMccCodeFindIn) {
    super(id, "InvsMccCodeFind");
    if (InvsMccCodeFindIn != null) {
      Integer index =  InvsMccCodeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsMccCode", InvsMccCodeObjectHelper.toMap(InvsMccCodeFindIn, new HashMap(), "InvsMccCode").get("InvsMccCode"));
    }
  }

/**
 *
 * Retrieves the InvsMccCodeObjectDataList that results from the InvsMccCodeFindRequest call
 * @return InvsMccCodeObjectDataList resulting from udt call
 *
 */

  public InvsMccCodeObjectDataList getOutput() {
    return InvsMccCodeObjectHelper.fromMapList(outputMap, "InvsMccCodeList");
  }
}
