/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementUpdateRequest.java
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
 * Class used to create a InvElementUpdateRequest Udt Request
 *
 */

public class InvElementUpdateRequest extends InvElementSubRequestParent {
/**
 *
 * Constructor to create a  InvElementUpdateRequest
 * @param id Unique request name
 * @param InvUpdIn InvElementObjData for InvElementUpdateRequest
 *
 */
@JsonCreator
  public InvElementUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjData InvUpdIn) {
    super(id, "InvElementUpdate");
    if (InvUpdIn != null) {
      addInput("InvElement", InvElementObjHelper.toMap(InvUpdIn, new HashMap(), "InvElement").get("InvElement"));
    }
  }

/**
 *
 * Retrieves the InvElementObjData that results from the InvElementUpdateRequest call
 * @return InvElementObjData resulting from udt call
 *
 */

  public InvElementObjData getOutput() {
    return InvElementObjHelper.fromMap(outputMap, "InvElement");
  }
}
