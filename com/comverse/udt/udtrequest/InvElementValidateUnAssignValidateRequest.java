/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementValidateUnAssignValidateRequest.java
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
 * Class used to create a InvElementValidateUnAssignValidateRequest Udt Request
 *
 */

public class InvElementValidateUnAssignValidateRequest extends InvElementValidateSubRequestParent {
/**
 *
 * Constructor to create a  InvElementValidateUnAssignValidateRequest
 * @param id Unique request name
 * @param InvElementValidateUnAssignValidateIn InvElementValidateObjectData for InvElementValidateUnAssignValidateRequest
 *
 */
@JsonCreator
  public InvElementValidateUnAssignValidateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElementValidate")InvElementValidateObjectData InvElementValidateUnAssignValidateIn) {
    super(id, "InvElementValidateUnAssignValidate");
    if (InvElementValidateUnAssignValidateIn != null) {
      addInput("InvElementValidate", InvElementValidateObjectHelper.toMap(InvElementValidateUnAssignValidateIn, new HashMap(), "InvElementValidate").get("InvElementValidate"));
    }
  }

/**
 *
 * Retrieves the InvElementValidateObjectData that results from the InvElementValidateUnAssignValidateRequest call
 * @return InvElementValidateObjectData resulting from udt call
 *
 */

  public InvElementValidateObjectData getOutput() {
    return InvElementValidateObjectHelper.fromMap(outputMap, "InvElementValidate");
  }
}
