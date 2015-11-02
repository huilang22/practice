/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OppvDeliveryDeleteRequest.java
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
 * Class used to create a OppvDeliveryDeleteRequest Udt Request
 *
 */

public class OppvDeliveryDeleteRequest extends OppvDeliverySubRequestParent {
/**
 *
 * Constructor to create a  OppvDeliveryDeleteRequest
 * @param id Unique request name
 * @param deleteIn OppvDeliveryObjKeyData for OppvDeliveryDeleteRequest
 *
 */
@JsonCreator
  public OppvDeliveryDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("OppvDelivery")OppvDeliveryObjKeyData deleteIn) {
    super(id, "OppvDeliveryDelete");
    if (deleteIn != null) {
      addInput("OppvDelivery", OppvDeliveryObjKeyHelper.toMap(deleteIn, new HashMap(), "OppvDeliveryObjKeyData").get("OppvDeliveryObjKeyData"));
    }
  }

/**
 *
 * Retrieves the OppvDeliveryObjData that results from the OppvDeliveryDeleteRequest call
 * @return OppvDeliveryObjData resulting from udt call
 *
 */

  public OppvDeliveryObjData getOutput() {
    return OppvDeliveryObjHelper.fromMap(outputMap, "OppvDelivery");
  }
}
