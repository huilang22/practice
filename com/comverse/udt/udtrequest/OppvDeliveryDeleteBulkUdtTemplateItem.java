/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OppvDeliveryDeleteBulkUdtTemplateItem.java
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
 * Class used to create a OppvDeliveryDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class OppvDeliveryDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OppvDeliveryObjKeyData deleteIn;
/**
 *
 * Constructor to create a  OppvDeliveryDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OppvDeliveryDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, OppvDeliveryObjKeyData deleteInIn) {
    super(id, context, "OppvDeliveryDelete");
    deleteIn = deleteInIn;
  }

  public void translateToMap() {
    if (deleteIn != null) {
      deleteIn.resetFlags(true, true);
      addInput("OppvDelivery", OppvDeliveryObjKeyHelper.toMap(deleteIn, new HashMap(), "OppvDeliveryObjKeyData").get("OppvDeliveryObjKeyData"));
    }
  }


/**
 *
 * Sets the OppvDelivery
 * @param deleteInIn Value of the deleteIn
 *
 */

  public void setOppvDelivery(OppvDeliveryObjKeyData deleteInIn) {
    deleteIn = deleteInIn;
  }

  public void translateFromMap() {
    deleteIn = OppvDeliveryObjKeyHelper.fromMap(inputMap, "OppvDelivery");
  }

/**
 *
 * Gets the OppvDelivery
 * @return Value of the OppvDelivery
 *
 */

  public OppvDeliveryObjKeyData getOppvDelivery( ) {
    return deleteIn;
  }

}
