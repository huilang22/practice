/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchInvSourceFindRequest.java
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

import com.csgsystems.bat.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BatchInvSourceFindRequest Udt Request
 *
 */

public class BatchInvSourceFindRequest extends BatchInvSourceRequest {
/**
 *
 * Constructor to create a  BatchInvSourceFindRequest
 * @param id Unique request name
 * @param BISFindIn BISObjectFilter for BatchInvSourceFindRequest
 *
 */
@JsonCreator
  public BatchInvSourceFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchInvSource")BISObjectFilter BISFindIn) {
    super(id, "BatchInvSourceFind");
    if (BISFindIn != null) {
      Integer index =  BISFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchInvSource", BISObjectHelper.toMap(BISFindIn, new HashMap(), "BatchInvSource").get("BatchInvSource"));
    }
  }

/**
 *
 * Retrieves the BISObjectDataList that results from the BatchInvSourceFindRequest call
 * @return BISObjectDataList resulting from udt call
 *
 */

  public BISObjectDataList getOutput() {
    return BISObjectHelper.fromMapList(outputMap, "BatchInvSourceList");
  }
}
