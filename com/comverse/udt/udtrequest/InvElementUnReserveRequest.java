/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementUnReserveRequest.java
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
 * Class used to create a InvElementUnReserveRequest Udt Request
 *
 */

public class InvElementUnReserveRequest extends InvElementRequest {
/**
 *
 * Constructor to create a  InvElementUnReserveRequest
 * @param id Unique request name
 * @param InvUnRsrvIn InvElementObjData for InvElementUnReserveRequest
 *
 */
@JsonCreator
  public InvElementUnReserveRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjData InvUnRsrvIn) {
    super(id, "InvElementUnReserve");
    if (InvUnRsrvIn != null) {
      addInput("InvElement", InvElementObjHelper.toMap(InvUnRsrvIn, new HashMap(), "Void").get("Void"));
    }
  }

}
