/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementReserveRequest.java
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
 * Class used to create a InvElementReserveRequest Udt Request
 *
 */

public class InvElementReserveRequest extends InvElementRequest {
/**
 *
 * Constructor to create a  InvElementReserveRequest
 * @param id Unique request name
 * @param InvRsrvIn InvElementObjData for InvElementReserveRequest
 *
 */
@JsonCreator
  public InvElementReserveRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjData InvRsrvIn) {
    super(id, "InvElementReserve");
    if (InvRsrvIn != null) {
      addInput("InvElement", InvElementObjHelper.toMap(InvRsrvIn, new HashMap(), "Void").get("Void"));
    }
  }

}
