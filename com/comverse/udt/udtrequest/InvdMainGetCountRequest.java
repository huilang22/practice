/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainGetCountRequest.java
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
 * Class used to create a InvdMainGetCountRequest Udt Request
 *
 */

public class InvdMainGetCountRequest extends InvdMainRequest {
/**
 *
 * Constructor to create a  InvdMainGetCountRequest
 * @param id Unique request name
 * @param InvdMainGetCountIn InvdMainObjectFilter for InvdMainGetCountRequest
 *
 */
@JsonCreator
  public InvdMainGetCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdMain")InvdMainObjectFilter InvdMainGetCountIn) {
    super(id, "InvdMainGetCount");
    if (InvdMainGetCountIn != null) {
      Integer index =  InvdMainGetCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvdMain", InvdMainObjectHelper.toMap(InvdMainGetCountIn, new HashMap(), "InvdMainCount").get("InvdMainCount"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the InvdMainGetCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("InvdMainCount");
  }
}
