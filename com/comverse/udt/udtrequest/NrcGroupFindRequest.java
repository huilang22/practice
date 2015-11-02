/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcGroupFindRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a NrcGroupFindRequest Udt Request
 *
 */

public class NrcGroupFindRequest extends NrcGroupRequest {
/**
 *
 * Constructor to create a  NrcGroupFindRequest
 * @param id Unique request name
 * @param ngFndIn NrcGroupObjectFilter for NrcGroupFindRequest
 *
 */
@JsonCreator
  public NrcGroupFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("NrcGroup")NrcGroupObjectFilter ngFndIn) {
    super(id, "NrcGroupFind");
    if (ngFndIn != null) {
      Integer index =  ngFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("NrcGroup", NrcGroupObjectHelper.toMap(ngFndIn, new HashMap(), "NrcGroup").get("NrcGroup"));
    }
  }

/**
 *
 * Retrieves the NrcGroupObjectDataList that results from the NrcGroupFindRequest call
 * @return NrcGroupObjectDataList resulting from udt call
 *
 */

  public NrcGroupObjectDataList getOutput() {
    return NrcGroupObjectHelper.fromMapList(outputMap, "NrcGroupList");
  }
}
