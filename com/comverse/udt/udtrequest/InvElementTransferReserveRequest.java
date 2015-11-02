/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementTransferReserveRequest.java
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
 * Class used to create a InvElementTransferReserveRequest Udt Request
 *
 */

public class InvElementTransferReserveRequest extends InvElementRequest {
/**
 *
 * Constructor to create a  InvElementTransferReserveRequest
 * @param id Unique request name
 * @param InvTransferResvIn InvElementObjData for InvElementTransferReserveRequest
 *
 */
@JsonCreator
  public InvElementTransferReserveRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjData InvTransferResvIn) {
    super(id, "InvElementTransferReserve");
    if (InvTransferResvIn != null) {
      addInput("InvElement", InvElementObjHelper.toMap(InvTransferResvIn, new HashMap(), "Void").get("Void"));
    }
  }

}
