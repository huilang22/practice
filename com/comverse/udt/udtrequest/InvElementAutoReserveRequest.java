/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementAutoReserveRequest.java
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
 * Class used to create a InvElementAutoReserveRequest Udt Request
 *
 */

public class InvElementAutoReserveRequest extends InvElementRequest {
/**
 *
 * Constructor to create a  InvElementAutoReserveRequest
 * @param id Unique request name
 * @param InvAutoRsrvIn InvElementObjFilter for InvElementAutoReserveRequest
 * @param Quantity Integer for InvElementAutoReserveRequest
 * @param ContiguousFlag Integer for InvElementAutoReserveRequest
 *
 */
@JsonCreator
  public InvElementAutoReserveRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjFilter InvAutoRsrvIn, @JsonProperty("Quantity")Integer Quantity, @JsonProperty("ContiguousFlag")Integer ContiguousFlag) {
    super(id, "InvElementAutoReserve");
    if (InvAutoRsrvIn != null) {
      Integer index =  InvAutoRsrvIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvElement", InvElementObjHelper.toMap(InvAutoRsrvIn, new HashMap(), "Void").get("Void"));
    }
    if (Quantity != null) {
      addInput("Quantity", Quantity);
    }
    if (ContiguousFlag != null) {
      addInput("ContiguousFlag", ContiguousFlag);
    }
  }

}
