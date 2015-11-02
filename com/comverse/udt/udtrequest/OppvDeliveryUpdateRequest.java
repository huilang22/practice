/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OppvDeliveryUpdateRequest.java
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
 * Class used to create a OppvDeliveryUpdateRequest Udt Request
 *
 */

public class OppvDeliveryUpdateRequest extends OppvDeliverySubRequestParent {
/**
 *
 * Constructor to create a  OppvDeliveryUpdateRequest
 * @param id Unique request name
 * @param updateIn OppvDeliveryObjData for OppvDeliveryUpdateRequest
 *
 */
@JsonCreator
  public OppvDeliveryUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("OppvDelivery")OppvDeliveryObjData updateIn) {
    super(id, "OppvDeliveryUpdate");
    if (updateIn != null) {
      addInput("OppvDelivery", OppvDeliveryObjHelper.toMap(updateIn, new HashMap(), "OppvDelivery").get("OppvDelivery"));
    }
  }

/**
 *
 * Retrieves the OppvDeliveryObjData that results from the OppvDeliveryUpdateRequest call
 * @return OppvDeliveryObjData resulting from udt call
 *
 */

  public OppvDeliveryObjData getOutput() {
    return OppvDeliveryObjHelper.fromMap(outputMap, "OppvDelivery");
  }
}
