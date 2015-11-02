/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementFindPendingExtendedDataRequest.java
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
 * Class used to create a InvElementFindPendingExtendedDataRequest Udt Request
 *
 */

public class InvElementFindPendingExtendedDataRequest extends InvElementRequest {
/**
 *
 * Constructor to create a  InvElementFindPendingExtendedDataRequest
 * @param id Unique request name
 * @param InvFndPEIn InvElementObjData for InvElementFindPendingExtendedDataRequest
 * @param WpJobId String for InvElementFindPendingExtendedDataRequest
 *
 */
@JsonCreator
  public InvElementFindPendingExtendedDataRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjData InvFndPEIn, @JsonProperty("WpJobId")String WpJobId) {
    super(id, "InvElementFindPendingExtendedData");
    if (InvFndPEIn != null) {
      addInput("InvElement", InvElementObjHelper.toMap(InvFndPEIn, new HashMap(), "InvElementPendingExtendedData").get("InvElementPendingExtendedData"));
    }
    if (WpJobId != null) {
      addInput("WpJobId", WpJobId);
    }
  }

/**
 *
 * Retrieves the InvElementEDObjDataList that results from the InvElementFindPendingExtendedDataRequest call
 * @return InvElementEDObjDataList resulting from udt call
 *
 */

  public InvElementEDObjDataList getOutput() {
    return InvElementEDObjHelper.fromMapList(outputMap, "InvElementPendingExtendedDataList");
  }
}
