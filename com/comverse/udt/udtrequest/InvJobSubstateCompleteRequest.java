/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobSubstateCompleteRequest.java
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
 * Class used to create a InvJobSubstateCompleteRequest Udt Request
 *
 */

public class InvJobSubstateCompleteRequest extends InvJobRequest {
/**
 *
 * Constructor to create a  InvJobSubstateCompleteRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public InvJobSubstateCompleteRequest(@JsonProperty("RequestId") String id) {
    super(id, "InvJobSubstateComplete");
  }

/**
 *
 * Retrieves the InvJobObjectDataList that results from the InvJobSubstateCompleteRequest call
 * @return InvJobObjectDataList resulting from udt call
 *
 */

  public InvJobObjectDataList getOutput() {
    return InvJobObjectHelper.fromMapList(outputMap, "InvJobList");
  }
}
