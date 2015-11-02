/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OppvDeliveryCreateNoOpRequest.java
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
 * NoOp class used to simulate a OppvDeliveryCreateNoOpRequest Udt Request/Response
 *
 */
public class OppvDeliveryCreateNoOpRequest extends OppvDeliverySubRequestParent {
/**
 *
 * Constructor to create a   OppvDeliveryCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OppvDeliveryCreateNoOpRequest(String id, OppvDeliveryObjData noOpIn) {
    super(id, "OppvDeliveryCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("OppvDelivery", OppvDeliveryObjHelper.toMap(noOpIn, new HashMap(), "OppvDelivery").get("OppvDelivery"));
    }
  }
/**
 *
 * Retrieves the OppvDeliveryObjData passed into the constructor
 * @return Simulated response
 *
 */
  public OppvDeliveryObjData getOutput() {
    return OppvDeliveryObjHelper.fromMap(outputMap, "OppvDelivery");
  }
}
