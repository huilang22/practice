/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupAmountFindRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CsrGroupAmountFindRequest Udt Request
 *
 */

public class CsrGroupAmountFindRequest extends CsrGroupAmountRequest {
/**
 *
 * Constructor to create a  CsrGroupAmountFindRequest
 * @param id Unique request name
 * @param GAFindIn CsrGroupAmountObjectFilter for CsrGroupAmountFindRequest
 *
 */
@JsonCreator
  public CsrGroupAmountFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CsrGroupAmount")CsrGroupAmountObjectFilter GAFindIn) {
    super(id, "CsrGroupAmountFind");
    if (GAFindIn != null) {
      Integer index =  GAFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CsrGroupAmount", CsrGroupAmountObjectHelper.toMap(GAFindIn, new HashMap(), "CsrGroupAmount").get("CsrGroupAmount"));
    }
  }

/**
 *
 * Retrieves the CsrGroupAmountObjectDataList that results from the CsrGroupAmountFindRequest call
 * @return CsrGroupAmountObjectDataList resulting from udt call
 *
 */

  public CsrGroupAmountObjectDataList getOutput() {
    return CsrGroupAmountObjectHelper.fromMapList(outputMap, "CsrGroupAmountList");
  }
}
