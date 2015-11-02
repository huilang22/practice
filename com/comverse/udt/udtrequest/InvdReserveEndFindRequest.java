/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdReserveEndFindRequest.java
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
 * Class used to create a InvdReserveEndFindRequest Udt Request
 *
 */

public class InvdReserveEndFindRequest extends InvdReserveEndRequest {
/**
 *
 * Constructor to create a  InvdReserveEndFindRequest
 * @param id Unique request name
 * @param InvdReserveEndFindIn InvdReserveEndObjectFilter for InvdReserveEndFindRequest
 *
 */
@JsonCreator
  public InvdReserveEndFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdReserveEnd")InvdReserveEndObjectFilter InvdReserveEndFindIn) {
    super(id, "InvdReserveEndFind");
    if (InvdReserveEndFindIn != null) {
      Integer index =  InvdReserveEndFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvdReserveEnd", InvdReserveEndObjectHelper.toMap(InvdReserveEndFindIn, new HashMap(), "InvdReserveEnd").get("InvdReserveEnd"));
    }
  }

/**
 *
 * Retrieves the InvdReserveEndObjectDataList that results from the InvdReserveEndFindRequest call
 * @return InvdReserveEndObjectDataList resulting from udt call
 *
 */

  public InvdReserveEndObjectDataList getOutput() {
    return InvdReserveEndObjectHelper.fromMapList(outputMap, "InvdReserveEndList");
  }
}
