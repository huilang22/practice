/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaAddressAutoAssociateRequest.java
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

import com.csgsystems.svbl.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a GeoAreaAddressAutoAssociateRequest Udt Request
 *
 */

public class GeoAreaAddressAutoAssociateRequest extends AdrAutoAssocSubRequestParent {
/**
 *
 * Constructor to create a  GeoAreaAddressAutoAssociateRequest
 * @param id Unique request name
 * @param AddressId BigInteger for GeoAreaAddressAutoAssociateRequest
 * @param BoundaryId Integer for GeoAreaAddressAutoAssociateRequest
 * @param EnableAsync Integer for GeoAreaAddressAutoAssociateRequest
 * @param Email String for GeoAreaAddressAutoAssociateRequest
 *
 */
@JsonCreator
  public GeoAreaAddressAutoAssociateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressId")BigInteger AddressId, @JsonProperty("BoundaryId")Integer BoundaryId, @JsonProperty("EnableAsync")Integer EnableAsync, @JsonProperty("Email")String Email) {
    super(id, "GeoAreaAddressAutoAssociate");
    if (AddressId != null) {
      addInput("AddressId", AddressId);
    }
    if (BoundaryId != null) {
      addInput("BoundaryId", BoundaryId);
    }
    if (EnableAsync != null) {
      addInput("EnableAsync", EnableAsync);
    }
    if (Email != null) {
      addInput("Email", Email);
    }
  }

/**
 *
 * Retrieves the GeoAreaAddressAutoAssociateOutputData that results from the GeoAreaAddressAutoAssociateRequest call
 * @return GeoAreaAddressAutoAssociateOutputData resulting from udt call
 *
 */

  public GeoAreaAddressAutoAssociateOutputData getOutput() {
    return GeoAreaAddressAutoAssociateOutputHelper.fromMap(outputMap);
  }
}
