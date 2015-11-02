/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementTransferRequest.java
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
 * Class used to create a InvElementTransferRequest Udt Request
 *
 */

public class InvElementTransferRequest extends InvElementRequest {
/**
 *
 * Constructor to create a  InvElementTransferRequest
 * @param id Unique request name
 * @param InvTransfrIn InvElementObjData for InvElementTransferRequest
 *
 */
@JsonCreator
  public InvElementTransferRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjData InvTransfrIn) {
    super(id, "InvElementTransfer");
    if (InvTransfrIn != null) {
      addInput("InvElement", InvElementObjHelper.toMap(InvTransfrIn, new HashMap(), "Void").get("Void"));
    }
  }

}
