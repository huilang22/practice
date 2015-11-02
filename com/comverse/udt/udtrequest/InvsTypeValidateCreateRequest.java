/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeValidateCreateRequest.java
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
import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsTypeValidateCreateRequest Udt Request
 *
 */

public class InvsTypeValidateCreateRequest extends InvsTypeValidateSubRequestParent {
/**
 *
 * Constructor to create a  InvsTypeValidateCreateRequest
 * @param id Unique request name
 * @param InvsTypeIn InvsTypeObjectData for InvsTypeValidateCreateRequest
 * @param ServiceInternalId Integer for InvsTypeValidateCreateRequest
 * @param ServiceInternalIdResets Integer for InvsTypeValidateCreateRequest
 *
 */
@JsonCreator
  public InvsTypeValidateCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsTypeValidate")InvsTypeObjectData InvsTypeIn, @JsonProperty("ServiceInternalId")Integer ServiceInternalId, @JsonProperty("ServiceInternalIdResets")Integer ServiceInternalIdResets) {
    super(id, "InvsTypeValidateCreate");
    if (InvsTypeIn != null) {
      addInput("InvsTypeValidate", InvsTypeObjectHelper.toMap(InvsTypeIn, new HashMap(), "InvsTypeValidate").get("InvsTypeValidate"));
    }
    if (ServiceInternalId != null) {
      addInput("ServiceInternalId", ServiceInternalId);
    }
    if (ServiceInternalIdResets != null) {
      addInput("ServiceInternalIdResets", ServiceInternalIdResets);
    }
  }

/**
 *
 * Retrieves the InvsTypeObjectData that results from the InvsTypeValidateCreateRequest call
 * @return InvsTypeObjectData resulting from udt call
 *
 */

  public InvsTypeObjectData getOutput() {
    return InvsTypeObjectHelper.fromMap(outputMap, "InvsTypeValidate");
  }
}
