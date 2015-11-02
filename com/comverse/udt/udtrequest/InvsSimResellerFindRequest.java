/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimResellerFindRequest.java
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
 * Class used to create a InvsSimResellerFindRequest Udt Request
 *
 */

public class InvsSimResellerFindRequest extends InvsSimResellerRequest {
/**
 *
 * Constructor to create a  InvsSimResellerFindRequest
 * @param id Unique request name
 * @param InvsSimResellerFindIn InvsSimResellerObjectFilter for InvsSimResellerFindRequest
 *
 */
@JsonCreator
  public InvsSimResellerFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSimReseller")InvsSimResellerObjectFilter InvsSimResellerFindIn) {
    super(id, "InvsSimResellerFind");
    if (InvsSimResellerFindIn != null) {
      Integer index =  InvsSimResellerFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsSimReseller", InvsSimResellerObjectHelper.toMap(InvsSimResellerFindIn, new HashMap(), "InvsSimReseller").get("InvsSimReseller"));
    }
  }

/**
 *
 * Retrieves the InvsSimResellerObjectDataList that results from the InvsSimResellerFindRequest call
 * @return InvsSimResellerObjectDataList resulting from udt call
 *
 */

  public InvsSimResellerObjectDataList getOutput() {
    return InvsSimResellerObjectHelper.fromMapList(outputMap, "InvsSimResellerList");
  }
}
