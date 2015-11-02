/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OppvDeliveryDeleteNoOpBulkUdtTemplateItem.java
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

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a OppvDeliveryDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OppvDeliveryDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OppvDeliveryObjData noOpIn;

/**
 *
 * Constructor to create a   OppvDeliveryDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OppvDeliveryDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OppvDeliveryObjData noOpInIn) {
    super(id, context, "OppvDeliveryDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OppvDelivery", OppvDeliveryObjHelper.toMap(noOpIn, new HashMap(), "OppvDelivery").get("OppvDelivery"));
    }
  }
/**
 *
 * Sets the  OppvDelivery
 * @param noOpInIn OppvDeliveryObjData to set
 *
 */
  public void setOppvDelivery(OppvDeliveryObjData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OppvDelivery passed into the constructor
 * @return Simulated response
 *
 */
  public OppvDeliveryObjData getOppvDelivery() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OppvDeliveryObjHelper.fromMap(inputMap, "OppvDelivery");
  }
}
