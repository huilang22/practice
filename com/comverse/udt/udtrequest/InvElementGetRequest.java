/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementGetRequest.java
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
 * Class used to create a InvElementGetRequest Udt Request
 *
 */

public class InvElementGetRequest extends InvElementSubRequestParent {
/**
 *
 * Constructor to create a  InvElementGetRequest
 * @param id Unique request name
 * @param InvGetIn InvElementObjKeyData for InvElementGetRequest
 *
 */
@JsonCreator
  public InvElementGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjKeyData InvGetIn) {
    super(id, "InvElementGet");
    if (InvGetIn != null) {
      addInput("InvElement", InvElementObjKeyHelper.toMap(InvGetIn, new HashMap(), "InvElementObjKeyData").get("InvElementObjKeyData"));
    }
  }

/**
 *
 * Retrieves the InvElementObjData that results from the InvElementGetRequest call
 * @return InvElementObjData resulting from udt call
 *
 */

  public InvElementObjData getOutput() {
    return InvElementObjHelper.fromMap(outputMap, "InvElement");
  }
}
