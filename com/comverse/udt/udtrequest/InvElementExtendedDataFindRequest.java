/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementExtendedDataFindRequest.java
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
 * Class used to create a InvElementExtendedDataFindRequest Udt Request
 *
 */

public class InvElementExtendedDataFindRequest extends InvElementRequest {
/**
 *
 * Constructor to create a  InvElementExtendedDataFindRequest
 * @param id Unique request name
 * @param InvEDFindIn InvElementObjData for InvElementExtendedDataFindRequest
 *
 */
@JsonCreator
  public InvElementExtendedDataFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjData InvEDFindIn) {
    super(id, "InvElementExtendedDataFind");
    if (InvEDFindIn != null) {
      addInput("InvElement", InvElementObjHelper.toMap(InvEDFindIn, new HashMap(), "InvElementExtendedData").get("InvElementExtendedData"));
    }
  }

/**
 *
 * Retrieves the InvElementEDObjDataList that results from the InvElementExtendedDataFindRequest call
 * @return InvElementEDObjDataList resulting from udt call
 *
 */

  public InvElementEDObjDataList getOutput() {
    return InvElementEDObjHelper.fromMapList(outputMap, "InvElementExtendedDataList");
  }
}
