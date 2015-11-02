/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OppvDeliveryGetNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a OppvDeliveryGetNoOpRequest Udt Request/Response
 *
 */
public class OppvDeliveryGetNoOpRequest extends OppvDeliverySubRequestParent {
/**
 *
 * Constructor to create a   OppvDeliveryGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OppvDeliveryGetNoOpRequest(String id, OppvDeliveryExtObjData noOpIn) {
    super(id, "OppvDeliveryGetNoOpRequest");
    if (noOpIn != null) {
      addInput("OppvDelivery", OppvDeliveryExtObjHelper.toMap(noOpIn, new HashMap(), "OppvDelivery").get("OppvDelivery"));
    }
  }
/**
 *
 * Retrieves the OppvDeliveryExtObjData passed into the constructor
 * @return Simulated response
 *
 */
  public OppvDeliveryExtObjData getOutput() {
    return OppvDeliveryExtObjHelper.fromMap(outputMap, "OppvDelivery");
  }
}
