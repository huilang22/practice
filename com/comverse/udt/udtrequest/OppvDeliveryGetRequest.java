/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OppvDeliveryGetRequest.java
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
 * Class used to create a OppvDeliveryGetRequest Udt Request
 *
 */

public class OppvDeliveryGetRequest extends OppvDeliverySubRequestParent {
/**
 *
 * Constructor to create a  OppvDeliveryGetRequest
 * @param id Unique request name
 * @param getIn OppvDeliveryObjKeyData for OppvDeliveryGetRequest
 *
 */
@JsonCreator
  public OppvDeliveryGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("OppvDelivery")OppvDeliveryObjKeyData getIn) {
    super(id, "OppvDeliveryGet");
    if (getIn != null) {
      addInput("OppvDelivery", OppvDeliveryObjKeyHelper.toMap(getIn, new HashMap(), "OppvDeliveryObjKeyData").get("OppvDeliveryObjKeyData"));
    }
  }

/**
 *
 * Retrieves the OppvDeliveryExtObjData that results from the OppvDeliveryGetRequest call
 * @return OppvDeliveryExtObjData resulting from udt call
 *
 */

  public OppvDeliveryExtObjData getOutput() {
    return OppvDeliveryExtObjHelper.fromMap(outputMap, "OppvDelivery");
  }
}
