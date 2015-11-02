/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainExtendedDataFindRequest.java
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
 * Class used to create a InvdMainExtendedDataFindRequest Udt Request
 *
 */

public class InvdMainExtendedDataFindRequest extends InvdMainRequest {
/**
 *
 * Constructor to create a  InvdMainExtendedDataFindRequest
 * @param id Unique request name
 * @param EDFindIn InvdMainObjectKeyData for InvdMainExtendedDataFindRequest
 *
 */
@JsonCreator
  public InvdMainExtendedDataFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdMain")InvdMainObjectKeyData EDFindIn) {
    super(id, "InvdMainExtendedDataFind");
    if (EDFindIn != null) {
      addInput("InvdMain", InvdMainObjectKeyHelper.toMap(EDFindIn, new HashMap(), "InvdMainObjectKeyData").get("InvdMainObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvdMainEDObjectDataList that results from the InvdMainExtendedDataFindRequest call
 * @return InvdMainEDObjectDataList resulting from udt call
 *
 */

  public InvdMainEDObjectDataList getOutput() {
    return InvdMainEDObjectHelper.fromMapList(outputMap, "InvdMainList");
  }
}
