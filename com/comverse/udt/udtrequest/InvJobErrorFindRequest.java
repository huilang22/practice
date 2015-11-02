/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobErrorFindRequest.java
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
 * Class used to create a InvJobErrorFindRequest Udt Request
 *
 */

public class InvJobErrorFindRequest extends InvJobErrorRequest {
/**
 *
 * Constructor to create a  InvJobErrorFindRequest
 * @param id Unique request name
 * @param InvJobErrorFindIn InvJobErrorObjectFilter for InvJobErrorFindRequest
 *
 */
@JsonCreator
  public InvJobErrorFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvJobError")InvJobErrorObjectFilter InvJobErrorFindIn) {
    super(id, "InvJobErrorFind");
    if (InvJobErrorFindIn != null) {
      Integer index =  InvJobErrorFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvJobError", InvJobErrorObjectHelper.toMap(InvJobErrorFindIn, new HashMap(), "InvJobError").get("InvJobError"));
    }
  }

/**
 *
 * Retrieves the InvJobErrorObjectDataList that results from the InvJobErrorFindRequest call
 * @return InvJobErrorObjectDataList resulting from udt call
 *
 */

  public InvJobErrorObjectDataList getOutput() {
    return InvJobErrorObjectHelper.fromMapList(outputMap, "InvJobErrorList");
  }
}
