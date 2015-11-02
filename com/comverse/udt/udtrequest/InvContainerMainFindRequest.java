/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvContainerMainFindRequest.java
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
 * Class used to create a InvContainerMainFindRequest Udt Request
 *
 */

public class InvContainerMainFindRequest extends InvContainerMainRequest {
/**
 *
 * Constructor to create a  InvContainerMainFindRequest
 * @param id Unique request name
 * @param InvContainerMainFindIn InvContainerMainObjectFilter for InvContainerMainFindRequest
 *
 */
@JsonCreator
  public InvContainerMainFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvContainerMain")InvContainerMainObjectFilter InvContainerMainFindIn) {
    super(id, "InvContainerMainFind");
    if (InvContainerMainFindIn != null) {
      Integer index =  InvContainerMainFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvContainerMain", InvContainerMainObjectHelper.toMap(InvContainerMainFindIn, new HashMap(), "InvContainerMain").get("InvContainerMain"));
    }
  }

/**
 *
 * Retrieves the InvContainerMainObjectDataList that results from the InvContainerMainFindRequest call
 * @return InvContainerMainObjectDataList resulting from udt call
 *
 */

  public InvContainerMainObjectDataList getOutput() {
    return InvContainerMainObjectHelper.fromMapList(outputMap, "InvContainerMainList");
  }
}
