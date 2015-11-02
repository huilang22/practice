/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsMncFindRequest.java
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
 * Class used to create a InvsMncFindRequest Udt Request
 *
 */

public class InvsMncFindRequest extends InvsMncRequest {
/**
 *
 * Constructor to create a  InvsMncFindRequest
 * @param id Unique request name
 * @param InvsMncFindIn InvsMncObjectFilter for InvsMncFindRequest
 *
 */
@JsonCreator
  public InvsMncFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsMnc")InvsMncObjectFilter InvsMncFindIn) {
    super(id, "InvsMncFind");
    if (InvsMncFindIn != null) {
      Integer index =  InvsMncFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsMnc", InvsMncObjectHelper.toMap(InvsMncFindIn, new HashMap(), "InvsMnc").get("InvsMnc"));
    }
  }

/**
 *
 * Retrieves the InvsMncObjectDataList that results from the InvsMncFindRequest call
 * @return InvsMncObjectDataList resulting from udt call
 *
 */

  public InvsMncObjectDataList getOutput() {
    return InvsMncObjectHelper.fromMapList(outputMap, "InvsMncList");
  }
}
