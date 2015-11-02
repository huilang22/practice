/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtPaymentProfileFindRequest.java
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
 * Class used to create a AxrtPaymentProfileFindRequest Udt Request
 *
 */

public class AxrtPaymentProfileFindRequest extends AxrtPaymentProfileRequest {
/**
 *
 * Constructor to create a  AxrtPaymentProfileFindRequest
 * @param id Unique request name
 * @param axrtppfIn AxrtPaymentProfileObjectFilter for AxrtPaymentProfileFindRequest
 *
 */
@JsonCreator
  public AxrtPaymentProfileFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AxrtPaymentProfile")AxrtPaymentProfileObjectFilter axrtppfIn) {
    super(id, "AxrtPaymentProfileFind");
    if (axrtppfIn != null) {
      Integer index =  axrtppfIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AxrtPaymentProfile", AxrtPaymentProfileObjectHelper.toMap(axrtppfIn, new HashMap(), "AxrtPaymentProfile").get("AxrtPaymentProfile"));
    }
  }

/**
 *
 * Retrieves the AxrtPaymentProfileObjectDataList that results from the AxrtPaymentProfileFindRequest call
 * @return AxrtPaymentProfileObjectDataList resulting from udt call
 *
 */

  public AxrtPaymentProfileObjectDataList getOutput() {
    return AxrtPaymentProfileObjectHelper.fromMapList(outputMap, "AxrtPaymentProfileList");
  }
}
