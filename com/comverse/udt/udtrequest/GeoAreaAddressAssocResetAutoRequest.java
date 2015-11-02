/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaAddressAssocResetAutoRequest.java
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
 * Class used to create a GeoAreaAddressAssocResetAutoRequest Udt Request
 *
 */

public class GeoAreaAddressAssocResetAutoRequest extends GeoAreaAddressAssocRequest {
/**
 *
 * Constructor to create a  GeoAreaAddressAssocResetAutoRequest
 * @param id Unique request name
 * @param address_id BigInteger for GeoAreaAddressAssocResetAutoRequest
 *
 */
@JsonCreator
  public GeoAreaAddressAssocResetAutoRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressId")BigInteger address_id) {
    super(id, "GeoAreaAddressAssocResetAuto");
    if (address_id != null) {
      addInput("AddressId", address_id);
    }
  }

}
