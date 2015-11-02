/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStockPropertyFindRequest.java
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
 * Class used to create a InvsStockPropertyFindRequest Udt Request
 *
 */

public class InvsStockPropertyFindRequest extends InvsStockPropertyRequest {
/**
 *
 * Constructor to create a  InvsStockPropertyFindRequest
 * @param id Unique request name
 * @param InvsStockPropertyFindIn InvsStockPropertyObjectFilter for InvsStockPropertyFindRequest
 *
 */
@JsonCreator
  public InvsStockPropertyFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsStockProperty")InvsStockPropertyObjectFilter InvsStockPropertyFindIn) {
    super(id, "InvsStockPropertyFind");
    if (InvsStockPropertyFindIn != null) {
      Integer index =  InvsStockPropertyFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsStockProperty", InvsStockPropertyObjectHelper.toMap(InvsStockPropertyFindIn, new HashMap(), "InvsStockProperty").get("InvsStockProperty"));
    }
  }

/**
 *
 * Retrieves the InvsStockPropertyObjectDataList that results from the InvsStockPropertyFindRequest call
 * @return InvsStockPropertyObjectDataList resulting from udt call
 *
 */

  public InvsStockPropertyObjectDataList getOutput() {
    return InvsStockPropertyObjectHelper.fromMapList(outputMap, "InvsStockPropertyList");
  }
}
