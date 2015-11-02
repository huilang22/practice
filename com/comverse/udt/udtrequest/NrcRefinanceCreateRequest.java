/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcRefinanceCreateRequest.java
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
import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a NrcRefinanceCreateRequest Udt Request
 *
 */

public class NrcRefinanceCreateRequest extends NrcSubRequestParent {
/**
 *
 * Constructor to create a  NrcRefinanceCreateRequest
 * @param id Unique request name
 * @param NrcRNrcIn NrcObjectBaseData for NrcRefinanceCreateRequest
 * @param NrcRBLIIn BalanceLineItemObjectData[] for NrcRefinanceCreateRequest
 *
 */
@JsonCreator
  public NrcRefinanceCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Nrc")NrcObjectBaseData NrcRNrcIn, @JsonProperty("BalanceLineItem")BalanceLineItemObjectData[] NrcRBLIIn) {
    super(id, "NrcRefinanceCreate");
    if (NrcRNrcIn != null) {
      addInput("Nrc", NrcObjectBaseHelper.toMap(NrcRNrcIn, new HashMap(), "Nrc").get("Nrc"));
    }
    if (NrcRBLIIn != null) {
      Object[] list = new Object[NrcRBLIIn.length];
      for (int i = 0; i < NrcRBLIIn.length; i++) {
        list[i] = BalanceLineItemObjectHelper.getMap(NrcRBLIIn[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "BalanceLineItem");
      }
      addInput("BalanceLineItemList", list);
    }
  }

/**
 *
 * Retrieves the NrcObjectBaseData that results from the NrcRefinanceCreateRequest call
 * @return NrcObjectBaseData resulting from udt call
 *
 */

  public NrcObjectBaseData getOutput() {
    return NrcObjectBaseHelper.fromMap(outputMap, "Nrc");
  }
}
