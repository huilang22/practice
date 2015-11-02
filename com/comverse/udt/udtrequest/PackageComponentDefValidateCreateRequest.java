/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentDefValidateCreateRequest.java
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

import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a PackageComponentDefValidateCreateRequest Udt Request
 *
 */

public class PackageComponentDefValidateCreateRequest extends PackageComponentDefValidateSubRequestParent {
/**
 *
 * Constructor to create a  PackageComponentDefValidateCreateRequest
 * @param id Unique request name
 * @param PCDin PCDObjectData for PackageComponentDefValidateCreateRequest
 * @param ServiceInternalId Integer for PackageComponentDefValidateCreateRequest
 * @param ServiceInternalIdResets Integer for PackageComponentDefValidateCreateRequest
 *
 */
@JsonCreator
  public PackageComponentDefValidateCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PackageComponentDefValidate")PCDObjectData PCDin, @JsonProperty("ServiceInternalId")Integer ServiceInternalId, @JsonProperty("ServiceInternalIdResets")Integer ServiceInternalIdResets) {
    super(id, "PackageComponentDefValidateCreate");
    if (PCDin != null) {
      addInput("PackageComponentDefValidate", PCDObjectHelper.toMap(PCDin, new HashMap(), "PackageComponentDefValidate").get("PackageComponentDefValidate"));
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
 * Retrieves the PCDObjectData that results from the PackageComponentDefValidateCreateRequest call
 * @return PCDObjectData resulting from udt call
 *
 */

  public PCDObjectData getOutput() {
    return PCDObjectHelper.fromMap(outputMap, "PackageComponentDefValidate");
  }
}
