/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementValidateSwapValidateRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvElementValidateSwapValidateRequest Udt Request
 *
 */

public class InvElementValidateSwapValidateRequest extends InvElementValidateSubRequestParent {
/**
 *
 * Constructor to create a  InvElementValidateSwapValidateRequest
 * @param id Unique request name
 * @param InvElementValidateSwapValidateIn InvElementValidateObjectData for InvElementValidateSwapValidateRequest
 *
 */
@JsonCreator
  public InvElementValidateSwapValidateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElementValidate")InvElementValidateObjectData InvElementValidateSwapValidateIn) {
    super(id, "InvElementValidateSwapValidate");
    if (InvElementValidateSwapValidateIn != null) {
      addInput("InvElementValidate", InvElementValidateObjectHelper.toMap(InvElementValidateSwapValidateIn, new HashMap(), "InvElementValidate").get("InvElementValidate"));
    }
  }

/**
 *
 * Retrieves the InvElementValidateObjectData that results from the InvElementValidateSwapValidateRequest call
 * @return InvElementValidateObjectData resulting from udt call
 *
 */

  public InvElementValidateObjectData getOutput() {
    return InvElementValidateObjectHelper.fromMap(outputMap, "InvElementValidate");
  }
}
