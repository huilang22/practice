/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdTypeValidateCreateRequest.java
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
 * Class used to create a ExternalIdTypeValidateCreateRequest Udt Request
 *
 */

public class ExternalIdTypeValidateCreateRequest extends ExternalIdTypeValidateSubRequestParent {
/**
 *
 * Constructor to create a  ExternalIdTypeValidateCreateRequest
 * @param id Unique request name
 * @param ExternalIdTypeIn ExternalIdTypeObjectData for ExternalIdTypeValidateCreateRequest
 * @param ServiceInternalId Integer for ExternalIdTypeValidateCreateRequest
 * @param ServiceInternalIdResets Integer for ExternalIdTypeValidateCreateRequest
 *
 */
@JsonCreator
  public ExternalIdTypeValidateCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExternalIdTypeValidate")ExternalIdTypeObjectData ExternalIdTypeIn, @JsonProperty("ServiceInternalId")Integer ServiceInternalId, @JsonProperty("ServiceInternalIdResets")Integer ServiceInternalIdResets) {
    super(id, "ExternalIdTypeValidateCreate");
    if (ExternalIdTypeIn != null) {
      addInput("ExternalIdTypeValidate", ExternalIdTypeObjectHelper.toMap(ExternalIdTypeIn, new HashMap(), "ExternalIdTypeValidate").get("ExternalIdTypeValidate"));
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
 * Retrieves the ExternalIdTypeObjectData that results from the ExternalIdTypeValidateCreateRequest call
 * @return ExternalIdTypeObjectData resulting from udt call
 *
 */

  public ExternalIdTypeObjectData getOutput() {
    return ExternalIdTypeObjectHelper.fromMap(outputMap, "ExternalIdTypeValidate");
  }
}
