/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobstatusFindRequest.java
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
 * Class used to create a InvsJobstatusFindRequest Udt Request
 *
 */

public class InvsJobstatusFindRequest extends InvsJobstatusRequest {
/**
 *
 * Constructor to create a  InvsJobstatusFindRequest
 * @param id Unique request name
 * @param InvsJobstatusFindIn InvsJobstatusObjectFilter for InvsJobstatusFindRequest
 *
 */
@JsonCreator
  public InvsJobstatusFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsJobstatus")InvsJobstatusObjectFilter InvsJobstatusFindIn) {
    super(id, "InvsJobstatusFind");
    if (InvsJobstatusFindIn != null) {
      Integer index =  InvsJobstatusFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsJobstatus", InvsJobstatusObjectHelper.toMap(InvsJobstatusFindIn, new HashMap(), "InvsJobstatus").get("InvsJobstatus"));
    }
  }

/**
 *
 * Retrieves the InvsJobstatusObjectDataList that results from the InvsJobstatusFindRequest call
 * @return InvsJobstatusObjectDataList resulting from udt call
 *
 */

  public InvsJobstatusObjectDataList getOutput() {
    return InvsJobstatusObjectHelper.fromMapList(outputMap, "InvsJobstatusList");
  }
}
