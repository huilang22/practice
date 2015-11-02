/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementPlusGetRequest.java
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
 * Class used to create a InvElementPlusGetRequest Udt Request
 *
 */

public class InvElementPlusGetRequest extends InvElementPlusSubRequestParent {
/**
 *
 * Constructor to create a  InvElementPlusGetRequest
 * @param id Unique request name
 * @param InvGetIn InvElementPlusObjKeyData for InvElementPlusGetRequest
 *
 */
@JsonCreator
  public InvElementPlusGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElementPlus")InvElementPlusObjKeyData InvGetIn) {
    super(id, "InvElementPlusGet");
    if (InvGetIn != null) {
      addInput("InvElementPlus", InvElementPlusObjKeyHelper.toMap(InvGetIn, new HashMap(), "InvElementPlusObjKeyData").get("InvElementPlusObjKeyData"));
    }
  }

/**
 *
 * Retrieves the InvElementPlusObjData that results from the InvElementPlusGetRequest call
 * @return InvElementPlusObjData resulting from udt call
 *
 */

  public InvElementPlusObjData getOutput() {
    return InvElementPlusObjHelper.fromMap(outputMap, "InvElementPlus");
  }
}
