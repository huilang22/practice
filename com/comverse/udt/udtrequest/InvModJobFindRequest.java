/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvModJobFindRequest.java
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
 * Class used to create a InvModJobFindRequest Udt Request
 *
 */

public class InvModJobFindRequest extends InvModJobRequest {
/**
 *
 * Constructor to create a  InvModJobFindRequest
 * @param id Unique request name
 * @param InvModJobFindIn InvModJobObjectFilter for InvModJobFindRequest
 *
 */
@JsonCreator
  public InvModJobFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvModJob")InvModJobObjectFilter InvModJobFindIn) {
    super(id, "InvModJobFind");
    if (InvModJobFindIn != null) {
      Integer index =  InvModJobFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvModJob", InvModJobObjectHelper.toMap(InvModJobFindIn, new HashMap(), "InvModJob").get("InvModJob"));
    }
  }

/**
 *
 * Retrieves the InvModJobObjectDataList that results from the InvModJobFindRequest call
 * @return InvModJobObjectDataList resulting from udt call
 *
 */

  public InvModJobObjectDataList getOutput() {
    return InvModJobObjectHelper.fromMapList(outputMap, "InvModJobList");
  }
}
