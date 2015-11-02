/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServInvElementFindRequest.java
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
import com.csgsystems.svbl.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ServInvElementFindRequest Udt Request
 *
 */

public class ServInvElementFindRequest extends ServInvElementRequest {
/**
 *
 * Constructor to create a  ServInvElementFindRequest
 * @param id Unique request name
 * @param InvElementFindIn InvElementObjData for ServInvElementFindRequest
 * @param AddressIdIn BigInteger for ServInvElementFindRequest
 *
 */
@JsonCreator
  public ServInvElementFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServInvElement")InvElementObjData InvElementFindIn, @JsonProperty("AddressIdIn")BigInteger AddressIdIn) {
    super(id, "ServInvElementFind");
    if (InvElementFindIn != null) {
      addInput("ServInvElement", InvElementObjHelper.toMap(InvElementFindIn, new HashMap(), "InvElement").get("InvElement"));
    }
    if (AddressIdIn != null) {
      addInput("AddressIdIn", AddressIdIn);
    }
  }

/**
 *
 * Retrieves the InvElementObjDataList that results from the ServInvElementFindRequest call
 * @return InvElementObjDataList resulting from udt call
 *
 */

  public InvElementObjDataList getOutput() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
  }
}
