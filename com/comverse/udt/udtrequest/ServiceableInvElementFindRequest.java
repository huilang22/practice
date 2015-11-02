/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceableInvElementFindRequest.java
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
 * Class used to create a ServiceableInvElementFindRequest Udt Request
 *
 */

public class ServiceableInvElementFindRequest extends ServiceableInvElementRequest {
/**
 *
 * Constructor to create a  ServiceableInvElementFindRequest
 * @param id Unique request name
 * @param InvFndIn InvElementObjFilter for ServiceableInvElementFindRequest
 * @param AddressIdIn BigInteger for ServiceableInvElementFindRequest
 *
 */
@JsonCreator
  public ServiceableInvElementFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceableInvElement")InvElementObjFilter InvFndIn, @JsonProperty("AddressIdIn")BigInteger AddressIdIn) {
    super(id, "ServiceableInvElementFind");
    if (InvFndIn != null) {
      Integer index =  InvFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceableInvElement", InvElementObjHelper.toMap(InvFndIn, new HashMap(), "InvElement").get("InvElement"));
    }
    if (AddressIdIn != null) {
      addInput("AddressIdIn", AddressIdIn);
    }
  }

/**
 *
 * Retrieves the InvElementObjDataList that results from the ServiceableInvElementFindRequest call
 * @return InvElementObjDataList resulting from udt call
 *
 */

  public InvElementObjDataList getOutput() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
  }
}
