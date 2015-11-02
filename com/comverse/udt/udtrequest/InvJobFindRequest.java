/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobFindRequest.java
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
 * Class used to create a InvJobFindRequest Udt Request
 *
 */

public class InvJobFindRequest extends InvJobRequest {
/**
 *
 * Constructor to create a  InvJobFindRequest
 * @param id Unique request name
 * @param InvJobFindIn InvJobObjectFilter for InvJobFindRequest
 *
 */
@JsonCreator
  public InvJobFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvJob")InvJobObjectFilter InvJobFindIn) {
    super(id, "InvJobFind");
    if (InvJobFindIn != null) {
      Integer index =  InvJobFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvJob", InvJobObjectHelper.toMap(InvJobFindIn, new HashMap(), "InvJob").get("InvJob"));
    }
  }

/**
 *
 * Retrieves the InvJobObjectDataList that results from the InvJobFindRequest call
 * @return InvJobObjectDataList resulting from udt call
 *
 */

  public InvJobObjectDataList getOutput() {
    return InvJobObjectHelper.fromMapList(outputMap, "InvJobList");
  }
}
