/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTypeGroupFindRequest.java
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
 * Class used to create a NrcTypeGroupFindRequest Udt Request
 *
 */

public class NrcTypeGroupFindRequest extends NrcTypeGroupRequest {
/**
 *
 * Constructor to create a  NrcTypeGroupFindRequest
 * @param id Unique request name
 * @param NTGFndIn NrcTypeGroupObjectFilter for NrcTypeGroupFindRequest
 *
 */
@JsonCreator
  public NrcTypeGroupFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("NrcTypeGroup")NrcTypeGroupObjectFilter NTGFndIn) {
    super(id, "NrcTypeGroupFind");
    if (NTGFndIn != null) {
      Integer index =  NTGFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("NrcTypeGroup", NrcTypeGroupObjectHelper.toMap(NTGFndIn, new HashMap(), "NrcTypeGroup").get("NrcTypeGroup"));
    }
  }

/**
 *
 * Retrieves the NrcTypeGroupObjectDataList that results from the NrcTypeGroupFindRequest call
 * @return NrcTypeGroupObjectDataList resulting from udt call
 *
 */

  public NrcTypeGroupObjectDataList getOutput() {
    return NrcTypeGroupObjectHelper.fromMapList(outputMap, "NrcTypeGroupList");
  }
}
