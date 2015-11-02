/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStockPropConfigFindRequest.java
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
 * Class used to create a InvsStockPropConfigFindRequest Udt Request
 *
 */

public class InvsStockPropConfigFindRequest extends InvsStockPropConfigRequest {
/**
 *
 * Constructor to create a  InvsStockPropConfigFindRequest
 * @param id Unique request name
 * @param InvsStockPropConfigFindIn InvsStockPropConfigObjectFilter for InvsStockPropConfigFindRequest
 *
 */
@JsonCreator
  public InvsStockPropConfigFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsStockPropConfig")InvsStockPropConfigObjectFilter InvsStockPropConfigFindIn) {
    super(id, "InvsStockPropConfigFind");
    if (InvsStockPropConfigFindIn != null) {
      Integer index =  InvsStockPropConfigFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsStockPropConfig", InvsStockPropConfigObjectHelper.toMap(InvsStockPropConfigFindIn, new HashMap(), "InvsStockPropConfig").get("InvsStockPropConfig"));
    }
  }

/**
 *
 * Retrieves the InvsStockPropConfigObjectDataList that results from the InvsStockPropConfigFindRequest call
 * @return InvsStockPropConfigObjectDataList resulting from udt call
 *
 */

  public InvsStockPropConfigObjectDataList getOutput() {
    return InvsStockPropConfigObjectHelper.fromMapList(outputMap, "InvsStockPropConfigList");
  }
}
