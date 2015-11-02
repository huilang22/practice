/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalContractFindRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a GlobalContractFindRequest Udt Request
 *
 */

public class GlobalContractFindRequest extends GlobalContractRequest {
/**
 *
 * Constructor to create a  GlobalContractFindRequest
 * @param id Unique request name
 * @param GlobalContractFindIn GlobalContractObjectFilter for GlobalContractFindRequest
 *
 */
@JsonCreator
  public GlobalContractFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("GlobalContract")GlobalContractObjectFilter GlobalContractFindIn) {
    super(id, "GlobalContractFind");
    if (GlobalContractFindIn != null) {
      Integer index =  GlobalContractFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GlobalContract", GlobalContractObjectHelper.toMap(GlobalContractFindIn, new HashMap(), "GlobalContract").get("GlobalContract"));
    }
  }

/**
 *
 * Retrieves the GlobalContractObjectDataList that results from the GlobalContractFindRequest call
 * @return GlobalContractObjectDataList resulting from udt call
 *
 */

  public GlobalContractObjectDataList getOutput() {
    return GlobalContractObjectHelper.fromMapList(outputMap, "GlobalContractList");
  }
}
