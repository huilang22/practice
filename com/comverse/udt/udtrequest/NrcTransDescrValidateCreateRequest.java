/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTransDescrValidateCreateRequest.java
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
 * Class used to create a NrcTransDescrValidateCreateRequest Udt Request
 *
 */

public class NrcTransDescrValidateCreateRequest extends NrcTransDescrValidateSubRequestParent {
/**
 *
 * Constructor to create a  NrcTransDescrValidateCreateRequest
 * @param id Unique request name
 * @param NrcTransDescrIn NrcTransDescrObjectData for NrcTransDescrValidateCreateRequest
 * @param ServiceInternalId Integer for NrcTransDescrValidateCreateRequest
 * @param ServiceInternalIdResets Integer for NrcTransDescrValidateCreateRequest
 *
 */
@JsonCreator
  public NrcTransDescrValidateCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("NrcTransDescrValidate")NrcTransDescrObjectData NrcTransDescrIn, @JsonProperty("ServiceInternalId")Integer ServiceInternalId, @JsonProperty("ServiceInternalIdResets")Integer ServiceInternalIdResets) {
    super(id, "NrcTransDescrValidateCreate");
    if (NrcTransDescrIn != null) {
      addInput("NrcTransDescrValidate", NrcTransDescrObjectHelper.toMap(NrcTransDescrIn, new HashMap(), "NrcTransDescrValidate").get("NrcTransDescrValidate"));
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
 * Retrieves the NrcTransDescrObjectData that results from the NrcTransDescrValidateCreateRequest call
 * @return NrcTransDescrObjectData resulting from udt call
 *
 */

  public NrcTransDescrObjectData getOutput() {
    return NrcTransDescrObjectHelper.fromMap(outputMap, "NrcTransDescrValidate");
  }
}
