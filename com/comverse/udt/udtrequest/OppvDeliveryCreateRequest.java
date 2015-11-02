/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OppvDeliveryCreateRequest.java
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
 * Class used to create a OppvDeliveryCreateRequest Udt Request
 *
 */

public class OppvDeliveryCreateRequest extends OppvDeliverySubRequestParent {
/**
 *
 * Constructor to create a  OppvDeliveryCreateRequest
 * @param id Unique request name
 * @param createIn OppvDeliveryObjData for OppvDeliveryCreateRequest
 *
 */
@JsonCreator
  public OppvDeliveryCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("OppvDelivery")OppvDeliveryObjData createIn) {
    super(id, "OppvDeliveryCreate");
    if (createIn != null) {
      addInput("OppvDelivery", OppvDeliveryObjHelper.toMap(createIn, new HashMap(), "OppvDelivery").get("OppvDelivery"));
    }
  }

/**
 *
 * Retrieves the OppvDeliveryObjData that results from the OppvDeliveryCreateRequest call
 * @return OppvDeliveryObjData resulting from udt call
 *
 */

  public OppvDeliveryObjData getOutput() {
    return OppvDeliveryObjHelper.fromMap(outputMap, "OppvDelivery");
  }
}
