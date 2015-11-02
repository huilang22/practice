/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSimVectorDeleteHelperRequest.java
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
 * Class used to create a InvSimVectorDeleteHelperRequest Udt Request
 *
 */

public class InvSimVectorDeleteHelperRequest extends InvSimVectorRequest {
/**
 *
 * Constructor to create a  InvSimVectorDeleteHelperRequest
 * @param id Unique request name
 * @param InvDelInData InvSimVectorBaseData for InvSimVectorDeleteHelperRequest
 *
 */
@JsonCreator
  public InvSimVectorDeleteHelperRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvSimVector")InvSimVectorBaseData InvDelInData) {
    super(id, "InvSimVectorDeleteHelper");
    if (InvDelInData != null) {
      addInput("InvSimVector", InvSimVectorBaseHelper.toMap(InvDelInData, new HashMap(), "ReturnCode").get("ReturnCode"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the InvSimVectorDeleteHelperRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("ReturnCode");
  }
}
