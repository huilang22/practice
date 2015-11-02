/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSimJobFindRequest.java
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
 * Class used to create a InvSimJobFindRequest Udt Request
 *
 */

public class InvSimJobFindRequest extends InvSimJobRequest {
/**
 *
 * Constructor to create a  InvSimJobFindRequest
 * @param id Unique request name
 * @param InvSimJobFindIn InvSimJobObjectFilter for InvSimJobFindRequest
 *
 */
@JsonCreator
  public InvSimJobFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvSimJob")InvSimJobObjectFilter InvSimJobFindIn) {
    super(id, "InvSimJobFind");
    if (InvSimJobFindIn != null) {
      Integer index =  InvSimJobFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvSimJob", InvSimJobObjectHelper.toMap(InvSimJobFindIn, new HashMap(), "InvSimJob").get("InvSimJob"));
    }
  }

/**
 *
 * Retrieves the InvSimJobObjectDataList that results from the InvSimJobFindRequest call
 * @return InvSimJobObjectDataList resulting from udt call
 *
 */

  public InvSimJobObjectDataList getOutput() {
    return InvSimJobObjectHelper.fromMapList(outputMap, "InvSimJobList");
  }
}
