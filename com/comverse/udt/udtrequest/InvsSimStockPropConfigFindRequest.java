/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimStockPropConfigFindRequest.java
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
 * Class used to create a InvsSimStockPropConfigFindRequest Udt Request
 *
 */

public class InvsSimStockPropConfigFindRequest extends InvsSimStockPropConfigRequest {
/**
 *
 * Constructor to create a  InvsSimStockPropConfigFindRequest
 * @param id Unique request name
 * @param InvsSimStockPropConfigFindIn InvsSimStockPropConfigObjectFilter for InvsSimStockPropConfigFindRequest
 *
 */
@JsonCreator
  public InvsSimStockPropConfigFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSimStockPropConfig")InvsSimStockPropConfigObjectFilter InvsSimStockPropConfigFindIn) {
    super(id, "InvsSimStockPropConfigFind");
    if (InvsSimStockPropConfigFindIn != null) {
      Integer index =  InvsSimStockPropConfigFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsSimStockPropConfig", InvsSimStockPropConfigObjectHelper.toMap(InvsSimStockPropConfigFindIn, new HashMap(), "InvsSimStockPropConfig").get("InvsSimStockPropConfig"));
    }
  }

/**
 *
 * Retrieves the InvsSimStockPropConfigObjectDataList that results from the InvsSimStockPropConfigFindRequest call
 * @return InvsSimStockPropConfigObjectDataList resulting from udt call
 *
 */

  public InvsSimStockPropConfigObjectDataList getOutput() {
    return InvsSimStockPropConfigObjectHelper.fromMapList(outputMap, "InvsSimStockPropConfigList");
  }
}
